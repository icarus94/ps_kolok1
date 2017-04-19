/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.Mesto;
import domen.PoslovniPartner;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBUtil;

/**
 *
 * @author student
 */
public class DBBroker {

    private static DBBroker instanca;
    private final Connection connection;

    private DBBroker() throws SQLException, IOException {
        DBUtil dbUtil = new DBUtil();
        String url = dbUtil.vratiUrl();
        String username = dbUtil.vratiKorisnika();
        String password = dbUtil.vratiSifru();
        connection = DriverManager.getConnection(url, username, password);
    }

    public static DBBroker vratiDBBrokera() throws SQLException, IOException {
        if (instanca == null) {
            instanca = new DBBroker();
        }
        return instanca;
    }

    public List<Mesto> vratiSvaMesta() throws SQLException {

        List<Mesto> mesta = new ArrayList<>();
        String sql = "SELECT * FROM mesto";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            long ppt = rs.getLong("ppt");
            String naziv = rs.getString("naziv");
            Mesto mesto = new Mesto(ppt, naziv);
            mesta.add(mesto);
        }
        st.close();
        return mesta;
    }

    public void sacuvajPoslovnogPartnera(PoslovniPartner pp) throws SQLException {

        String sql = "INSERT INTO poslovni_partner VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pp.getPib());
        ps.setString(2, pp.getMaticniBroj());
        ps.setString(3, pp.getNaziv());
        ps.setString(4, pp.getUlica());
        ps.setString(5, pp.getBroj());
        ps.setLong(6, pp.getMesto().getPpt());
        ps.executeUpdate();
        ps.close();

    }

    public List<PoslovniPartner> vratiSvePoslovnePartnere() throws SQLException {
        List<PoslovniPartner> partneri = new ArrayList<>();

        String upit = "SELECT pib,maticniBroj,pp.naziv,ulica,broj,m.ppt,m.naziv AS mesto "
                + "FROM poslovni_partner AS pp INNER JOIN mesto AS m ON(pp.ppt=m.ppt)";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(upit);
        while (rs.next()) {
            String pib = rs.getString("pib");
            String maticniBroj = rs.getString("maticniBroj");
            String naziv = rs.getString("naziv");
            String ulica = rs.getString("ulica");
            String broj = rs.getString("broj");
            long ppt = rs.getLong("ppt");
            String mesto = rs.getString("mesto");
            PoslovniPartner ps = new PoslovniPartner(pib, maticniBroj, naziv, ulica, broj, new Mesto(ppt, mesto));
            partneri.add(ps);
        }
        st.close();
        return partneri;
    }

    public void izmeniPoslovnogPartnera(PoslovniPartner pp) throws SQLException {

        String upit = "UPDATE poslovni_partner set pib=?,maticniBroj=?,naziv=?,ulica=?,broj=?,ppt=?  where maticniBroj=?";
        PreparedStatement ps = connection.prepareStatement(upit);
        ps.setString(1, pp.getPib());
        ps.setString(2, pp.getMaticniBroj());
        ps.setString(3, pp.getNaziv());
        ps.setString(4, pp.getUlica());
        ps.setString(5, pp.getBroj());
        ps.setLong(6, pp.getMesto().getPpt());
        ps.setString(7, pp.getMaticniBroj());
        ps.executeUpdate();
        ps.close();

    }

    public void sacuvajListuPartnera(List<PoslovniPartner> partneri) throws SQLException, Exception {
        String upit = "INSERT INTO poslovni_partner VALUES (?,?,?,?,?,?)";

        PreparedStatement ps = connection.prepareStatement(upit);
        connection.setAutoCommit(false);

        try {
            for (PoslovniPartner poslovniPartner : partneri) {
                ps.setString(1, poslovniPartner.getPib());
                ps.setString(2, poslovniPartner.getMaticniBroj());
                ps.setString(3, poslovniPartner.getNaziv());
                ps.setString(4, poslovniPartner.getUlica());
                ps.setString(5, poslovniPartner.getBroj());
                ps.setLong(6, poslovniPartner.getMesto().getPpt());

                ps.executeUpdate();
//            try {
//                ps.executeUpdate();
//                System.out.println("Poslovni partner sa maticnim brojem: "
//                        + poslovniPartner.getMaticniBroj() + " je sacuvan");
//            } catch (Exception e) {
//                System.out.println("Poslovni partner sa maticnim brojem: "
//                        + poslovniPartner.getMaticniBroj() + " vec postoji");
//            }

            }
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw new Exception("Poslovni partneri nisu sacuvani!");
        }

        ps.close();
    }
}

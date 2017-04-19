/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.Mesto;
import domen.PoslovniPartner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class DBBroker {

    public List<Mesto> vratiSvaMesta() throws SQLException {
        List<Mesto> mesta = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/prosoft";
        String username = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Kreirana konekcija");
        String sql = "SELECT * FROM mesto";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            long ppt = rs.getLong("ppt");
            String naziv = rs.getString("naziv");
            Mesto mesto = new Mesto(ppt, naziv);
            mesta.add(mesto);
        }
        st.close();
        con.close();
        return mesta;
    }

    public void sacuvajPoslovnogPartnera(PoslovniPartner pp) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/prosoft";
        String username = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO poslovni_partner VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pp.getPib());
        ps.setString(2, pp.getMaticniBroj());
        ps.setString(3, pp.getNaziv());
        ps.setString(4, pp.getUlica());
        ps.setString(5, pp.getBroj());
        ps.setLong(6, pp.getMesto().getPpt());
        ps.executeUpdate();
        ps.close();
        con.close();

    }

    public List<PoslovniPartner> vratiSvePoslovnePartnere() throws SQLException {
        List<PoslovniPartner> partneri = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/prosoft";
        String username = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, username, password);
        String upit = "SELECT pib,maticniBroj,pp.naziv,ulica,broj,m.ppt,m.naziv AS mesto "
                + "FROM poslovni_partner AS pp INNER JOIN mesto AS m ON(pp.ppt=m.ppt)";
        Statement st = con.createStatement();
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
        con.close();
        return partneri;
    }

    public void izmeniPoslovnogPartnera(PoslovniPartner pp) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/prosoft";
        String username = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, username, password);
        String upit = "UPDATE poslovni_partner set pib=?,maticniBroj=?,naziv=?,ulica=?,broj=?,ppt=?  where maticniBroj=?";
        PreparedStatement ps = con.prepareStatement(upit);
        ps.setString(1, pp.getPib());
        ps.setString(2, pp.getMaticniBroj());
        ps.setString(3, pp.getNaziv());
        ps.setString(4, pp.getUlica());
        ps.setString(5, pp.getBroj());
        ps.setLong(6, pp.getMesto().getPpt());
        ps.setString(7, pp.getMaticniBroj());
        ps.executeUpdate();
        ps.close();
        con.close();

    }
}

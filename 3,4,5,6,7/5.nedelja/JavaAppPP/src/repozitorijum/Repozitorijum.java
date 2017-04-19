/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repozitorijum;

import db.DBBroker;
import domen.Mesto;
import domen.PoslovniPartner;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Repozitorijum {

    private static List<PoslovniPartner> partneri = new ArrayList<>();

    public static List<Mesto> vratiMesta() {
        List<Mesto> mesta = new ArrayList<>();
        //        mesta.add(new Mesto(11000l, "Beograd"));
//        mesta.add(new Mesto(35000l, "Jagodina"));
//        mesta.add(new Mesto(36000l, "Kraljevo"));

        try {
            mesta = new DBBroker().vratiSvaMesta();
        } catch (SQLException ex) {
            Logger.getLogger(Repozitorijum.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesta;

    }

    public static void sacuvajPoslovnogPartnera(PoslovniPartner poslovniPartner) {
//         partneri.add(poslovniPartner);
        try {
            new DBBroker().sacuvajPoslovnogPartnera(poslovniPartner);

        } catch (SQLException ex) {
            Logger.getLogger(Repozitorijum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<PoslovniPartner> vratiPoslovnePartnere() {
//        return partneri;
        try {
            return new DBBroker().vratiSvePoslovnePartnere();
        } catch (SQLException ex) {
            Logger.getLogger(Repozitorijum.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

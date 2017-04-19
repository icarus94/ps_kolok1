/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repozitorijum;

import db.DBBroker;
import domen.Mesto;
import domen.PoslovniPartner;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Kontroler {

    public static List<Mesto> vratiMesta() {

        try {
            return DBBroker.vratiDBBrokera().vratiSvaMesta();
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public static void sacuvajPoslovnogPartnera(PoslovniPartner poslovniPartner) {

        try {
            DBBroker.vratiDBBrokera().sacuvajPoslovnogPartnera(poslovniPartner);

        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<PoslovniPartner> vratiPoslovnePartnere() {

        try {
            return DBBroker.vratiDBBrokera().vratiSvePoslovnePartnere();
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void sacuvajListuPoslovnihPartnera(List<PoslovniPartner> partneri) throws Exception {
        try {
            DBBroker.vratiDBBrokera().sacuvajListuPartnera(partneri);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }
}

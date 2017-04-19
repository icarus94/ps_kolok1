/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import domen.Mesto;


/**
 *
 * @author student
 */
public class Start {
    public static void main(String[] args) {
        Mesto mesto;
        mesto= new Mesto();
        mesto.setPtt(11000);
        mesto.setNaziv("Beograd");
        System.out.println(mesto.getNaziv()+"\t"+mesto.getPtt());
        System.out.println(mesto);
    }
}

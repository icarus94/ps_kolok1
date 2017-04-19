/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author student
 */
public class PoslovniPartner {
    private int poslovniPartnerID;
    private String maticniBroj;
    private String pib;
    private String naziv;
    private String telefon;
    private Adresa adresa;

    public PoslovniPartner() {
    }

    public PoslovniPartner(int poslovniPartnerID, String maticniBroj, String pib, String naziv, String telefon, Adresa adresa) {
        this.poslovniPartnerID = poslovniPartnerID;
        this.maticniBroj = maticniBroj;
        this.pib = pib;
        this.naziv = naziv;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public int getPoslovniPartnerID() {
        return poslovniPartnerID;
    }

    public void setPoslovniPartnerID(int poslovniPartnerID) {
        this.poslovniPartnerID = poslovniPartnerID;
    }

    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Sifra poslovnog partnera: "+poslovniPartnerID+", Mati;ni broj: "+maticniBroj+", PIB: "+pib+", Naziv: "+naziv+", Telefon: "+telefon+", Adresa: "+adresa;
    }
    
    
}

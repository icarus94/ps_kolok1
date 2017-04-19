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
public class Adresa {

    private String ulica;
    private String broj;
    private Mesto mesto;

    public Adresa() {
    }

    public Adresa(String ulica, String broj, Mesto mesto) {
        this.ulica = ulica;
        this.broj = broj;
        this.mesto = mesto;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        return "Ulica: " + ulica + ", Broj: " + broj + ", Mesto: " + mesto;
    }

}

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
public class Mesto {
    private int pttBroj;
    private String naziv;

    public Mesto() {
    }

    public Mesto(int pttBroj, String naziv) {
        this.pttBroj = pttBroj;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getPttBroj() {
        return pttBroj;
    }

    public void setPttBroj(int pttBroj) {
        this.pttBroj = pttBroj;
    }

    @Override
    public String toString() {
        return "PTT broj: "+pttBroj+", Naziv: "+naziv;
    }
    
    
    
}

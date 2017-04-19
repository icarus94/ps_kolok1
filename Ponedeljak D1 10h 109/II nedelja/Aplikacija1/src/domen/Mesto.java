package domen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public class Mesto {

    private long ptt;
    private String naziv;

    public Mesto() {
        ptt = 0;
        naziv = "n/a";
    }

    public Mesto(long ptt, String naziv) {
        this.ptt = ptt;
        this.naziv = naziv;
    }

    /**
     * @return the ptt
     */
    public long getPtt() {
        return ptt;
    }

    /**
     * @param ptt the ptt to set
     */
    public void setPtt(long ptt) {
        this.ptt = ptt;
    }

    /**
     * @return the naziv
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * @param naziv the naziv to set
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
           return getNaziv()+"\t"+getPtt();
    }
    
    
    
}

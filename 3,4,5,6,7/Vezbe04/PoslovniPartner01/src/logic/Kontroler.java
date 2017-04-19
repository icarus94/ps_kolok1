/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import model.Mesto;
import model.PoslovniPartner;

/**
 *
 * @author student
 */
public class Kontroler {
    private static Kontroler instance;
    public static Kontroler getInstance(){
        if(instance==null){
            instance=new Kontroler();
        }
        return instance;
    }
    
    private List<Mesto> mesta;
    private List<PoslovniPartner> poslovniPartneri;
    
    private Kontroler(){
        mesta=new ArrayList<>();
        mesta.add(new Mesto(85330, "Kotor"));
        mesta.add(new Mesto(11000, "Beograd"));
        mesta.add(new Mesto(21000, "Novi Sad"));
        poslovniPartneri=new ArrayList<>();
    }
    
    public void dodajNovoMesto(Mesto mesto){
        mesta.add(mesto);
        System.out.println(mesta);
    }
    
    public List<Mesto> vratiSvaMesta(){
        return mesta;
    }
    
    public void dodajNovogPoslovnogPartnera(PoslovniPartner poslovniPartner){
        poslovniPartneri.add(poslovniPartner);
        System.out.println(poslovniPartneri);
    }
}

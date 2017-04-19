/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.List;
import model.Mesto;

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
    
    private Kontroler(){
        mesta=new ArrayList<>();
        mesta.add(new Mesto(85330, "Kotor"));
        mesta.add(new Mesto(11000, "Beograd"));
        mesta.add(new Mesto(21000, "Novi Sad"));
    }
    
    public void dodajNovoMesto(Mesto mesto){
        mesta.add(mesto);
        System.out.println(mesta);
    }
}

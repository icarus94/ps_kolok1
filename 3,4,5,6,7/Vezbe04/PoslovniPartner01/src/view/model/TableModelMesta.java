/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Mesto;

/**
 *
 * @author student
 */
public class TableModelMesta extends AbstractTableModel{

    private List<Mesto> mesta;
    private String[] columnNames={"Postanski broj", "Naziv"};
    
    public TableModelMesta(List<Mesto> mesta){
        this.mesta=mesta;
    }
    
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public int getRowCount() {
        if(mesta!=null){
            return mesta.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        //return 2;
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mesto mesto=mesta.get(rowIndex);
        switch (columnIndex){
            case 0: return mesto.getPttBroj();
            case 1: return mesto.getNaziv();
            default: return "N/A";
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import logic.Kontroler;
import model.Adresa;
import model.Mesto;
import model.PoslovniPartner;

/**
 *
 * @author student
 */
public class JPanelUnosPoslovniPartner extends javax.swing.JPanel {

    /**
     * Creates new form JPanelPoslovniPartner
     */
    public JPanelUnosPoslovniPartner() {
        initComponents();
        popuniKombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPoslovniPartnerID = new javax.swing.JLabel();
        jLabelMaticniBroj = new javax.swing.JLabel();
        jLabelPIB = new javax.swing.JLabel();
        jLabelNaziv = new javax.swing.JLabel();
        jLabelTelefon = new javax.swing.JLabel();
        jLabelUlica = new javax.swing.JLabel();
        jLabelBroj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPoslovniPartnerID = new javax.swing.JTextField();
        jTextFieldMaticniBroj = new javax.swing.JTextField();
        jTextFieldPIB = new javax.swing.JTextField();
        jTextFieldNaziv = new javax.swing.JTextField();
        jTextFieldTelefon = new javax.swing.JTextField();
        jTextFieldUlica = new javax.swing.JTextField();
        jTextFieldBroj = new javax.swing.JTextField();
        jComboBoxMesta = new javax.swing.JComboBox<>();
        jButtonSacuvaj = new javax.swing.JButton();
        jButtonOdustani = new javax.swing.JButton();

        jLabelPoslovniPartnerID.setText("Sifra:");

        jLabelMaticniBroj.setText("Maticni broj:");

        jLabelPIB.setText("PIB:");

        jLabelNaziv.setText("Naziv:");

        jLabelTelefon.setText("Telefon:");

        jLabelUlica.setText("Ulica: ");

        jLabelBroj.setText("Broj: ");

        jLabel1.setText("Mesto:");

        jComboBoxMesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonSacuvaj.setText("Sacuvaj");
        jButtonSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacuvajActionPerformed(evt);
            }
        });

        jButtonOdustani.setText("Odustani");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPoslovniPartnerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMaticniBroj, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jLabelPIB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUlica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBroj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPoslovniPartnerID)
                            .addComponent(jTextFieldMaticniBroj)
                            .addComponent(jTextFieldPIB)
                            .addComponent(jTextFieldNaziv)
                            .addComponent(jTextFieldTelefon)
                            .addComponent(jTextFieldUlica)
                            .addComponent(jTextFieldBroj)
                            .addComponent(jComboBoxMesta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 228, Short.MAX_VALUE)
                        .addComponent(jButtonSacuvaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOdustani)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPoslovniPartnerID)
                    .addComponent(jTextFieldPoslovniPartnerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaticniBroj)
                    .addComponent(jTextFieldMaticniBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPIB)
                    .addComponent(jTextFieldPIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNaziv)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefon)
                    .addComponent(jTextFieldTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUlica)
                    .addComponent(jTextFieldUlica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBroj)
                    .addComponent(jTextFieldBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxMesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSacuvaj)
                    .addComponent(jButtonOdustani))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacuvajActionPerformed
        try{    
            PoslovniPartner pp=new PoslovniPartner();
            pp.setPoslovniPartnerID(Integer.parseInt(jTextFieldPoslovniPartnerID.getText()));
            pp.setMaticniBroj(jTextFieldMaticniBroj.getText());
            pp.setPib(jTextFieldPIB.getText());
            pp.setNaziv(jTextFieldNaziv.getText());
            pp.setTelefon(jTextFieldTelefon.getText());
            Adresa adresa=new Adresa();
            adresa.setUlica(jTextFieldUlica.getText());
            adresa.setBroj(jTextFieldBroj.getText());
            adresa.setMesto((Mesto)jComboBoxMesta.getSelectedItem());
            pp.setAdresa(adresa);
            Kontroler.getInstance().dodajNovogPoslovnogPartnera(pp);
            JOptionPane.showMessageDialog(this, "Uspesno sacuvano!", "Cuvanje poslovnog partnera", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception nfe){
            nfe.printStackTrace();
            JOptionPane.showMessageDialog(this, "GRESKA, neuspesno sacuvano!", "Cuvanje poslovnog partnera", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSacuvajActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOdustani;
    private javax.swing.JButton jButtonSacuvaj;
    private javax.swing.JComboBox<String> jComboBoxMesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBroj;
    private javax.swing.JLabel jLabelMaticniBroj;
    private javax.swing.JLabel jLabelNaziv;
    private javax.swing.JLabel jLabelPIB;
    private javax.swing.JLabel jLabelPoslovniPartnerID;
    private javax.swing.JLabel jLabelTelefon;
    private javax.swing.JLabel jLabelUlica;
    private javax.swing.JTextField jTextFieldBroj;
    private javax.swing.JTextField jTextFieldMaticniBroj;
    private javax.swing.JTextField jTextFieldNaziv;
    private javax.swing.JTextField jTextFieldPIB;
    private javax.swing.JTextField jTextFieldPoslovniPartnerID;
    private javax.swing.JTextField jTextFieldTelefon;
    private javax.swing.JTextField jTextFieldUlica;
    // End of variables declaration//GEN-END:variables

private void popuniKombo(){
    List<Mesto> mesta=Kontroler.getInstance().vratiSvaMesta();
    //jComboBoxMesta.removeAllItems();
    //for (Mesto mesto : mesta) {
    //   jComboBoxMesta.addItem(mesto);
    //}
    
    DefaultComboBoxModel model=new DefaultComboBoxModel(mesta.toArray());
    jComboBoxMesta.setModel(model);
}


}

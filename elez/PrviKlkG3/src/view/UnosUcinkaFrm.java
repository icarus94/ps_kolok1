/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import domen.Radnik;
import domen.Ucinak;
import domen.VrstaPosla;
import exception.ValidacijaException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.bind.ValidationException;
import model.UcinakTableModel;

/**
 *
 * @author elezs
 */
public class UnosUcinkaFrm extends javax.swing.JFrame {

    /**
     * Creates new form UnosUcinkaFrm
     */
    public UnosUcinkaFrm() {
        initComponents();
        popuniCBRadnik();
        popuniCBVrstaPosla();
        srediTabelu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxVrstaPosla = new javax.swing.JComboBox<>();
        jComboBoxRadnik = new javax.swing.JComboBox<>();
        jTextFieldBrSati = new javax.swing.JTextField();
        jTextFieldDatum = new javax.swing.JTextField();
        jButtonDodajUcinak = new javax.swing.JButton();
        jButtonObrisiUcinak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUcinak = new javax.swing.JTable();
        jButtonSacuvajUcinak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vrsta posla:");

        jLabel2.setText("Radnik:");

        jLabel3.setText("Broj sati:");

        jLabel4.setText("Datum(dd.MM.yyyy):");

        jTextFieldBrSati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBrSatiActionPerformed(evt);
            }
        });

        jButtonDodajUcinak.setText("Dodaj ucinak");
        jButtonDodajUcinak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajUcinakActionPerformed(evt);
            }
        });

        jButtonObrisiUcinak.setText("Obrisi ucinak");
        jButtonObrisiUcinak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiUcinakActionPerformed(evt);
            }
        });

        jTableUcinak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableUcinak);

        jButtonSacuvajUcinak.setText("Sacuvaj ucinak");
        jButtonSacuvajUcinak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacuvajUcinakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonDodajUcinak)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonObrisiUcinak))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(62, 62, 62)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxVrstaPosla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxRadnik, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldBrSati, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSacuvajUcinak)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxVrstaPosla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldBrSati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDodajUcinak)
                    .addComponent(jButtonObrisiUcinak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSacuvajUcinak)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBrSatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBrSatiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBrSatiActionPerformed

    private void jButtonDodajUcinakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajUcinakActionPerformed
        // TODO add your handling code here:
        VrstaPosla vp = (VrstaPosla) jComboBoxVrstaPosla.getSelectedItem();
        Radnik r = (Radnik) jComboBoxRadnik.getSelectedItem();
        String brojSati = jTextFieldBrSati.getText();
        String datum = jTextFieldDatum.getText();
        try {
            Ucinak u = kreirajUcinak(vp, r, brojSati, datum);
            UcinakTableModel utm = (UcinakTableModel) jTableUcinak.getModel();
            utm.ubaciUListu(u);
        } catch (ValidationException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Greska!", JOptionPane.WARNING_MESSAGE);
        } catch (ValidacijaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Greska!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDodajUcinakActionPerformed

    private void jButtonObrisiUcinakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiUcinakActionPerformed
        // TODO add your handling code here:
        int red = jTableUcinak.getSelectedRow();
        if(red == -1){
            JOptionPane.showConfirmDialog(rootPane, "Izaberite red u tabeli");
        }else{
            UcinakTableModel utm = (UcinakTableModel) jTableUcinak.getModel();
            utm.obrisiRed(red);
        }
    }//GEN-LAST:event_jButtonObrisiUcinakActionPerformed

    private void jButtonSacuvajUcinakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacuvajUcinakActionPerformed
        // TODO add your handling code here:
        UcinakTableModel utm = (UcinakTableModel) jTableUcinak.getModel();
        List<Ucinak> ucinci = utm.vratiListu();
        boolean uspesan = Controller.getInstance().sacuvajListu(ucinci);
        if(uspesan){
            JOptionPane.showMessageDialog(rootPane, "Sve ful");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Sranje si");
        }
    }//GEN-LAST:event_jButtonSacuvajUcinakActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UnosUcinkaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnosUcinkaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnosUcinkaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnosUcinkaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnosUcinkaFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodajUcinak;
    private javax.swing.JButton jButtonObrisiUcinak;
    private javax.swing.JButton jButtonSacuvajUcinak;
    private javax.swing.JComboBox<Radnik> jComboBoxRadnik;
    private javax.swing.JComboBox<VrstaPosla> jComboBoxVrstaPosla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUcinak;
    private javax.swing.JTextField jTextFieldBrSati;
    private javax.swing.JTextField jTextFieldDatum;
    // End of variables declaration//GEN-END:variables

    private void popuniCBRadnik() {
        List<Radnik> radnici;
        try {
            radnici = Controller.getInstance().popuniRadnike();
            for(Radnik r : radnici){
                jComboBoxRadnik.addItem(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UnosUcinkaFrm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(rootPane, "Greska pri ucitavanju radnika");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UnosUcinkaFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popuniCBVrstaPosla() {
        try {
            List<VrstaPosla> vrstePosla = Controller.getInstance().popuniVrstePosla();
            for (VrstaPosla vrstaPosla : vrstePosla) {
                jComboBoxVrstaPosla.addItem(vrstaPosla);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UnosUcinkaFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UnosUcinkaFrm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(rootPane, "Greska pri ucitavanju vrste posla");
        }
    }

    private void srediTabelu() {
        UcinakTableModel utm = new UcinakTableModel();
        jTableUcinak.setModel(utm);
    }
        public Ucinak kreirajUcinak(VrstaPosla vp, Radnik r, String brojSati, String datum) throws ValidationException {
        if(brojSati == null|| datum == null){
            throw new ValidationException("Sva polja su obavezna!");
        }
        int brSati;
        
        try{
            brSati= Integer.parseInt(brojSati);
        }catch(Exception exc){
            throw new ValidationException("Morate uneti ceo broj kao broj sati");
        }
        Date dat;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            dat = sdf.parse(datum);
            String provera = sdf.format(dat);
            if(!provera.equals(datum)){
                throw new ValidationException("Datum nije dobar");
            }
        } catch (ParseException ex) {
            throw new ValidationException("Morate uneti datum u formatu dd.MM.yyyy");
        }
        return new Ucinak(-1, brSati, dat, r, vp);
    }
}
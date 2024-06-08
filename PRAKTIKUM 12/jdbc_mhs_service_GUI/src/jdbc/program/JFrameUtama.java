/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc.program;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
/**
 *
 * @author Azzam
 */
public class JFrameUtama extends javax.swing.JFrame {

    MysqlMahasiswaService service;
    DefaultListModel<String> dlmID;
    DefaultListModel<String> dlmlNama;
    List<Mahasiswa> listMhs = new ArrayList<>();
    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
        service = new MysqlMahasiswaService();
        dlmID = new DefaultListModel<>();
        dlmlNama = new DefaultListModel<>();
        jListID.setModel(dlmID);
        jListNAMA.setModel(dlmlNama);
        jLabelIndeksReset.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListID = new javax.swing.JList<>();
        jLabelID = new javax.swing.JLabel();
        jLabelNAMA = new javax.swing.JLabel();
        jLabelKelolaDataMahasiswa = new javax.swing.JLabel();
        jButtonAmbilSemuaData = new javax.swing.JButton();
        jButtonTambahkan = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonResetIndeks = new javax.swing.JButton();
        jLabelTambahNama = new javax.swing.JLabel();
        jTextFieldTambahNama = new javax.swing.JTextField();
        jTextFieldEditID = new javax.swing.JTextField();
        jTextFieldHapusID = new javax.swing.JTextField();
        jTextFieldEditNama = new javax.swing.JTextField();
        jTextFieldHapusNama = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListNAMA = new javax.swing.JList<>();
        jLabelIndeksReset = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListID.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListID);

        jLabelID.setText("ID");

        jLabelNAMA.setText("NAMA");

        jLabelKelolaDataMahasiswa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelKelolaDataMahasiswa.setText("Kelola Data Mahasiswa");

        jButtonAmbilSemuaData.setText("Ambil Semua Data");
        jButtonAmbilSemuaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmbilSemuaDataActionPerformed(evt);
            }
        });

        jButtonTambahkan.setText("Tambahkan");
        jButtonTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahkanActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonResetIndeks.setText("Reset indeks");
        jButtonResetIndeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetIndeksActionPerformed(evt);
            }
        });

        jLabelTambahNama.setText("nama:");

        jTextFieldEditID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditIDActionPerformed(evt);
            }
        });

        jListNAMA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListNAMA);

        jLabelIndeksReset.setText("Index di reset ke 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelID)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNAMA))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTambahNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldEditID, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jTextFieldHapusID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldHapusNama)
                            .addComponent(jTextFieldEditNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonHapus)
                            .addComponent(jButtonEdit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTambahNama)
                            .addComponent(jButtonTambahkan)
                            .addComponent(jButtonAmbilSemuaData)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonResetIndeks)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelIndeksReset))
                            .addComponent(jLabelKelolaDataMahasiswa))
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNAMA)
                            .addComponent(jLabelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelKelolaDataMahasiswa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAmbilSemuaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTambahNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTambahNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButtonTambahkan)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdit))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHapusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHapusNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonHapus))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonResetIndeks)
                            .addComponent(jLabelIndeksReset))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahkanActionPerformed
        Mahasiswa mhs = service.makeMhsObject();
        mhs.setId(listMhs.size() + 1);
        mhs.setNama(jTextFieldTambahNama.getText());
        service.add(mhs);
        clearTextFields();
        jButtonAmbilSemuaDataActionPerformed(evt);
    }//GEN-LAST:event_jButtonTambahkanActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        int id = Integer.parseInt(jTextFieldEditID.getText());
        Mahasiswa mhs = service.getById(id);
        mhs.setNama(jTextFieldEditNama.getText());
        service.update(mhs);
        clearTextFields();
        jButtonAmbilSemuaDataActionPerformed(evt);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextFieldEditIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditIDActionPerformed

    private void jButtonAmbilSemuaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmbilSemuaDataActionPerformed
        listMhs = service.getAll();
        dlmID.clear();
        dlmlNama.clear();
        for (Mahasiswa mhs : listMhs) {
            dlmID.addElement(String.valueOf(mhs.getId()));
            dlmlNama.addElement(mhs.getNama());
        }
        jLabelIndeksReset.setText("");
    }//GEN-LAST:event_jButtonAmbilSemuaDataActionPerformed

    private void jButtonResetIndeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetIndeksActionPerformed
        service.indexReset();
        jLabelIndeksReset.setText("Indeks di reset ke 0");
    }//GEN-LAST:event_jButtonResetIndeksActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        int id = Integer.parseInt(jTextFieldHapusID.getText());
        service.delete(id);
        clearTextFields();
        jButtonAmbilSemuaDataActionPerformed(evt);
    }//GEN-LAST:event_jButtonHapusActionPerformed
    private void clearTextFields() {
        jTextFieldTambahNama.setText("");
        jTextFieldEditID.setText("");
        jTextFieldEditNama.setText("");
        jTextFieldHapusID.setText("");
        jTextFieldHapusNama.setText("");
    }
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
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAmbilSemuaData;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonResetIndeks;
    private javax.swing.JButton jButtonTambahkan;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIndeksReset;
    private javax.swing.JLabel jLabelKelolaDataMahasiswa;
    private javax.swing.JLabel jLabelNAMA;
    private javax.swing.JLabel jLabelTambahNama;
    private javax.swing.JList<String> jListID;
    private javax.swing.JList<String> jListNAMA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldEditID;
    private javax.swing.JTextField jTextFieldEditNama;
    private javax.swing.JTextField jTextFieldHapusID;
    private javax.swing.JTextField jTextFieldHapusNama;
    private javax.swing.JTextField jTextFieldTambahNama;
    // End of variables declaration//GEN-END:variables
}
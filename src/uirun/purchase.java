/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uirun;

import java.sql.*;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class purchase extends javax.swing.JFrame {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/medicine";
    static final String USER = "root";
    static final String PASS = "";

    public purchase() {
        initComponents();
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
        jTextPane1 = new javax.swing.JTextPane();
        appName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        search = new java.awt.TextField();
        jSeparator2 = new javax.swing.JSeparator();
        Flixotide = new javax.swing.JPanel();
        medicineName = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        medName = new javax.swing.JTextField();
        medicineName1 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        medicineName2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appName.setFont(new java.awt.Font("Sitka Small", 1, 40)); // NOI18N
        appName.setText(" Laurex Pharma");
        appName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appNameMouseClicked(evt);
            }
        });

        search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Flixotide.setBackground(new java.awt.Color(153, 153, 153));

        medicineName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        medicineName.setText("Medicine Name: ");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Purchase");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        medName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNameActionPerformed(evt);
            }
        });

        medicineName1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        medicineName1.setText("Quantity:");

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        medicineName2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        medicineName2.setText("Purchase Now!!!");

        javax.swing.GroupLayout FlixotideLayout = new javax.swing.GroupLayout(Flixotide);
        Flixotide.setLayout(FlixotideLayout);
        FlixotideLayout.setHorizontalGroup(
            FlixotideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlixotideLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jButton6)
                .addGap(44, 44, 44)
                .addComponent(cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FlixotideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FlixotideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FlixotideLayout.createSequentialGroup()
                        .addComponent(medicineName2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FlixotideLayout.createSequentialGroup()
                        .addGroup(FlixotideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicineName)
                            .addComponent(medicineName1))
                        .addGap(18, 18, 18)
                        .addGroup(FlixotideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))))
        );
        FlixotideLayout.setVerticalGroup(
            FlixotideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlixotideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medicineName2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(FlixotideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineName)
                    .addComponent(medName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FlixotideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineName1)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(FlixotideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(jButton6))
                .addGap(39, 39, 39))
        );

        jLabel2.setFont(new java.awt.Font("Wide Latin", 1, 48)); // NOI18N
        jLabel2.setText("Medicines");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Flixotide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Flixotide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        search.getText();
        search.setText("");
    }//GEN-LAST:event_searchActionPerformed

    private void medNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medNameActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void appNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appNameMouseClicked
        quantity.setText("");
        medName.setText("");
        String identity = null;
        String retrieveQueryPharmacist = String.format("Select pharmaIdentity from tblPharma");
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rsAccount = stmt.executeQuery(retrieveQueryPharmacist);
            rsAccount.next();
            identity = rsAccount.getString("pharmaIdentity");
            if (identity.equals("1")) {
                new dashboardPharmacist().setVisible(true);
                this.setVisible(false);
            } else {
                new dashboard().setVisible(true);
                this.setVisible(false);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_appNameMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        quantity.setText("");
        medName.setText("");
        String retrieveQueryPharmacist = String.format("Select pharmaIdentity from tblPharma");
        String identity = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(retrieveQueryPharmacist);
            rs.next();
            identity = rs.getString("pharmaIdentity");
            if (identity.equals("1")) {
                new dashboardPharmacist().setVisible(true);
                this.setVisible(false);
            } else {
                new dashboard().setVisible(true);
                this.setVisible(false);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_cancelMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        String medicineName = medName.getText();
        int quant = Integer.parseInt(quantity.getText());
        System.out.println(quant);
        String medicName = null;
        int updateQuantity = 0;
        String totalQuant = null;
        String idMed = null;
        String identity = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String retrieveMed = String.format("Select idMedicine, medicineName, quantity from tblMedicine where medicineName='%s'", medicineName);
        String retrieveQueryPharmacist = String.format("Select pharmaIdentity from tblPharma");
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rsAccount = stmt.executeQuery(retrieveMed);
            while (rsAccount.next()) {
                medicName = rsAccount.getString("medicineName");
                totalQuant = rsAccount.getString("quantity");
                idMed = rsAccount.getString("idMedicine");
                System.out.println(idMed);
            }
            if (medicineName.equalsIgnoreCase(medicName)) {
                updateQuantity = (Integer.parseInt(totalQuant) - quant);
                if (Integer.parseInt(totalQuant) > quant) {
                    System.out.println(updateQuantity);
                    stmt.executeUpdate("UPDATE tblMedicine SET quantity='" + updateQuantity + "' where medicineName='" + medicineName + "'");
                    stmt.executeUpdate(String.format("INSERT INTO tblpurchase(idMedicine,quantity) VALUES ('%s','%d')", idMed, quant));
                    stmt.executeUpdate(String.format("INSERT INTO tblAllPurchase(idMedicine,quantityPurchased,date) VALUES ('%s','%d','%s')", idMed, quant, dtf.format(now)));

                    //not final...
                    ResultSet rs = stmt.executeQuery(retrieveQueryPharmacist);
                    rs.next();
                    identity = rs.getString("pharmaIdentity");
                    if (identity.equals("1")) {
                        new dashboardPharmacist().setVisible(true);
                        this.setVisible(false);
                    } else {
                        new dashboard().setVisible(true);
                        this.setVisible(false);
                    }
                    conn.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Medicine!!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Medicine Available!!!");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton6MouseClicked

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
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Flixotide;
    private javax.swing.JLabel appName;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField medName;
    private javax.swing.JLabel medicineName;
    private javax.swing.JLabel medicineName1;
    private javax.swing.JLabel medicineName2;
    private javax.swing.JTextField quantity;
    private java.awt.TextField search;
    // End of variables declaration//GEN-END:variables
}

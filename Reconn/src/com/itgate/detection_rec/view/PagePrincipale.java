/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgate.detection_rec.view;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BoxLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


/**
 *
 * @author TOSHIBA
 */
public class PagePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form test2
     */
    javax.swing.JPanel panelHaut = new JPanel();
    javax.swing.JPanel panelBas = new JPanel();
         
    public PagePrincipale() {
        initComponents();
         //this.setLayout(new BorderLayout());
         //add("North",jSplitPane1);
         //add("South", panelBas); 
////////////////////////////////////////////////////////////////////////////////////////////////////////


        jSplitPane1 = new javax.swing.JSplitPane();
        panelGauche = new javax.swing.JPanel();
        btnCompte = new javax.swing.JButton();
        btnHistorique = new javax.swing.JButton();
        btnCamera = new javax.swing.JButton();
        btnParametre = new javax.swing.JButton();
        btnDeconnecter = new javax.swing.JButton();
        btnDeconnecter1 = new javax.swing.JButton();
        panelDroite = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCompte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user64.png"))); // NOI18N
        btnCompte.setText("Compte");
        btnCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompteActionPerformed(evt);
            }
        });

        btnHistorique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historique64.png"))); // NOI18N
        btnHistorique.setText("Historique");
        btnHistorique.setPreferredSize(new java.awt.Dimension(137, 73));
        btnHistorique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriqueActionPerformed(evt);
            }
        });

        btnCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camera64.png"))); // NOI18N
        btnCamera.setText("Camera");
        btnCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCameraActionPerformed(evt);
            }
        });

        btnParametre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/box64.png"))); // NOI18N
        btnParametre.setText("Parametre");
        btnParametre.setPreferredSize(new java.awt.Dimension(137, 73));
        btnParametre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParametreActionPerformed(evt);
            }
        });

        btnDeconnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deconnecter.png"))); // NOI18N
        btnDeconnecter.setText("Déconnecter");
        btnDeconnecter.setPreferredSize(new java.awt.Dimension(137, 73));
        btnDeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnecterActionPerformed(evt);
            }
        });

        btnDeconnecter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deconnecter.png"))); // NOI18N
        btnDeconnecter1.setText("Déconnecter");
        btnDeconnecter1.setPreferredSize(new java.awt.Dimension(137, 73));
        btnDeconnecter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnecter1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGaucheLayout = new javax.swing.GroupLayout(panelGauche);
        panelGauche.setLayout(panelGaucheLayout);
        panelGaucheLayout.setHorizontalGroup(
            panelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGaucheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHistorique, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(btnCompte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCamera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnParametre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeconnecter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeconnecter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelGaucheLayout.setVerticalGroup(
            panelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGaucheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCompte)
                .addGap(18, 18, 18)
                .addComponent(btnHistorique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCamera)
                .addGap(18, 18, 18)
                .addComponent(btnParametre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeconnecter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(panelGauche);

        panelDroite.setBackground(new java.awt.Color(255, 255, 255));
        panelDroite.setForeground(new java.awt.Color(255, 255, 255));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.jpg"))); // NOI18N

        javax.swing.GroupLayout panelDroiteLayout = new javax.swing.GroupLayout(panelDroite);
        panelDroite.setLayout(panelDroiteLayout);
        panelDroiteLayout.setHorizontalGroup(
            panelDroiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDroiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panelDroiteLayout.setVerticalGroup(
            panelDroiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDroiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(panelDroite);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
////////////////////////////////////////////////////////////////////////////////////////////////////////
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        JStatusBar statusBar = new JStatusBar();
        JLabel leftLabel = new JLabel("Application en cours ...");
        statusBar.setLeftComponent(leftLabel);

        final JLabel dateLabel = new JLabel();
        dateLabel.setHorizontalAlignment(JLabel.CENTER);
        statusBar.addRightComponent(dateLabel);

        final JLabel timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        statusBar.addRightComponent(timeLabel);
        jSplitPane1.setSize(getWidth(), 640);
        contentPane.add(statusBar, BorderLayout.SOUTH);
        timerThread = new TimerThread(dateLabel, timeLabel);
        timerThread.start();
        this.setSize(1150, 725);
    }

    private void btnCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompteActionPerformed
       
        panelDroite.removeAll();
        panelDroite.updateUI();
       jSplitPane1.setRightComponent(new PanelCompte());
     
    }//GEN-LAST:event_btnCompteActionPerformed

    private void btnHistoriqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriqueActionPerformed
        // TODO add your handling code here:
        panelDroite.removeAll();
        panelDroite.updateUI();
        //jPanel1.add();
        jSplitPane1.setRightComponent(new PanelHisorique());
    
    }//GEN-LAST:event_btnHistoriqueActionPerformed

    private void btnCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCameraActionPerformed
        // TODO add your handling code here:
        panelDroite.removeAll();
        panelDroite.updateUI();
        //jPanel1.add();
        jSplitPane1.setRightComponent(new PanelCamera());
    
    }//GEN-LAST:event_btnCameraActionPerformed

    private void btnParametreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParametreActionPerformed
        // TODO add your handling code here:
        panelDroite.removeAll();
        panelDroite.updateUI();
        //jPanel1.add();
        jSplitPane1.setRightComponent(new PanelParametre());
    
    }//GEN-LAST:event_btnParametreActionPerformed

    private void btnDeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnecterActionPerformed
        // TODO add your handling code here:
             int r = JOptionPane.showConfirmDialog(null, "Vous allez vous déconnecter de l'application", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
                System.out.println(" " + r);
                if (r == 0) {
                    this.setVisible(false);
                    new Login().setVisible(true);
                }
    }//GEN-LAST:event_btnDeconnecterActionPerformed

    private void btnDeconnecter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnecter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeconnecter1ActionPerformed

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 725));

        jMenu1.setText("File");

        jMenu3.setText("open");
        jMenu1.add(jMenu3);

        jMenu4.setText("close");
        jMenu1.add(jMenu4);

        jMenu5.setText("save");
        jMenu1.add(jMenu5);

        jMenu6.setText("Exit");
        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("options");

        jMenu7.setText("Enseignant");

        jMenuItem4.setText("contractuel");
        jMenu7.add(jMenuItem4);

        jMenuItem1.setText("Doctorant");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenu2.add(jMenu7);

        jMenu8.setText("personnels");

        jMenuItem3.setText("concierge");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenuItem2.setText("Administration");
        jMenu8.add(jMenuItem2);

        jMenu2.add(jMenu8);

        jMenu9.setText("Etudiant");

        jMenuItem5.setText("1er année");
        jMenu9.add(jMenuItem5);

        jMenuItem6.setText("2éme année");
        jMenu9.add(jMenuItem6);

        jMenuItem7.setText("3éme année");
        jMenu9.add(jMenuItem7);

        jMenuItem8.setText("4 éme année");
        jMenu9.add(jMenuItem8);

        jMenu2.add(jMenu9);

        jMenuBar1.add(jMenu2);

        jMenu10.setText("help");

        jMenu11.setText("About");
        jMenu10.add(jMenu11);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagePrincipale().setVisible(true);
            }
        });
    }

        protected TimerThread timerThread;

            private javax.swing.JLabel back;
    private javax.swing.JButton btnCamera;
    private javax.swing.JButton btnCompte;
    private javax.swing.JButton btnDeconnecter;
    private javax.swing.JButton btnDeconnecter1;
    private javax.swing.JButton btnHistorique;
    private javax.swing.JButton btnParametre;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel panelDroite;
    private javax.swing.JPanel panelGauche;
  
        
        
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}

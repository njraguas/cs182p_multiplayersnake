/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snakeUI;

import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Asus
 */
public class MainMenu extends javax.swing.JFrame {
    
    FontChooser f = new FontChooser();
    /**
     * Creates new form Snake_UI
     */
    public MainMenu() {
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

        mainPanel = new javax.swing.JPanel();
        startLabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multiplayer Snake: Main Menu");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(0, 33, 0));
        mainPanel.setFocusTraversalPolicyProvider(true);
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        startLabel.setFont(f.returnFont("joystix monospace.ttf", 21f));
        startLabel.setForeground(new java.awt.Color(0, 238, 0));
        startLabel.setText("<Press Enter To Start>");

        Title.setFont(f.returnFont("ARCADECLASSIC.ttf", 60f));
        Title.setForeground(new java.awt.Color(0, 238, 0));
        Title.setText("Multiplayer Snake");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/snakeUI/logo.png"))); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 295, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(289, 289, 289))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Title))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(startLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(Title)
                .addGap(75, 75, 75)
                .addComponent(startLabel)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:    
        blinkText();
    }//GEN-LAST:event_formWindowActivated

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if(key == KeyEvent.VK_ENTER) {
            mainPanel.remove(startLabel);
            mainPanel.revalidate();
            mainPanel.repaint();
            
            JPanel playerPanel = new PlayerName();
            playerPanel.setLocation(160, 220);
            playerPanel.setSize(500, 200);
            mainPanel.add(playerPanel);
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
   
    /**
     * Blinks text using Runnable Class (Threads) for 300 Milliseconds
     */
    public void blinkText() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(startLabel.isEnabled()) {
                    try {
                        returnVisible();
                        Thread.sleep(600L);
                    }
                    catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            
            public void returnVisible() {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        startLabel.setVisible(!startLabel.isVisible());
                    }
                });
            }
        }).start(); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel startLabel;
    // End of variables declaration//GEN-END:variables
}

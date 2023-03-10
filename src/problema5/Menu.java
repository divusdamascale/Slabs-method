/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package problema5;
import java.awt.*;
import java.awt.Graphics;

import javax.swing.JRadioButton;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.Color;
/**
 *
 * @author dutud
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    Pslg x = new Pslg();
    Varf[] ver = x.getVarf();
    static Graphics g ;
    

    public Menu() {
        initComponents();
        g=Desen.getGraphics();
        Desen.paintComponents(g);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Desen = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 58, 111));
//        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
//            public void mouseDragged(java.awt.event.MouseEvent evt) {
//                jPanel1MouseDragged(evt);
//            }
//        });

        Desen.setBackground(new java.awt.Color(255, 255, 255));
        Desen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesenMouseClicked(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\GC\\Problema5\\src\\problema5\\2.jpg")); // NOI18N
        jLabel6.setToolTipText("");

        jButton4.setText("Deseneaza");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DesenLayout = new javax.swing.GroupLayout(Desen);
        Desen.setLayout(DesenLayout);
        DesenLayout.setHorizontalGroup(
            DesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DesenLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(141, 141, 141)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        DesenLayout.setVerticalGroup(
            DesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesenLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PSLG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Punctul M");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Y:");

        jButton1.setText("Cauta ");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DCEL");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Dutu Denis-Calin");

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Met.Lespezilor");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Met.Lanturilor");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Desen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))
                            .addComponent(jRadioButton4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Desen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Desen.setVisible(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String x = jTextField1.getText();
        String y = jTextField2.getText();
        Varf m = new Varf(Integer.parseInt(x), Integer.parseInt(y), "M");
        g.setColor(Color.red);
        g.drawOval(Integer.parseInt(x)*17, 247-Integer.parseInt(y)*17, 5, 5);
        if(jRadioButton3.isSelected())
        {
            g.setColor(Color.blue);
            for (int i = 1; i < ver.length; i++) {
                g.drawLine(0, 250-ver[i].getY()*17, 300, 250-ver[i].getY()*17);
            }
            g.setColor(Color.black);
            Algoritm alg = new Algoritm(m);
        }else if(jRadioButton4.isSelected())
        {
            for (Varf varf : this.x.getLanturi()) {
                System.out.println("ok");
                
            }
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\GC\\Problema5\\src\\problema5\\1.jpg"));
    }//GEN-LAST:event_jButton2ActionPerformed

   

    private void DesenMouseClicked(java.awt.event.MouseEvent evt) {
        // g.setColor(Color.cyan);
        // for (int i = 1; i < ver.length; i++) {
        //     g.drawOval(ver[i].getX()*17,247-ver[i].getY()*17, 3, 3);
        // }//GEN-FIRST:event_DesenMouseClicked
        // g.setColor(Color.BLACK);
        // g.drawLine(3,0,3,322);
        // g.drawLine(0, 250, 300, 250);
        // g.drawLine(ver[1].getX()*17+3,250-ver[1].getY()*17,ver[2].getX()*17+3,250-ver[2].getY()*17 );
        // g.drawLine(ver[1].getX()*17+3,250-ver[1].getY()*17,ver[3].getX()*17+3,250-ver[3].getY()*17 );
        // g.drawLine(ver[3].getX()*17+3,250-ver[3].getY()*17,ver[2].getX()*17+3,250-ver[2].getY()*17 );
        // g.drawLine(ver[3].getX()*17+3,250-ver[3].getY()*17,ver[4].getX()*17+3,250-ver[4].getY()*17 );
        // g.drawLine(ver[5].getX()*17+3,250-ver[5].getY()*17,ver[4].getX()*17+3,250-ver[4].getY()*17 );
        // g.drawLine(ver[5].getX()*17+3,250-ver[5].getY()*17,ver[6].getX()*17+3,250-ver[6].getY()*17 );
        // g.drawLine(ver[5].getX()*17+3,250-ver[5].getY()*17,ver[7].getX()*17+3,250-ver[7].getY()*17 );
        // g.drawLine(ver[6].getX()*17+3,250-ver[6].getY()*17,ver[4].getX()*17+3,250-ver[4].getY()*17 );
        // g.drawLine(ver[6].getX()*17+3,250-ver[6].getY()*17,ver[8].getX()*17+3,250-ver[8].getY()*17 );
        // g.drawLine(ver[6].getX()*17+3,250-ver[6].getY()*17,ver[7].getX()*17+3,250-ver[7].getY()*17 );
        // g.drawLine(ver[7].getX()*17+3,250-ver[7].getY()*17,ver[11].getX()*17+3,250-ver[11].getY()*17 );
        // g.drawLine(ver[7].getX()*17+3,250-ver[7].getY()*17,ver[12].getX()*17+3,250-ver[12].getY()*17 );
        // g.drawLine(ver[12].getX()*17+3,250-ver[12].getY()*17,ver[11].getX()*17+3,250-ver[11].getY()*17 );
        // g.drawLine(ver[12].getX()*17+3,250-ver[12].getY()*17,ver[10].getX()*17+3,250-ver[10].getY()*17 );
        // g.drawLine(ver[10].getX()*17+3,250-ver[10].getY()*17,ver[11].getX()*17+3,250-ver[11].getY()*17 );
        // g.drawLine(ver[10].getX()*17+3,250-ver[10].getY()*17,ver[9].getX()*17+3,250-ver[9].getY()*17 );
        // g.drawLine(ver[11].getX()*17+3,250-ver[11].getY()*17,ver[9].getX()*17+3,250-ver[9].getY()*17 );
        // g.drawLine(ver[8].getX()*17+3,250-ver[8].getY()*17,ver[11].getX()*17+3,250-ver[11].getY()*17 );
        // g.drawLine(ver[2].getX()*17+3,250-ver[2].getY()*17,ver[5].getX()*17+3,250-ver[5].getY()*17 );
        

    }//GEN-LAST:event_DesenMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\GC\\Problema5\\src\\problema5\\2.jpg"));
      repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        g.setColor(Color.cyan);
        for (int i = 1; i < ver.length; i++) {
            g.drawOval(ver[i].getX()*17,247-ver[i].getY()*17, 3, 3);
        }
                                           
        g.setColor(Color.BLACK);
        
        g.drawLine(3,0,3,322);
        g.drawLine(0, 250, 300, 250);
        g.drawLine(ver[1].getX()*17+3,250-ver[1].getY()*17,ver[2].getX()*17+3,250-ver[2].getY()*17 );
        g.drawLine(ver[1].getX()*17+3,250-ver[1].getY()*17,ver[3].getX()*17+3,250-ver[3].getY()*17 );
        g.drawLine(ver[3].getX()*17+3,250-ver[3].getY()*17,ver[2].getX()*17+3,250-ver[2].getY()*17 );
        g.drawLine(ver[3].getX()*17+3,250-ver[3].getY()*17,ver[4].getX()*17+3,250-ver[4].getY()*17 );
        g.drawLine(ver[5].getX()*17+3,250-ver[5].getY()*17,ver[4].getX()*17+3,250-ver[4].getY()*17 );
        g.drawLine(ver[5].getX()*17+3,250-ver[5].getY()*17,ver[6].getX()*17+3,250-ver[6].getY()*17 );
        g.drawLine(ver[5].getX()*17+3,250-ver[5].getY()*17,ver[7].getX()*17+3,250-ver[7].getY()*17 );
        g.drawLine(ver[6].getX()*17+3,250-ver[6].getY()*17,ver[4].getX()*17+3,250-ver[4].getY()*17 );
        g.drawLine(ver[6].getX()*17+3,250-ver[6].getY()*17,ver[8].getX()*17+3,250-ver[8].getY()*17 );
        g.drawLine(ver[6].getX()*17+3,250-ver[6].getY()*17,ver[7].getX()*17+3,250-ver[7].getY()*17 );
        g.drawLine(ver[7].getX()*17+3,250-ver[7].getY()*17,ver[11].getX()*17+3,250-ver[11].getY()*17 );
        g.drawLine(ver[7].getX()*17+3,250-ver[7].getY()*17,ver[12].getX()*17+3,250-ver[12].getY()*17 );
        g.drawLine(ver[12].getX()*17+3,250-ver[12].getY()*17,ver[11].getX()*17+3,250-ver[11].getY()*17 );
        g.drawLine(ver[12].getX()*17+3,250-ver[12].getY()*17,ver[10].getX()*17+3,250-ver[10].getY()*17 );
        g.drawLine(ver[10].getX()*17+3,250-ver[10].getY()*17,ver[11].getX()*17+3,250-ver[11].getY()*17 );
        g.drawLine(ver[10].getX()*17+3,250-ver[10].getY()*17,ver[9].getX()*17+3,250-ver[9].getY()*17 );
        g.drawLine(ver[11].getX()*17+3,250-ver[11].getY()*17,ver[9].getX()*17+3,250-ver[9].getY()*17 );
        g.drawLine(ver[8].getX()*17+3,250-ver[8].getY()*17,ver[11].getX()*17+3,250-ver[11].getY()*17 );
        g.drawLine(ver[2].getX()*17+3,250-ver[2].getY()*17,ver[5].getX()*17+3,250-ver[5].getY()*17 );
    }//GEN-LAST:event_jButton4ActionPerformed


   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Pslg x = new Pslg();
        System.out.println(x.toString());
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
            }
        });

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Desen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

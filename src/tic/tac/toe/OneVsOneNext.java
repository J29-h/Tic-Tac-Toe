/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tic.tac.toe;

import javax.swing.*;

/**
 *
 * @author ging3r
 */
public class OneVsOneNext extends javax.swing.JFrame {

        public OneVsOneNext(String x, String i) {
        initComponents();
        
        PLAYERNAME1.setText(x);

        PLAYERNAME2.setText(i);
    }
    
    public void Score() {
        Game G = new Game();

        PlayerX.setText(String.valueOf(G.xcount = 0));
        PlayerO.setText(String.valueOf(G.ocount = 0));

    }

    public OneVsOneNext() {
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

        jPanel1 = new javax.swing.JPanel();
        player1 = new javax.swing.JLabel();
        PLAYERNAME1 = new javax.swing.JLabel();
        PlayerX = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        PLAYERNAME2 = new javax.swing.JLabel();
        PlayerO = new javax.swing.JLabel();
        START = new javax.swing.JButton();
        MENU = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        How = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();
        PLAY = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Settings = new javax.swing.JMenuItem();
        AboutUs = new javax.swing.JMenu();
        Rate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        player1.setFont(new java.awt.Font("Krungthep", 2, 18)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 255, 255));
        player1.setText("PLAYER 1 :");
        jPanel1.add(player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 100, -1));

        PLAYERNAME1.setFont(new java.awt.Font("Krungthep", 2, 18)); // NOI18N
        PLAYERNAME1.setForeground(new java.awt.Color(255, 255, 255));
        PLAYERNAME1.setText("XXXXX");
        jPanel1.add(PLAYERNAME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 90, 30));

        PlayerX.setBackground(new java.awt.Color(174, 129, 219));
        PlayerX.setFont(new java.awt.Font("Krungthep", 2, 48)); // NOI18N
        PlayerX.setForeground(new java.awt.Color(255, 255, 255));
        PlayerX.setText("X");
        jPanel1.add(PlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 40, -1));

        player2.setFont(new java.awt.Font("Krungthep", 2, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        player2.setText("PLAYER 2 :");
        jPanel1.add(player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, -1, -1));

        PLAYERNAME2.setFont(new java.awt.Font("Krungthep", 2, 18)); // NOI18N
        PLAYERNAME2.setForeground(new java.awt.Color(255, 255, 255));
        PLAYERNAME2.setText("XXXXX");
        jPanel1.add(PLAYERNAME2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 80, 30));

        PlayerO.setBackground(new java.awt.Color(174, 129, 219));
        PlayerO.setFont(new java.awt.Font("Krungthep", 2, 48)); // NOI18N
        PlayerO.setForeground(new java.awt.Color(255, 255, 255));
        PlayerO.setText("X");
        jPanel1.add(PlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 40, -1));

        START.setBackground(new java.awt.Color(55, 6, 128));
        START.setFont(new java.awt.Font("Krungthep", 2, 24)); // NOI18N
        START.setForeground(new java.awt.Color(255, 255, 255));
        START.setText("START!");
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        jPanel1.add(START, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 190, 50));

        MENU.setBackground(new java.awt.Color(55, 6, 128));
        MENU.setFont(new java.awt.Font("Krungthep", 2, 24)); // NOI18N
        MENU.setForeground(new java.awt.Color(255, 255, 255));
        MENU.setText("MENU");
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        jPanel1.add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 160, 50));

        EXIT.setBackground(new java.awt.Color(55, 6, 128));
        EXIT.setFont(new java.awt.Font("Krungthep", 2, 24)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        jPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 160, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tumblr.gif"))); // NOI18N
        jLabel5.setText("jLabel3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 1030, 760));

        Menu.setForeground(new java.awt.Color(121, 48, 128));
        Menu.setFont(new java.awt.Font("Krungthep", 2, 14)); // NOI18N

        How.setBackground(new java.awt.Color(127, 127, 193));
        How.setForeground(new java.awt.Color(255, 255, 255));
        How.setText("File");
        How.setFont(new java.awt.Font("Krungthep", 2, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Krungthep", 2, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(181, 144, 181));
        jMenuItem1.setText("MENU!");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        How.add(jMenuItem1);

        About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        About.setFont(new java.awt.Font("Krungthep", 2, 14)); // NOI18N
        About.setForeground(new java.awt.Color(181, 144, 181));
        About.setText("ABOUT CREATOR!");
        About.setToolTipText("");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        How.add(About);

        PLAY.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PLAY.setFont(new java.awt.Font("Krungthep", 2, 14)); // NOI18N
        PLAY.setForeground(new java.awt.Color(181, 144, 181));
        PLAY.setText("HOW TO PLAY?");
        PLAY.setToolTipText("");
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });
        How.add(PLAY);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        How.add(jSeparator1);

        Settings.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Settings.setFont(new java.awt.Font("Krungthep", 2, 14)); // NOI18N
        Settings.setForeground(new java.awt.Color(181, 144, 181));
        Settings.setText("SETTINGS!");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        How.add(Settings);

        Menu.add(How);

        AboutUs.setBackground(new java.awt.Color(177, 141, 177));
        AboutUs.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs.setText("About Us");
        AboutUs.setFont(new java.awt.Font("Krungthep", 2, 14)); // NOI18N
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsActionPerformed(evt);
            }
        });

        Rate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Rate.setFont(new java.awt.Font("Krungthep", 2, 14)); // NOI18N
        Rate.setForeground(new java.awt.Color(181, 144, 181));
        Rate.setText("RATE!");
        Rate.setToolTipText("");
        Rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateActionPerformed(evt);
            }
        });
        AboutUs.add(Rate);

        Menu.add(AboutUs);

        setJMenuBar(Menu);

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

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
        // TODO add your handling code here:
        MENU m = new MENU();
        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MENUActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");

        if (JOptionPane.showConfirmDialog(frame, "CONFIRM IF YOU WANT TO EXIT ",
                "TIC TAC TOE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        // TODO add your handling code here:

        GAMEO g = new GAMEO();
        g.setVisible(true);
        g.pack();
        g.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_STARTActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        MENU m = new MENU();

        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "HI! MY NAME IS JANA MALIBARI AND I'M THE CREATOR OF THIS GAME\n THIS IS THE FIRST GAME I HAVE EVER MADE AND I HOPE IT SUITS U PLAYER <3 ",
            "ABOUT CREATOR", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AboutActionPerformed

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "TO WIN THE GAME, YOU HAVE TO GET 3 'X'S STRIGHT OR 3 '0'S!",
            "HOW TO PLAY?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_PLAYActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        // TODO add your handling code here:
        //CHANGE COLOR
    }//GEN-LAST:event_SettingsActionPerformed

    private void RateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateActionPerformed
        // TODO add your handling code here:
        Comments r = new Comments();

        r.setVisible(true);
        r.pack();
        r.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_RateActionPerformed

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUsActionPerformed

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
            java.util.logging.Logger.getLogger(OneVsOneNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OneVsOneNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OneVsOneNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OneVsOneNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OneVsOneNext().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu AboutUs;
    private javax.swing.JButton EXIT;
    private javax.swing.JMenu How;
    private javax.swing.JButton MENU;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem PLAY;
    public static javax.swing.JLabel PLAYERNAME1;
    public javax.swing.JLabel PLAYERNAME2;
    public javax.swing.JLabel PlayerO;
    public javax.swing.JLabel PlayerX;
    private javax.swing.JMenuItem Rate;
    private javax.swing.JButton START;
    private javax.swing.JMenuItem Settings;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    // End of variables declaration//GEN-END:variables
}

package tic.tac.toe;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tic.tac.toe.MENU;
import tic.tac.toe.ScoreOneVsOne;



public class GAMEO extends javax.swing.JFrame {

    private String start = "X";
    int xcount =0;
    int ocount =0;

    
   
     
    private void Choose() {

        if (start.equalsIgnoreCase("X")) {

            start = "O";

        } else {

            start = "X";

        }
    }

    private void Winning() {

        ScoreOneVsOne o = new ScoreOneVsOne();

        String b1 = txtb1.getText();
        String b2 = txtb2.getText();
        String b3 = txtb3.getText();

        String b4 = txtb4.getText();
        String b5 = txtb5.getText();
        String b6 = txtb6.getText();

        String b7 = txtb7.getText();
        String b8 = txtb8.getText();
        String b9 = txtb9.getText();

        // X Wins
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {

            xcount++;
            o.Score();

            txtb1.setBackground(new Color(121, 48, 128));
            txtb2.setBackground(new Color(121, 48, 128));
            txtb3.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER X WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {

            xcount++;
            o.Score();

            txtb4.setBackground(new Color(121, 48, 128));
            txtb5.setBackground(new Color(121, 48, 128));
            txtb6.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER X WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);
            this.setVisible(false);

        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {

            xcount++;
            o.Score();

            txtb7.setBackground(new Color(121, 48, 128));
            txtb8.setBackground(new Color(121, 48, 128));
            txtb9.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER X WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {

            xcount++;
            o.Score();

            txtb1.setBackground(new Color(121, 48, 128));
            txtb5.setBackground(new Color(121, 48, 128));
            txtb9.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER X WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b7 == ("X") && b5 == ("X") && b3 == ("X")) {

            xcount++;
            o.Score();

            txtb7.setBackground(new Color(121, 48, 128));
            txtb5.setBackground(new Color(121, 48, 128));
            txtb3.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER X WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {

            xcount++;
            o.Score();

            txtb1.setBackground(new Color(121, 48, 128));
            txtb4.setBackground(new Color(121, 48, 128));
            txtb7.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER X WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b5 == ("X") && b2 == ("X") && b8 == ("X")) {

            xcount++;
            o.Score();

            txtb5.setBackground(new Color(121, 48, 128));
            txtb2.setBackground(new Color(121, 48, 128));
            txtb8.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER X WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b6 == ("X") && b9 == ("X") && b3 == ("X")) {

            xcount++;
            o.Score();

            txtb6.setBackground(new Color(121, 48, 128));
            txtb9.setBackground(new Color(121, 48, 128));
            txtb3.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER X WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }

        // O Wins
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {

            ocount++;
            o.Score();

            txtb1.setBackground(new Color(121, 48, 128));
            txtb2.setBackground(new Color(121, 48, 128));
            txtb3.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER O WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {

            ocount++;
            o.Score();

            txtb4.setBackground(new Color(121, 48, 128));
            txtb5.setBackground(new Color(121, 48, 128));
            txtb6.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER O WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {

            ocount++;
           o.Score();

            txtb7.setBackground(new Color(121, 48, 128));
            txtb8.setBackground(new Color(121, 48, 128));
            txtb9.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER O WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {

            ocount++;
            o.Score();

            txtb1.setBackground(new Color(121, 48, 128));
            txtb5.setBackground(new Color(121, 48, 128));
            txtb9.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER O WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b7 == ("O") && b5 == ("O") && b3 == ("O")) {

            ocount++;
            o.Score();

            txtb7.setBackground(new Color(121, 48, 128));
            txtb5.setBackground(new Color(121, 48, 128));
            txtb3.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER O WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {

            ocount++;
            o.Score();

            txtb1.setBackground(new Color(121, 48, 128));
            txtb4.setBackground(new Color(121, 48, 128));
            txtb7.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER O WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b5 == ("O") && b2 == ("O") && b8 == ("O")) {

            ocount++;
            o.Score();

            txtb5.setBackground(new Color(121, 48, 128));
            txtb2.setBackground(new Color(121, 48, 128));
            txtb8.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER O WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        if (b6 == ("O") && b9 == ("O") && b3 == ("O")) {

            ocount++;
             o.Score();

            txtb6.setBackground(new Color(121, 48, 128));
            txtb9.setBackground(new Color(121, 48, 128));
            txtb3.setBackground(new Color(121, 48, 128));

            JOptionPane.showMessageDialog(this, "PLAYER O WINS!",
                    " ", JOptionPane.INFORMATION_MESSAGE);

            o.setVisible(true);
            o.pack();
            o.setLocationRelativeTo(null);
            this.setVisible(false);

        }
    }
    
    
    
    public GAMEO() {
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
        txtb3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtb2 = new javax.swing.JButton();
        txtb1 = new javax.swing.JButton();
        txtb4 = new javax.swing.JButton();
        txtb5 = new javax.swing.JButton();
        txtb6 = new javax.swing.JButton();
        txtb9 = new javax.swing.JButton();
        txtb8 = new javax.swing.JButton();
        txtb7 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
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

        txtb3.setBackground(new java.awt.Color(51, 0, 102));
        txtb3.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb3.setForeground(new java.awt.Color(255, 255, 255));
        txtb3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb3.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 150, 150));

        jLabel10.setFont(new java.awt.Font("Krungthep", 2, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TIC-TAC-TOE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        txtb2.setBackground(new java.awt.Color(51, 0, 102));
        txtb2.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb2.setForeground(new java.awt.Color(255, 255, 255));
        txtb2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb2.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 150, 150));

        txtb1.setBackground(new java.awt.Color(51, 0, 102));
        txtb1.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb1.setForeground(new java.awt.Color(255, 255, 255));
        txtb1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb1.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 150, 150));

        txtb4.setBackground(new java.awt.Color(51, 0, 102));
        txtb4.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb4.setForeground(new java.awt.Color(255, 255, 255));
        txtb4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb4.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 150, 150));

        txtb5.setBackground(new java.awt.Color(51, 0, 102));
        txtb5.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb5.setForeground(new java.awt.Color(255, 255, 255));
        txtb5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb5.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb5ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 150, 150));

        txtb6.setBackground(new java.awt.Color(51, 0, 102));
        txtb6.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb6.setForeground(new java.awt.Color(255, 255, 255));
        txtb6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb6.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb6ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 150, 150));

        txtb9.setBackground(new java.awt.Color(51, 0, 102));
        txtb9.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb9.setForeground(new java.awt.Color(255, 255, 255));
        txtb9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb9.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb9ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 150, 150));

        txtb8.setBackground(new java.awt.Color(51, 0, 102));
        txtb8.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb8.setForeground(new java.awt.Color(255, 255, 255));
        txtb8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb8.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb8ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 150, 150));

        txtb7.setBackground(new java.awt.Color(51, 0, 102));
        txtb7.setFont(new java.awt.Font("Krungthep", 2, 72)); // NOI18N
        txtb7.setForeground(new java.awt.Color(255, 255, 255));
        txtb7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        txtb7.setPreferredSize(new java.awt.Dimension(78, 78));
        txtb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb7ActionPerformed(evt);
            }
        });
        jPanel1.add(txtb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 150, 150));

        Exit.setBackground(new java.awt.Color(55, 6, 128));
        Exit.setFont(new java.awt.Font("Krungthep", 2, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 180, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tumblr.gif"))); // NOI18N
        jLabel11.setText("jLabel3");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 1030, 760));

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

    private void txtb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb3ActionPerformed
        // TODO add your handling code here:

        txtb3.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb3.setForeground(Color.WHITE);

        } else {

            txtb3.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb3ActionPerformed

    private void txtb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb2ActionPerformed
        // TODO add your handling code here:
        txtb2.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb2.setForeground(Color.WHITE);

        } else {

            txtb2.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb2ActionPerformed

    private void txtb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb1ActionPerformed
        // TODO add your handling code here:

        txtb1.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb1.setForeground(Color.WHITE);

        } else {

            txtb1.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb1ActionPerformed

    private void txtb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb4ActionPerformed
        // TODO add your handling code here:
        txtb4.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb4.setForeground(Color.WHITE);

        } else {

            txtb4.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb4ActionPerformed

    private void txtb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb5ActionPerformed
        // TODO add your handling code here:

        txtb5.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb5.setForeground(Color.WHITE);

        } else {

            txtb5.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb5ActionPerformed

    private void txtb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb6ActionPerformed
        // TODO add your handling code here:

        txtb6.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb6.setForeground(Color.WHITE);

        } else {

            txtb6.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb6ActionPerformed

    private void txtb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb9ActionPerformed
        // TODO add your handling code here:

        txtb9.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb9.setForeground(Color.WHITE);

        } else {

            txtb9.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb9ActionPerformed

    private void txtb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb8ActionPerformed
        // TODO add your handling code here:
        txtb8.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb8.setForeground(Color.WHITE);

        } else {

            txtb8.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb8ActionPerformed

    private void txtb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb7ActionPerformed
        // TODO add your handling code here:
        txtb7.setText(start);
        if (start.equalsIgnoreCase("X")) {

            txtb7.setForeground(Color.WHITE);

        } else {

            txtb7.setForeground(Color.WHITE);

        }
        Choose();
        Winning();
    }//GEN-LAST:event_txtb7ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");

        if (JOptionPane.showConfirmDialog(frame, "CONFIRM IF YOU WANT TO END ",
            "THE GAME", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        MENU M = new MENU();
        M.setVisible(true);
        M.pack();
        M.setLocationRelativeTo(null);
        this.setVisible(false);
        }
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(GAMEO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GAMEO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GAMEO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GAMEO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GAMEO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu AboutUs;
    private javax.swing.JButton Exit;
    private javax.swing.JMenu How;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem PLAY;
    private javax.swing.JMenuItem Rate;
    private javax.swing.JMenuItem Settings;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton txtb1;
    private javax.swing.JButton txtb2;
    private javax.swing.JButton txtb3;
    private javax.swing.JButton txtb4;
    private javax.swing.JButton txtb5;
    private javax.swing.JButton txtb6;
    private javax.swing.JButton txtb7;
    private javax.swing.JButton txtb8;
    private javax.swing.JButton txtb9;
    // End of variables declaration//GEN-END:variables
}

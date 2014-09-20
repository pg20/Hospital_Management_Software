package hospital;

public class home extends javax.swing.JFrame {
    
public home() {
        super("Patient Billing Software");
        initComponents();
    }

 @SuppressWarnings("unchecked")

 public void changeVisibility() {
        addUser.setVisible(false);
        editOrganisation.setVisible(false);
    }
    public void setLabel9(String s) {
        jLabel9.setText(s);
    }
    public void setname(String s) {
        name.setText(s);
    }
    public void setaddress(String s) {
        address.setText(s);
    }
    public void setcode(String s) {
        code.setText(s);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changePassword = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        changePasswd = new javax.swing.JLabel();
        editOrganisation = new javax.swing.JLabel();
        buttonReg = new javax.swing.JButton();
        buttonAdmit = new javax.swing.JButton();
        buttonPayDues = new javax.swing.JButton();
        buttonUpdateDues = new javax.swing.JButton();
        buttonDischarge = new javax.swing.JButton();
        buttonWard = new javax.swing.JButton();
        buttonTransfer = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        addUser = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labelOut = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        changePassword.setAlwaysOnTop(true);
        changePassword.setBounds(new java.awt.Rectangle(0, 0, 450, 350));

        jLabel4.setText("Old Password");

        jLabel5.setText("New Password");

        jLabel6.setText("Confirm Password");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Change Password");

        confirm.setText("Confirm ");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout changePasswordLayout = new javax.swing.GroupLayout(changePassword.getContentPane());
        changePassword.getContentPane().setLayout(changePasswordLayout);
        changePasswordLayout.setHorizontalGroup(
            changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
            .addGroup(changePasswordLayout.createSequentialGroup()
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changePasswordLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(13, 13, 13)
                        .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField3)
                            .addComponent(jPasswordField2)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                    .addGroup(changePasswordLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(changePasswordLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(confirm)
                        .addGap(47, 47, 47)
                        .addComponent(cancel)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        changePasswordLayout.setVerticalGroup(
            changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(cancel))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(245, 165, 785, 465));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        changePasswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        changePasswd.setText("Change Password");
        changePasswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswdMouseClicked(evt);
            }
        });
        changePasswd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                changePasswdMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                changePasswdMouseMoved(evt);
            }
        });
        jPanel1.add(changePasswd);
        changePasswd.setBounds(590, 14, 120, 20);

        editOrganisation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        editOrganisation.setText("Edit Organization Details");
        editOrganisation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editOrganisationMouseClicked(evt);
            }
        });
        jPanel1.add(editOrganisation);
        editOrganisation.setBounds(587, 70, 170, 14);

        buttonReg.setText("Register Patient");
        buttonReg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegMouseClicked(evt);
            }
        });
        jPanel1.add(buttonReg);
        buttonReg.setBounds(140, 120, 140, 30);

        buttonAdmit.setText("Admit Patient");
        buttonAdmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAdmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAdmitMouseClicked(evt);
            }
        });
        jPanel1.add(buttonAdmit);
        buttonAdmit.setBounds(110, 200, 140, 30);

        buttonPayDues.setText("Pay Dues");
        buttonPayDues.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPayDues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPayDuesMouseClicked(evt);
            }
        });
        jPanel1.add(buttonPayDues);
        buttonPayDues.setBounds(530, 270, 130, 30);

        buttonUpdateDues.setText("Update Dues");
        buttonUpdateDues.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonUpdateDues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonUpdateDuesMouseClicked(evt);
            }
        });
        jPanel1.add(buttonUpdateDues);
        buttonUpdateDues.setBounds(540, 200, 130, 30);

        buttonDischarge.setText("Discharge Patient");
        buttonDischarge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDischarge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDischargeMouseClicked(evt);
            }
        });
        jPanel1.add(buttonDischarge);
        buttonDischarge.setBounds(490, 330, 140, 30);

        buttonWard.setText("Ward Availability");
        buttonWard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonWard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonWardMouseClicked(evt);
            }
        });
        jPanel1.add(buttonWard);
        buttonWard.setBounds(130, 270, 130, 30);

        buttonTransfer.setText("Transfer Patient");
        buttonTransfer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTransferMouseClicked(evt);
            }
        });
        jPanel1.add(buttonTransfer);
        buttonTransfer.setBounds(510, 120, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("jfdjbdfbb");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 50, 110, 20);

        address.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        address.setText("                                              jLabel4");
        jPanel1.add(address);
        address.setBounds(210, 40, 320, 30);

        name.setBackground(new java.awt.Color(255, 0, 0));
        name.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        name.setText("                  pramiti");
        jPanel1.add(name);
        name.setBounds(218, 10, 350, 27);

        code.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        code.setText("                 jLabel5");
        jPanel1.add(code);
        code.setBounds(290, 70, 180, 20);

        addUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        addUser.setText("Add User");
        addUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserMouseClicked(evt);
            }
        });
        jPanel1.add(addUser);
        addUser.setBounds(610, 44, 100, 20);

        jButton2.setText("Patient Information");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 330, 130, 30);

        labelOut.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelOut.setText("Sign Out");
        labelOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOutMouseClicked(evt);
            }
        });
        jPanel1.add(labelOut);
        labelOut.setBounds(30, 80, 60, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pramiti\\Documents\\hopitalproj_images\\cirlclepic.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 100, 270, 260);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Welcome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 150, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePasswdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswdMouseClicked
        //        changePasswd chg  = new changePasswd();
        //        chg.setVisible(true);
        this.setEnabled(false);
        changePasswd c=new changePasswd(this,jLabel9.getText());
        c.setVisible(true);
        //this.setEnabled(false);
        // TODO add your handling code here:
}//GEN-LAST:event_changePasswdMouseClicked

    private void changePasswdMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswdMouseDragged
        //      changePasswd.setFont(new java.awt.Font("Tahoma", 0, 9));// TODO add your handling code here:
}//GEN-LAST:event_changePasswdMouseDragged

    private void changePasswdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswdMouseMoved
        //  changePasswd.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        //   changePasswd.setForeground(new java.awt.Color(0, 51, 255));
        // TODO add your handling code here:
}//GEN-LAST:event_changePasswdMouseMoved

    private void editOrganisationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editOrganisationMouseClicked
        editDetails e=new editDetails(this);
        this.setEnabled(false);
        e.setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_editOrganisationMouseClicked

    private void buttonRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegMouseClicked
        this.setVisible(false);
        registerPatient r = new registerPatient(this);
        r.setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_buttonRegMouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

}//GEN-LAST:event_jPasswordField1ActionPerformed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked

}//GEN-LAST:event_confirmMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

        changePassword.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_cancelMouseClicked

    private void buttonTransferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTransferMouseClicked
        this.setVisible(false);
        patientTransfer r = new patientTransfer(this);
        r.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTransferMouseClicked

    private void buttonPayDuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPayDuesMouseClicked
        this.setVisible(false);
        payDues r = new payDues(this);
        r.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPayDuesMouseClicked

    private void buttonUpdateDuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUpdateDuesMouseClicked
        this.setVisible(false);
        updateDues r = new updateDues(this);
        r.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUpdateDuesMouseClicked

    private void buttonAdmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdmitMouseClicked
        this.setVisible(false);
        admitPatient r = new admitPatient(this);
        r.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdmitMouseClicked

    private void buttonDischargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDischargeMouseClicked
        this.setVisible(false);
        dischargePatient r = new dischargePatient(this);
        r.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDischargeMouseClicked

    private void addUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserMouseClicked
        // TODO add your handling code here:
        addUser a=new addUser(this);
        this.setEnabled(false);
        a.setVisible(true);
    }//GEN-LAST:event_addUserMouseClicked

    private void buttonWardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonWardMouseClicked
        // TODO add your handling code here:
        wardAvailable w=new wardAvailable(this);
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonWardMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        patInfo p=new patInfo(this);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void labelOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOutMouseClicked
        this.setVisible(false);
        login l=new login();
        l.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_labelOutMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addUser;
    private javax.swing.JLabel address;
    private javax.swing.JButton buttonAdmit;
    private javax.swing.JButton buttonDischarge;
    private javax.swing.JButton buttonPayDues;
    private javax.swing.JButton buttonReg;
    private javax.swing.JButton buttonTransfer;
    private javax.swing.JButton buttonUpdateDues;
    private javax.swing.JButton buttonWard;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel changePasswd;
    private javax.swing.JFrame changePassword;
    private javax.swing.JLabel code;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel editOrganisation;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JLabel labelOut;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables

}

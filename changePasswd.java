package hospital;

public class changePasswd extends javax.swing.JFrame  {
    home q;
    String user;
    String old,new1,confirm1,conold;
    /** Creates new form changePasswd */
    public changePasswd(home h,String usr) {
        super("Change Password");
        initComponents();
        q=h;
        user=usr;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogSucesss = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        labelSucess = new javax.swing.JLabel();
        buttonOk = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        dialogSucesss.setAlwaysOnTop(true);
        dialogSucesss.setBounds(new java.awt.Rectangle(471, 284, 337, 231));

        labelSucess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSucess.setText("       Password Changed");

        buttonOk.setText("OK");
        buttonOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonOkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelSucess, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(labelSucess, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonOk)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout dialogSucesssLayout = new javax.swing.GroupLayout(dialogSucesss.getContentPane());
        dialogSucesss.getContentPane().setLayout(dialogSucesssLayout);
        dialogSucesssLayout.setHorizontalGroup(
            dialogSucesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogSucesssLayout.setVerticalGroup(
            dialogSucesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(455, 285, 0, 0));

        jLabel1.setText("Old Password");

        jLabel2.setText("New Password");

        jLabel3.setText("Confirm Password");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Change Password");

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

        error.setText("               ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(confirm)
                                .addGap(47, 47, 47)
                                .addComponent(cancel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField3)
                                    .addComponent(jPasswordField2)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(cancel))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addComponent(error)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

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

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        old=jPasswordField1.getText();
        new1=jPasswordField2.getText();
        confirm1=jPasswordField3.getText();
        if(confirm1.equals(new1)) {
            try {
            Database db=new Database();
            db.getConnection();
            db.ps=db.con.prepareStatement("select pwd from login where usr=?");
            db.ps.setString(1, user);
            db.r=db.ps.executeQuery();
            db.r.next();
            conold=db.r.getString(1);
            if(conold.equals(old)) {
                db.ps=db.con.prepareStatement("update login set pwd=? where usr=?");
                db.ps.setString(1, new1);
                db.ps.setString(2,user);
                db.ps.executeUpdate();
                dialogSucesss.setVisible(true);
            } else {
                error.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                error.setForeground(new java.awt.Color(204, 0, 0));
                error.setText("Old password Incorrect");
            }
            db.closeAll();    
            }catch(Exception e) {}
        } else {
                error.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                error.setForeground(new java.awt.Color(204, 0, 0));
                error.setText("Passwords Do Not Match");
        }
    }//GEN-LAST:event_confirmMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        q.setEnabled(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseClicked

    private void buttonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOkMouseClicked
        //        home h = new home();
        this.setVisible(false);
        dialogSucesss.setVisible(false);
        q.setEnabled(true);
        q.setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_buttonOkMouseClicked

    /**
    * @param args the command line arguments
    */
  /*  public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePasswd().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JDialog dialogSucesss;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JLabel labelSucess;
    // End of variables declaration//GEN-END:variables

}

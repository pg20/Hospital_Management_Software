
package hospital;

public class login extends javax.swing.JFrame {

    /** Creates new form login */
    public login() {
        super("Login");
        initComponents();
        try {
            Database db=new Database();
            db.getConnection();
            String sql="select * from info";
            db.r=db.stmt.executeQuery(sql);
            db.r.next();
            name.setText(db.r.getString(1));
            address.setText(db.r.getString(2));
            code.setText("Organisation Code-"+db.r.getString(3));
            db.closeAll();
        } catch(Exception e) {}
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        fail = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));

        jPanel1.setLayout(null);

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setText("                      Madhuraj Hospital");
        jPanel1.add(name);
        name.setBounds(349, 6, 300, 17);

        jLabel2.setText("User Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 130, 91, 14);

        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 160, 91, 14);

        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        jPanel1.add(UserName);
        UserName.setBounds(480, 130, 118, 20);

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password);
        Password.setBounds(480, 160, 120, 20);

        Login.setText("LOGIN");
        Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login);
        Login.setBounds(390, 210, 90, 30);

        Cancel.setText("Cancel");
        Cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);
        Cancel.setBounds(520, 210, 80, 30);

        fail.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        fail.setForeground(new java.awt.Color(204, 0, 0));
        fail.setText("     ");
        jPanel1.add(fail);
        fail.setBounds(386, 181, 220, 20);

        address.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        address.setText("                               Jhalwa, Allahabad");
        jPanel1.add(address);
        address.setBounds(349, 34, 270, 26);

        code.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        code.setText("Code-123");
        jPanel1.add(code);
        code.setBounds(353, 66, 260, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pramiti\\Documents\\hopitalproj_images\\img_12.jpeg")); // NOI18N
        jLabel1.setText("          ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 335, 269);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        // this.setVisible(false);// TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CancelMouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        try {
            String user = UserName.getText();
            String passwd = Password.getText();
            System.out.println("usre = " + user + "passwd" + passwd  );
            Database d=new Database();
            d.getConnection();
            d.ps=d.con.prepareStatement("select pwd from login where usr ='" + user + "'");
            //d.ps.setString(1, user);
            d.r=d.ps.executeQuery();
            if(d.r.next()) {
                String p=d.r.getString(1);
                d.closeAll();
                if(p.equals(passwd)){
                    this.setVisible(false);
                    home h = new home();
                    h.setLabel9(user);
                    if(user.equals("system")) {
                    } else {
                        h.changeVisibility();
                    }
                    h.setname(name.getText());
                    h.setaddress(address.getText());
                    h.setcode(code.getText());
                    h.setVisible(true);
                }else{
                    fail.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
                    fail.setForeground(new java.awt.Color(204, 0, 0));
                    fail.setText("UserName or Password Incorrect");
                }
            } else {
                fail.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
                fail.setForeground(new java.awt.Color(204, 0, 0));
                fail.setText("UserName or Password Incorrect");
            }
        } catch(Exception e) {}
    }//GEN-LAST:event_LoginActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:z
    }//GEN-LAST:event_LoginMouseClicked

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel address;
    private javax.swing.JLabel code;
    private javax.swing.JLabel fail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables

}
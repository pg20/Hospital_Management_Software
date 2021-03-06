package hospital;


public class patientTransfer extends javax.swing.JFrame {
    home q;
    String newward,preward;
    String regno,caseno;
    int wardno,bedno,prewardno,prebedno;
    java.sql.Date date;
    java.sql.Date predate;
    /** Creates new form wardTransfer */
    public patientTransfer(home h) {
        super("Transfer Patient");
        q=h;
        initComponents();
        java.util.Date pre=new java.util.Date();
        int year=pre.getYear();
        int month=pre.getMonth();
        int date1=pre.getDate();
        date=new java.sql.Date(year,month,date1);
        labelWard.setVisible(false);
        labelBed.setVisible(false);
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
        jPanel1 = new javax.swing.JPanel();
        labelSucess = new javax.swing.JLabel();
        buttonOk = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelWard = new javax.swing.JLabel();
        textCase = new javax.swing.JTextField();
        buttonTransfer = new javax.swing.JButton();
        labelWardTransfer = new javax.swing.JLabel();
        buttonClear = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        textReg = new javax.swing.JTextField();
        comboWard = new javax.swing.JComboBox();
        labelBed = new javax.swing.JLabel();
        labelWardNo = new javax.swing.JLabel();
        labelBedNo = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();

        dialogSucesss.setAlwaysOnTop(true);
        dialogSucesss.setBounds(new java.awt.Rectangle(471, 284, 337, 231));

        labelSucess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSucess.setText("Patient Transfered Sucessfully");

        buttonOk.setText("OK");
        buttonOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonOkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(labelSucess, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(labelSucess, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonOk)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout dialogSucesssLayout = new javax.swing.GroupLayout(dialogSucesss.getContentPane());
        dialogSucesss.getContentPane().setLayout(dialogSucesssLayout);
        dialogSucesssLayout.setHorizontalGroup(
            dialogSucesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogSucesssLayout.setVerticalGroup(
            dialogSucesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(245, 165, 0, 0));

        jLabel1.setText("Registration No.:");

        jLabel2.setText("Case No.:");

        jLabel3.setText("New Ward :");

        labelWard.setText("New Ward No.:");

        buttonTransfer.setText("Transfer");
        buttonTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTransferMouseClicked(evt);
            }
        });
        buttonTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransferActionPerformed(evt);
            }
        });

        labelWardTransfer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelWardTransfer.setText("Transfer Patient");

        buttonClear.setText("Clear");
        buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClearMouseClicked(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });

        comboWard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "General", "Cottage", "ICU" }));
        comboWard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboWardItemStateChanged(evt);
            }
        });

        labelBed.setText("New Bed No.:");

        labelWardNo.setText("              ");

        labelBedNo.setText("            ");

        labelError.setText("         ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(labelBed)
                                    .addComponent(labelWard))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textReg)
                                    .addComponent(textCase)
                                    .addComponent(comboWard, 0, 158, Short.MAX_VALUE)
                                    .addComponent(labelWardNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelBedNo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonClear)
                                .addGap(59, 59, 59)
                                .addComponent(buttonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(buttonCancel))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(labelWardTransfer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelWardTransfer)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelError)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWardNo)
                    .addComponent(labelWard))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBed, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBedNo))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonTransfer)
                    .addComponent(buttonClear))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        //home h = new home();
        this.setVisible(false);
        q.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelMouseClicked

    private void buttonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClearMouseClicked
        textCase.setText(null);
        textReg.setText(null);
        comboWard.setSelectedIndex(0);
        labelWardNo.setText(null);
        labelWard.setVisible(false);
        labelBed.setVisible(false);
        labelWardNo.setText(null);
        labelBedNo.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClearMouseClicked

    private void buttonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOkMouseClicked
        //home h = new home();
        this.setVisible(false);
        dialogSucesss.setVisible(false);
        q.setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_buttonOkMouseClicked

    private void buttonTransferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTransferMouseClicked
        try {
            Database d=new Database();
            d.getConnection();
            d.ps=d.con.prepareStatement("insert into freebedinfo values(?,?,?)");
            d.ps.setString(1,preward);
            d.ps.setInt(2,prewardno);
            d.ps.setInt(3,prebedno);
            d.ps.executeUpdate();
            d.ps.close();
            d.ps=d.con.prepareStatement("update patpreinfo set ward=?,wardno=?,bedno=? where regno=? and caseno=?");
            d.ps.setString(1,newward);
            d.ps.setInt(2,wardno);
            d.ps.setInt(3,bedno);
            d.ps.setString(4, regno);
            d.ps.setString(5, caseno);
            d.ps.executeUpdate();
            d.ps.close();
            d.ps=d.con.prepareStatement("delete from freebedinfo where ward=? and wardno=? and bedno=?");
            d.ps.setString(1,newward);
            d.ps.setInt(2,wardno);
            d.ps.setInt(3,bedno);
            d.ps.executeUpdate();
            d.ps.close();
            d.ps=d.con.prepareStatement("select entry from patinfo where regno=? and caseno=? and  ward=? and flag=0");
            d.ps.setString(1,regno);
            d.ps.setString(2,caseno);
            d.ps.setString(3,preward);
            d.r=d.ps.executeQuery();
            d.r.next();
            predate=d.r.getDate(1);
            d.ps.close();
            d.ps=d.con.prepareStatement("update patinfo set exit=?,flag=1 where regno=? and caseno=? and ward=? and flag=0");
            d.ps.setDate(1,date);
            d.ps.setString(2,regno);
            d.ps.setString(3,caseno);
            d.ps.setString(4, preward);
            d.ps.executeUpdate();
            d.ps.close();
            d.ps=d.con.prepareStatement("insert into patinfo values(?,?,?,?,null,0)");
            d.ps.setString(1,regno);
            d.ps.setString(2,caseno);
            d.ps.setString(3,newward);
            d.ps.setDate(4,date);
            d.ps.executeUpdate();
            d.ps.close();
            int diff=(int)(date.getTime() - predate.getTime()) / 86400000 ;
            if(diff==0) {
                diff=1;
            }
            if(preward.equals("General")) {
                diff=diff*300;
            } else if (preward.equals("Cottage")) {
                diff=diff*1000;
            } else if(preward.equals("ICU")) {
                diff=diff*2000;
            }
            d.ps=d.con.prepareStatement("update payment set wcharge=wcharge+? where regno=? and caseno=?");
            d.ps.setInt(1,diff);
            d.ps.setString(2,regno);
            d.ps.setString(3,caseno);
            d.ps.executeUpdate();
            //d.ps.close();
            d.closeAll();
        }
        catch(Exception e) {}
        finally {
        dialogSucesss.setVisible(true);        // TODO add your handling code here:
        }
    }//GEN-LAST:event_buttonTransferMouseClicked

    private void buttonTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTransferActionPerformed

    private void comboWardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboWardItemStateChanged
        labelWard.setVisible(false);
        labelBed.setVisible(false);
        labelWardNo.setText(null);
        labelBedNo.setText(null);
        labelError.setText(null);
        try {
        regno=textReg.getText();
        caseno=textCase.getText();
        newward=(String)evt.getItem();
        Database d=new Database();
        d.getConnection();
        d.ps=d.con.prepareStatement("select ward,wardno,bedno from patpreinfo where regno=? and caseno=?");
        d.ps.setString(1,regno);
        d.ps.setString(2,caseno);
        d.r=d.ps.executeQuery();
        d.r.next();
        preward=d.r.getString(1);
        prewardno=d.r.getInt(2);
        prebedno=d.r.getInt(3);
        d.ps.close();
        if(preward.equals(newward)) {
            labelError.setText("Already in the same Ward.");
            labelError.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
            labelError.setForeground(new java.awt.Color(204, 0, 0));
        }else{
            wardno=0;
            bedno=0;
            d.ps=d.con.prepareStatement("select wardno,bedno from freebedinfo where ward=?");
            d.ps.setString(1, newward);
            d.r=d.ps.executeQuery();
            if (d.r.next()) {
                wardno=d.r.getInt(1);
                bedno=d.r.getInt(2);
            }
            if(wardno==0) {
                labelError.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
                labelError.setForeground(new java.awt.Color(204, 0, 0));
                labelError.setText("Available!!!");
            }else{
                labelWard.setVisible(true);
                labelBed.setVisible(true);
                labelWardNo.setText(""+wardno);
                labelBedNo.setText(""+bedno);
            }
        }
        } catch(Exception e){}
    }//GEN-LAST:event_comboWardItemStateChanged

    /**
    * @param args the command line arguments
    *//*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientTransfer().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton buttonTransfer;
    private javax.swing.JComboBox comboWard;
    private javax.swing.JDialog dialogSucesss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBed;
    private javax.swing.JLabel labelBedNo;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelSucess;
    private javax.swing.JLabel labelWard;
    private javax.swing.JLabel labelWardNo;
    private javax.swing.JLabel labelWardTransfer;
    private javax.swing.JTextField textCase;
    private javax.swing.JTextField textReg;
    // End of variables declaration//GEN-END:variables

}

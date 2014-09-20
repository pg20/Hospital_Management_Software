package hospital;

public class dischargePatient extends javax.swing.JFrame {
    String regno,caseno,preward;
    int rcharge,acharge,scharge,mcharge,micharge,wcharge,pay,due;
    home q;
    java.sql.Date predate,date;
    int prewardno,prebedno;
    /** Creates new form dischargePatient */
    public dischargePatient(home h) {
        super("Discharge Patient");
        q=h;
        initComponents();
        java.util.Date de=new java.util.Date();
        int year=de.getYear();
        int month=de.getMonth();
        int date1=de.getDate();
        date=new java.sql.Date(year,month,date1);
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
        labelDischarge = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonClear = new javax.swing.JButton();
        buttonDischarge = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        textCase = new javax.swing.JTextField();
        textReg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        dialogSucesss.setAlwaysOnTop(true);
        dialogSucesss.setBounds(new java.awt.Rectangle(471, 284, 337, 231));

        labelSucess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSucess.setText("Patient Discharged Sucessfully");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(labelSucess, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelSucess)
                .addGap(30, 30, 30)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogSucesssLayout = new javax.swing.GroupLayout(dialogSucesss.getContentPane());
        dialogSucesss.getContentPane().setLayout(dialogSucesssLayout);
        dialogSucesssLayout.setHorizontalGroup(
            dialogSucesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogSucesssLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dialogSucesssLayout.setVerticalGroup(
            dialogSucesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 200, 0, 0));

        jPanel2.setLayout(null);

        labelDischarge.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        labelDischarge.setText("Discharge Patient   :D");
        jPanel2.add(labelDischarge);
        labelDischarge.setBounds(110, 0, 410, 59);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Reg. No.:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 90, 80, 19);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Case No.:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 131, 80, 19);

        buttonClear.setText("Clear");
        buttonClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClearMouseClicked(evt);
            }
        });
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel2.add(buttonClear);
        buttonClear.setBounds(40, 290, 90, 30);

        buttonDischarge.setText("Discharge");
        buttonDischarge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDischarge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDischargeMouseClicked(evt);
            }
        });
        jPanel2.add(buttonDischarge);
        buttonDischarge.setBounds(40, 210, 90, 30);

        buttonCancel.setText("Cancel");
        buttonCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });
        jPanel2.add(buttonCancel);
        buttonCancel.setBounds(40, 370, 90, 30);

        textCase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textCaseFocusLost(evt);
            }
        });
        jPanel2.add(textCase);
        textCase.setBounds(143, 128, 270, 20);
        jPanel2.add(textReg);
        textReg.setBounds(140, 90, 267, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pramiti\\Documents\\hopitalproj_images\\discharge.jpg")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(180, 170, 390, 266);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOkMouseClicked
        this.setVisible(false);
        dialogSucesss.setVisible(false);
        if(due>0 || due<0){
            payDues r = new payDues(this);
            r.setAll(regno, caseno,""+rcharge,""+mcharge,""+scharge,""+acharge,""+micharge,""+wcharge,""+pay,""+due);
            r.setVisible(true);
        }else if(due==0 && (labelSucess.getText()).equals("No Dues Left")) {
            this.setVisible(true);
            this.setEnabled(true);
        } else {
            q.setVisible(true);
        }
        // TODO add your handling code here:
}//GEN-LAST:event_buttonOkMouseClicked

    private void textCaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCaseFocusLost
        // TODO add your handling code here:
        regno=textReg.getText();
        caseno=textCase.getText();
        try {
            Database db=new Database();
            db.getConnection();
            db.ps=db.con.prepareStatement("select rcharge,mcharge,acharge,scharge,micharge,wcharge,paidamt from payment where regno=? and caseno=?");
            db.ps.setString(1,regno);
            db.ps.setString(2,caseno );
            db.r=db.ps.executeQuery();

            if(db.r.next()) {
                rcharge=db.r.getInt(1);
                mcharge=db.r.getInt(2);
                acharge=db.r.getInt(3);
                scharge=db.r.getInt(4);
                micharge=db.r.getInt(5);
                wcharge=db.r.getInt(6);
                pay=db.r.getInt(7);
                due=(rcharge+mcharge+acharge+micharge+scharge+wcharge)-pay;
                db.ps.close();
                //System.out.println(due);
                db.ps=db.con.prepareStatement("select entry,ward from patinfo where regno=? and caseno=? and flag=0");
                db.ps.setString(1,regno);
                db.ps.setString(2,caseno);
                db.r=db.ps.executeQuery();
                if(db.r.next()) {
                    predate=db.r.getDate(1);
                    preward=db.r.getString(2);
                    int diff=(int)(date.getTime() - predate.getTime()) / 86400000 ;
                    if(diff==0) {
                        diff=1;
                    }
                    if(preward.equals("General")) {
                        wcharge=wcharge+(diff*300);
                        due=due+(diff*300);
                    } else if (preward.equals("Cottage")) {
                        wcharge=wcharge+(diff*1000);
                        due=due+(diff*1000);
                    } else if(preward.equals("ICU")) {
                        wcharge=wcharge+(diff*2000);
                        due=due+(diff*2000);
                    }
                } else {
                    labelSucess.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                    labelSucess.setForeground(new java.awt.Color(204, 0, 0));
                    labelSucess.setText("Invalid Entry");
                    this.setEnabled(false);
                    dialogSucesss.setVisible(true);
                    return;
                }

                db.closeAll();
                if(due>0 || due<0){
                    labelSucess.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                    labelSucess.setForeground(new java.awt.Color(204, 0, 0));
                    labelSucess.setText("Clear Dues First");
                    this.setEnabled(false);
                    dialogSucesss.setVisible(true);
                    textCase.setText(null);
                    textReg.setText(null);
                } else if(due==0){
                    labelSucess.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                    labelSucess.setForeground(new java.awt.Color(204, 0, 0));
                    labelSucess.setText("No Dues Left");
                    this.setEnabled(false);
                    dialogSucesss.setVisible(true);
                }
            }
        } catch(Exception e){
            // jTextArea1.setText(e.toString());
        }
    }//GEN-LAST:event_textCaseFocusLost

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked

        this.setVisible(false);
        q.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelMouseClicked

    private void buttonDischargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDischargeMouseClicked
        try {
            Database db=new Database();
            db.getConnection();
            db.ps=db.con.prepareStatement("update payment set wcharge=? where regno=? and caseno=?");
            db.ps.setInt(1, wcharge);
            db.ps.setString(2, regno);
            db.ps.setString(3, caseno);
            db.ps.executeUpdate();
            db.ps.close();
            db.ps=db.con.prepareStatement("update patinfo set exit=?,flag=1 where regno=? and caseno=? and ward=? and flag=0");
            db.ps.setDate(1,date);
            db.ps.setString(2,regno);
            db.ps.setString(3,caseno);
            db.ps.setString(4, preward);
            db.ps.executeUpdate();
            db.ps.close();
            db.ps=db.con.prepareStatement("select wardno,bedno from patpreinfo where regno=? and caseno=?");
            db.ps.setString(1,regno);
            db.ps.setString(2,caseno);
            db.r=db.ps.executeQuery();
            db.r.next();
            prewardno=db.r.getInt(1);
            prebedno=db.r.getInt(2);
            db.ps.close();
            db.ps=db.con.prepareStatement("delete from patpreinfo where regno=? and caseno=?");
            db.ps.setString(1,regno);
            db.ps.setString(2,caseno);
            db.ps.executeUpdate();
            db.ps.close();
            db.ps=db.con.prepareStatement("insert into freebedinfo values (?,?,?)");
            db.ps.setString(1,preward);
            db.ps.setInt(2,prewardno);
            db.ps.setInt(3, prebedno);
            db.ps.executeUpdate();
            db.closeAll();
        } catch(Exception e) {
            //jTextArea1.setText(e.toString());
        }
        finally {
            labelSucess.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
            labelSucess.setForeground(new java.awt.Color(204, 0, 0));
            this.setEnabled(false);
            dialogSucesss.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDischargeMouseClicked

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClearMouseClicked
        textCase.setText(null);
        textReg.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClearMouseClicked

    /**
    * @param args the command line arguments
    *//*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dischargePatient().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDischarge;
    private javax.swing.JButton buttonOk;
    private javax.swing.JDialog dialogSucesss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelDischarge;
    private javax.swing.JLabel labelSucess;
    private javax.swing.JTextField textCase;
    private javax.swing.JTextField textReg;
    // End of variables declaration//GEN-END:variables
}

package hospital;

public class admitPatient extends javax.swing.JFrame {
    String ward;
    int wardno=0,bedno=0;
    String regno;
    String caseno;
    String disease;
    java.sql.Date dat;
    String time;
    home q;

    /** Creates new form admitPatient */
    public admitPatient(home h) {
        super("Admit Patient");
        initComponents();
        q=h;
        java.util.Date pre=new java.util.Date();
        int year=pre.getYear();
        int month=pre.getMonth();
        int date1=pre.getDate();
        int hours=pre.getHours();
        int mins=pre.getMinutes();
        int sec=pre.getSeconds();
        time=""+hours+":"+mins+":"+sec;
        dat=new java.sql.Date(year,month,date1);
        labelPutDate.setText(""+date1+"-"+(month+1)+"-"+(year+1900));
        labelPutTime.setText(time);
        labelWard.setVisible(false);
        labelBed.setVisible(false);
        //labelAvailable.setVisible(false);
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
        buttonOk = new javax.swing.JButton();
        labelSucess = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCase = new javax.swing.JLabel();
        labelCaseNo = new javax.swing.JLabel();
        labelReg = new javax.swing.JLabel();
        labelDisease = new javax.swing.JLabel();
        labelAdmitDate = new javax.swing.JLabel();
        labelAdmitTime = new javax.swing.JLabel();
        textReg = new javax.swing.JTextField();
        textDisease = new javax.swing.JTextField();
        labelPutDate = new javax.swing.JLabel();
        labelPutTime = new javax.swing.JLabel();
        buttonClear = new javax.swing.JButton();
        buttonSubmit = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelDesiredWard = new javax.swing.JLabel();
        labelWard = new javax.swing.JLabel();
        labelWardNo = new javax.swing.JLabel();
        comboWard = new javax.swing.JComboBox();
        labelBed = new javax.swing.JLabel();
        labelBedNo = new javax.swing.JLabel();
        labelAvailable = new javax.swing.JLabel();
        labelAdvance = new javax.swing.JLabel();
        textAdvance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        dialogSucesss.setAlwaysOnTop(true);
        dialogSucesss.setBounds(new java.awt.Rectangle(471, 284, 337, 231));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        buttonOk.setText("OK");
        buttonOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonOkMouseClicked(evt);
            }
        });

        labelSucess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSucess.setText("      Patient Admitted Sucessfully");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(labelSucess, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelSucess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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
        setBounds(new java.awt.Rectangle(245, 165, 785, 465));

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Admission ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 210, 40);

        labelCase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCase.setText("Case No.");
        jPanel2.add(labelCase);
        labelCase.setBounds(280, 70, 47, 14);

        labelCaseNo.setText("    ");
        jPanel2.add(labelCaseNo);
        labelCaseNo.setBounds(409, 64, 140, 20);

        labelReg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelReg.setText("Reg. No.");
        jPanel2.add(labelReg);
        labelReg.setBounds(280, 30, 60, 14);

        labelDisease.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDisease.setText("Disease");
        jPanel2.add(labelDisease);
        labelDisease.setBounds(280, 110, 44, 14);

        labelAdmitDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAdmitDate.setText("Date of Admission");
        jPanel2.add(labelAdmitDate);
        labelAdmitDate.setBounds(280, 260, 102, 14);

        labelAdmitTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAdmitTime.setText("Time of Admission");
        jPanel2.add(labelAdmitTime);
        labelAdmitTime.setBounds(280, 300, 103, 14);

        textReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRegActionPerformed(evt);
            }
        });
        textReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textRegFocusLost(evt);
            }
        });
        jPanel2.add(textReg);
        textReg.setBounds(410, 20, 143, 20);
        jPanel2.add(textDisease);
        textDisease.setBounds(410, 110, 143, 20);

        labelPutDate.setText("jLabel8");
        jPanel2.add(labelPutDate);
        labelPutDate.setBounds(460, 260, 140, 14);

        labelPutTime.setText("jLabel9");
        jPanel2.add(labelPutTime);
        labelPutTime.setBounds(460, 300, 120, 14);

        buttonClear.setText("Clear");
        buttonClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClearMouseClicked(evt);
            }
        });
        jPanel2.add(buttonClear);
        buttonClear.setBounds(290, 380, 70, 20);

        buttonSubmit.setText("Submit");
        buttonSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSubmitMouseClicked(evt);
            }
        });
        jPanel2.add(buttonSubmit);
        buttonSubmit.setBounds(400, 380, 60, 20);

        buttonCancel.setText("Cancel");
        buttonCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancel);
        buttonCancel.setBounds(500, 380, 70, 20);

        labelDesiredWard.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDesiredWard.setText("Desired Ward");
        jPanel2.add(labelDesiredWard);
        labelDesiredWard.setBounds(280, 160, 76, 14);

        labelWard.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelWard.setText("Ward No.");
        jPanel2.add(labelWard);
        labelWard.setBounds(280, 200, 50, 14);
        jPanel2.add(labelWardNo);
        labelWardNo.setBounds(409, 198, 170, 20);

        comboWard.setMaximumRowCount(100);
        comboWard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "General", "Cottage", "ICU" }));
        comboWard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboWardItemStateChanged(evt);
            }
        });
        jPanel2.add(comboWard);
        comboWard.setBounds(410, 160, 170, 20);

        labelBed.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelBed.setText("Bed No.");
        jPanel2.add(labelBed);
        labelBed.setBounds(280, 230, 41, 14);
        jPanel2.add(labelBedNo);
        labelBedNo.setBounds(409, 230, 170, 20);

        labelAvailable.setForeground(new java.awt.Color(204, 0, 0));
        labelAvailable.setText("  ");
        jPanel2.add(labelAvailable);
        labelAvailable.setBounds(299, 203, 216, 14);

        labelAdvance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAdvance.setText("Advance Payment");
        jPanel2.add(labelAdvance);
        labelAdvance.setBounds(280, 340, 110, 14);

        textAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAdvanceActionPerformed(evt);
            }
        });
        jPanel2.add(textAdvance);
        textAdvance.setBounds(410, 340, 148, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pramiti\\Documents\\hopitalproj_images\\regimg3.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 60, 220, 350);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setText("Details");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(130, 60, 140, 42);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClearMouseClicked
        labelAvailable.setText(null);
        textDisease.setText(null);
        textReg.setText(null);
        comboWard.setSelectedIndex(0);
        labelBedNo.setText(null);
        labelWardNo.setText(null);
        labelWard.setVisible(false);
        labelBed.setVisible(false);
        labelCaseNo.setText(null);
        labelAvailable.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClearMouseClicked

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        //home h = new home();
        this.setVisible(false);
        q.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelMouseClicked

    private void buttonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOkMouseClicked
//        home h = new home();
        this.setVisible(false);
        dialogSucesss.setVisible(false);
        q.setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_buttonOkMouseClicked

    private void buttonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSubmitMouseClicked
        disease = textDisease.getText();
        try {
        Database d=new Database();
        d.getConnection();
        d.ps=d.con.prepareStatement("insert into admit values(?,?,?,?,?,?,?)");
        d.ps.setString(1,regno);
        d.ps.setString(2,caseno);
        d.ps.setString(3,disease);
        d.ps.setDate(4,dat);
        d.ps.setString(5, time);
        d.ps.setString(6, null);
        d.ps.setString(7, null);
        d.ps.executeUpdate();
        d.ps.close();
        d.ps=d.con.prepareStatement("delete from freebedinfo where ward=? and wardno=? and bedno=?");
        d.ps.setString(1,ward);
        d.ps.setInt(2,wardno);
        d.ps.setInt(3,bedno);
        d.ps.executeUpdate();
        d.ps.close();
        d.ps=d.con.prepareStatement("insert into patinfo values(?,?,?,?,null,0)");
        d.ps.setString(1,regno);
        d.ps.setString(2,caseno);
        d.ps.setString(3,ward);
        d.ps.setDate(4,dat);
        d.ps.executeUpdate();
        d.ps.close();
        d.ps=d.con.prepareStatement("insert into patpreinfo values(?,?,?,?,?)");
        d.ps.setString(1,regno);
        d.ps.setString(2,caseno);
        d.ps.setString(3,ward);
        d.ps.setInt(4,wardno);
        d.ps.setInt(5,bedno);
        d.ps.executeUpdate();
        d.ps.close();
        d.ps=d.con.prepareStatement("insert into payment values(?,?,?,?,0,0,0,?,0)");
        d.ps.setString(1,regno);
        d.ps.setString(2,caseno);
        if(caseno.equals("1")){
            d.ps.setInt(3,50);
        }else{
            d.ps.setInt(3,0);
        }
        d.ps.setInt(4,150);
        d.ps.setInt(5,Integer.parseInt(textAdvance.getText()));
        d.ps.executeUpdate();
        d.ps.close();
        d.closeAll();
        } catch(Exception e) {}
        finally {
        dialogSucesss.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSubmitMouseClicked

    private void textRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textRegFocusLost
        regno=textReg.getText();
        try {
        Database d=new Database();
        d.getConnection();
        d.ps=d.con.prepareStatement("select caseno from admit where regno = ?");
        d.ps.setString(1,regno);
        d.r=d.ps.executeQuery();
        int i=0;
        while(d.r.next()) {
            i=Integer.parseInt(d.r.getString(1));
        }
        i=i+1;
        caseno=""+i;
        d.closeAll();
        } catch(Exception e) {}
        finally {
            labelCaseNo.setText(caseno);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_textRegFocusLost

    private void textRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRegActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void comboWardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboWardItemStateChanged
        // TODO add your handling code here:
        labelBedNo.setText(null);
        labelWardNo.setText(null);
        labelWard.setVisible(false);
        labelBed.setVisible(false);
        labelAvailable.setText("");
        wardno=0;
        bedno=0;
        try {
        ward=(String)evt.getItem();
        //System.out.println(ward);
        Database d=new Database();
        d.getConnection();
        d.ps=d.con.prepareStatement("select wardno,bedno from freebedinfo where ward= '" + ward + "'");
        //d.ps.setString(1, ward);
        d.r=d.ps.executeQuery();
        if (d.r.next()) {
            wardno=d.r.getInt(1);
            bedno=d.r.getInt(2);
        }
        if(wardno==0) {
            //System.out.println(wardno);
            labelAvailable.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
            labelAvailable.setForeground(new java.awt.Color(204, 0, 0));
            labelAvailable.setText("Not Available!!!");
        }else{
        labelWard.setVisible(true);
        labelBed.setVisible(true);
        labelWardNo.setText(""+wardno);
        labelBedNo.setText(""+bedno);
        }
        d.closeAll();
        } catch(Exception e) {}

    }//GEN-LAST:event_comboWardItemStateChanged

    private void textAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAdvanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAdvanceActionPerformed

    //admitPatient(){}
    /**
    * @param args the command line arguments
    *//*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admitPatient().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JComboBox comboWard;
    private javax.swing.JDialog dialogSucesss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAdmitDate;
    private javax.swing.JLabel labelAdmitTime;
    private javax.swing.JLabel labelAdvance;
    private javax.swing.JLabel labelAvailable;
    private javax.swing.JLabel labelBed;
    private javax.swing.JLabel labelBedNo;
    private javax.swing.JLabel labelCase;
    private javax.swing.JLabel labelCaseNo;
    private javax.swing.JLabel labelDesiredWard;
    private javax.swing.JLabel labelDisease;
    private javax.swing.JLabel labelPutDate;
    private javax.swing.JLabel labelPutTime;
    private javax.swing.JLabel labelReg;
    private javax.swing.JLabel labelSucess;
    private javax.swing.JLabel labelWard;
    private javax.swing.JLabel labelWardNo;
    private javax.swing.JTextField textAdvance;
    private javax.swing.JTextField textDisease;
    private javax.swing.JTextField textReg;
    // End of variables declaration//GEN-END:variables

}
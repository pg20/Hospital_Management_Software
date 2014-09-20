

package hospital;

public class patInfo extends javax.swing.JFrame {
    home q;
    /** Creates new form patInfo */
    public patInfo(home h) {
        super("Patient Information");
        q=h;
        initComponents();
        try{
            Database db=new Database();
            db.getConnection();
            String sql1="select count(*) from patpreinfo";
            db.r=db.stmt.executeQuery(sql1);
            db.r.next();
            int n=db.r.getInt(1);
            String sql="select patient.regno,caseno,name,ward,wardno,bedno from patpreinfo,patient where patient.regno=patpreinfo.regno";
            db.r=db.stmt.executeQuery(sql);
            String s[][]=new String[n][6];
            for(int i=0;i<n;i++) {
                db.r.next();
                s[i][0]=db.r.getString(1);
                s[i][1]=db.r.getString(2);
                s[i][2]=db.r.getString(3);
                s[i][3]=db.r.getString(4);
                s[i][4]=""+db.r.getInt(5);
                s[i][5]=""+db.r.getInt(6);
            }
            db.closeAll();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(s,
            new String [] {
                "Registration No.", "Case No.", "Name", "Ward", "Ward No.", "Bed No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        }catch(Exception e){
        }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(245, 165, 785, 465));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel1.setText(" Patient Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 0, 390, 56);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Registration No.", "Case No.", "Name", "Ward", "Ward No.", "Bed No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 153));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 60, 541, 180);

        jButton1.setText("Ok");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 263, 116, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pramiti\\Documents\\hopitalproj_images\\regimg1.png")); // NOI18N
        jLabel2.setText("      ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-20, 0, 310, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        q.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

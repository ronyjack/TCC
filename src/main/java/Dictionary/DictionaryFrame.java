/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

/**
 *
 * @author ronyjack
 */
public class DictionaryFrame extends javax.swing.JFrame {

    /**
     * Creates new form DictionaryFrame
     */
    public DictionaryFrame() {
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

        pnlMain = new javax.swing.JPanel();
        pnlGrid = new javax.swing.JPanel();
        pnlGridView = new javax.swing.JPanel();
        scrpnlGrid = new javax.swing.JScrollPane();
        tblObjects = new javax.swing.JTable();
        pnlDetailView = new javax.swing.JPanel();
        pnlInformation = new javax.swing.JPanel();
        pnlSQLInformation = new javax.swing.JPanel();
        lblObjectName = new javax.swing.JLabel();
        txtObjectName = new javax.swing.JTextField();
        lblObjectType = new javax.swing.JLabel();
        txtObjectType = new javax.swing.JTextField();
        lblObjectDate = new javax.swing.JLabel();
        txtObjectDate = new javax.swing.JTextField();
        lblObjectUser = new javax.swing.JLabel();
        txtObjectUser = new javax.swing.JTextField();
        pnlSQL = new javax.swing.JPanel();
        scrpnlDetail = new javax.swing.JScrollPane();
        txtareaSQL = new javax.swing.JTextArea();
        pnlButtons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setLayout(new java.awt.BorderLayout());

        pnlGrid.setLayout(new java.awt.CardLayout());

        pnlGridView.setName(""); // NOI18N
        pnlGridView.setLayout(new java.awt.BorderLayout());

        tblObjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrpnlGrid.setViewportView(tblObjects);

        pnlGridView.add(scrpnlGrid, java.awt.BorderLayout.PAGE_START);

        pnlGrid.add(pnlGridView, "cardGrid");

        pnlDetailView.setLayout(new java.awt.BorderLayout());

        pnlInformation.setLayout(new java.awt.BorderLayout());

        lblObjectName.setText("Nome objeto: ");
        lblObjectName.setToolTipText("");
        pnlSQLInformation.add(lblObjectName);

        txtObjectName.setEnabled(false);
        txtObjectName.setPreferredSize(new java.awt.Dimension(170, 20));
        pnlSQLInformation.add(txtObjectName);

        lblObjectType.setText("Tipo objeto: ");
        pnlSQLInformation.add(lblObjectType);

        txtObjectType.setEnabled(false);
        txtObjectType.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSQLInformation.add(txtObjectType);

        lblObjectDate.setText("Data inserção: ");
        pnlSQLInformation.add(lblObjectDate);

        txtObjectDate.setEnabled(false);
        txtObjectDate.setPreferredSize(new java.awt.Dimension(90, 20));
        pnlSQLInformation.add(txtObjectDate);

        lblObjectUser.setText("Usuário: ");
        pnlSQLInformation.add(lblObjectUser);

        txtObjectUser.setEnabled(false);
        txtObjectUser.setPreferredSize(new java.awt.Dimension(80, 20));
        pnlSQLInformation.add(txtObjectUser);

        pnlInformation.add(pnlSQLInformation, java.awt.BorderLayout.EAST);

        pnlDetailView.add(pnlInformation, java.awt.BorderLayout.NORTH);

        pnlSQL.setLayout(new java.awt.BorderLayout());

        txtareaSQL.setColumns(20);
        txtareaSQL.setRows(5);
        scrpnlDetail.setViewportView(txtareaSQL);

        pnlSQL.add(scrpnlDetail, java.awt.BorderLayout.CENTER);

        pnlDetailView.add(pnlSQL, java.awt.BorderLayout.CENTER);

        pnlGrid.add(pnlDetailView, "cardDetail");

        pnlMain.add(pnlGrid, java.awt.BorderLayout.CENTER);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(17, 17, 17))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pnlMain.add(pnlButtons, java.awt.BorderLayout.EAST);

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel lblObjectDate;
    private javax.swing.JLabel lblObjectName;
    private javax.swing.JLabel lblObjectType;
    private javax.swing.JLabel lblObjectUser;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlDetailView;
    private javax.swing.JPanel pnlGrid;
    private javax.swing.JPanel pnlGridView;
    private javax.swing.JPanel pnlInformation;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSQL;
    private javax.swing.JPanel pnlSQLInformation;
    private javax.swing.JScrollPane scrpnlDetail;
    private javax.swing.JScrollPane scrpnlGrid;
    private javax.swing.JTable tblObjects;
    private javax.swing.JTextField txtObjectDate;
    private javax.swing.JTextField txtObjectName;
    private javax.swing.JTextField txtObjectType;
    private javax.swing.JTextField txtObjectUser;
    private javax.swing.JTextArea txtareaSQL;
    // End of variables declaration//GEN-END:variables
}

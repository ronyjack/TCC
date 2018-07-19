/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import Database.DAO;
import Users.UserFrame;
import Users.UserInstance;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import sun.java2d.SunGraphicsEnvironment;

/**
 *
 * @author gbartholomeu
 */
public class DictionaryFrame extends javax.swing.JFrame {

    private final JFrame parentFrame;
    private final static Logger LOGGER = Logger.getLogger(DictionaryFrame.class.getName());

    private String selectedCard = "cardGrid";
    private CardLayout cardLayout = null;

    private String textArea = "";

    /**
     * Creates new form DictionaryFrame
     *
     * @param parentFrame
     */
    public DictionaryFrame(JFrame parentFrame) {
        initComponents();
        this.parentFrame = parentFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        auxJPM = new javax.swing.JPopupMenu();
        createTemplateJMI = new javax.swing.JMenuItem();
        separador1JS = new javax.swing.JPopupMenu.Separator();
        insertIfJMI = new javax.swing.JMenuItem();
        insertIfElseJMI = new javax.swing.JMenuItem();
        separador2JS = new javax.swing.JPopupMenu.Separator();
        validateObject = new javax.swing.JMenuItem();
        pnlMain = new javax.swing.JPanel();
        tbdpanelMain = new javax.swing.JTabbedPane();
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
        cmbBoxObjectType = new javax.swing.JComboBox<>();
        lblObjectDate = new javax.swing.JLabel();
        txtObjectDate = new javax.swing.JTextField();
        lblObjectUser = new javax.swing.JLabel();
        txtObjectUser = new javax.swing.JTextField();
        pnlSQL = new javax.swing.JPanel();
        scrpnlDetail = new javax.swing.JScrollPane();
        txtareaSQL = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        pnlHistory = new javax.swing.JPanel();
        pnlObjectHistory = new javax.swing.JPanel();
        scrpnlHistoryGrid = new javax.swing.JScrollPane();
        tblObjectHistory = new javax.swing.JTable();
        scrpnlHistoryContent = new javax.swing.JScrollPane();
        txtareaHistoryContent = new javax.swing.JTextArea();
        pnlButtons = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        btnInactivate = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuItemUser = new javax.swing.JMenuItem();
        menuPassword = new javax.swing.JMenuItem();

        createTemplateJMI.setText("Criar com template");
        createTemplateJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTemplateJMIActionPerformed(evt);
            }
        });
        auxJPM.add(createTemplateJMI);
        auxJPM.add(separador1JS);

        insertIfJMI.setText("Inserir cláusula IF");
        insertIfJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertIfJMIActionPerformed(evt);
            }
        });
        auxJPM.add(insertIfJMI);

        insertIfElseJMI.setText("Inserir cláusula IF/ELSE");
        insertIfElseJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertIfElseJMIActionPerformed(evt);
            }
        });
        auxJPM.add(insertIfElseJMI);
        auxJPM.add(separador2JS);

        validateObject.setText("Validar objeto");
        validateObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateObjectActionPerformed(evt);
            }
        });
        auxJPM.add(validateObject);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmDictionary"); // NOI18N

        pnlMain.setLayout(new java.awt.BorderLayout());

        pnlGrid.setLayout(new java.awt.CardLayout());

        pnlGridView.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 1));
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
        tblObjects.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scrpnlGrid.setViewportView(tblObjects);

        pnlGridView.add(scrpnlGrid, java.awt.BorderLayout.CENTER);

        pnlGrid.add(pnlGridView, "cardGrid");

        pnlDetailView.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 1));
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

        cmbBoxObjectType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlSQLInformation.add(cmbBoxObjectType);

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

        pnlInformation.add(pnlSQLInformation, java.awt.BorderLayout.WEST);

        pnlDetailView.add(pnlInformation, java.awt.BorderLayout.NORTH);

        pnlSQL.setLayout(new java.awt.BorderLayout());

        txtareaSQL.setColumns(20);
        txtareaSQL.setRows(5);
        txtareaSQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtareaSQLMouseReleased(evt);
            }
        });
        scrpnlDetail.setViewportView(txtareaSQL);

        pnlSQL.add(scrpnlDetail, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);
        pnlSQL.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        pnlDetailView.add(pnlSQL, java.awt.BorderLayout.CENTER);

        pnlGrid.add(pnlDetailView, "cardDetail");

        tbdpanelMain.addTab("Objetos", pnlGrid);

        pnlHistory.setLayout(new java.awt.BorderLayout());

        pnlObjectHistory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 1));
        pnlObjectHistory.setLayout(new java.awt.BorderLayout());

        tblObjectHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        tblObjectHistory.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scrpnlHistoryGrid.setViewportView(tblObjectHistory);

        pnlObjectHistory.add(scrpnlHistoryGrid, java.awt.BorderLayout.CENTER);

        txtareaHistoryContent.setColumns(20);
        txtareaHistoryContent.setRows(5);
        scrpnlHistoryContent.setViewportView(txtareaHistoryContent);

        pnlObjectHistory.add(scrpnlHistoryContent, java.awt.BorderLayout.SOUTH);

        pnlHistory.add(pnlObjectHistory, java.awt.BorderLayout.CENTER);

        tbdpanelMain.addTab("Histórico", pnlHistory);

        pnlMain.add(tbdpanelMain, java.awt.BorderLayout.CENTER);
        tbdpanelMain.getAccessibleContext().setAccessibleName("tbtPaneMain");

        btnNew.setMnemonic('N');
        btnNew.setText("Novo");
        btnNew.setToolTipText("");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setMnemonic('S');
        btnSave.setText("Salvar");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUndo.setMnemonic('D');
        btnUndo.setText("Desfazer");
        btnUndo.setEnabled(false);
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        btnDetail.setMnemonic('h');
        btnDetail.setText("Detalhe");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnInactivate.setMnemonic('I');
        btnInactivate.setText("Inativar");
        btnInactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUndo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInactivate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUndo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInactivate)
                .addGap(17, 17, 17))
        );

        pnlMain.add(pnlButtons, java.awt.BorderLayout.EAST);

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        menuUser.setText("Usuários");

        menuItemUser.setText("Usuários");
        menuItemUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUserActionPerformed(evt);
            }
        });
        menuUser.add(menuItemUser);

        menuPassword.setText("Trocar senha");
        menuUser.add(menuPassword);

        menuBar.add(menuUser);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        getBtnNew().setEnabled(false);
        getBtnSave().setEnabled(true);
        getBtnUndo().setEnabled(true);
        getBtnDetail().setEnabled(false);
        getBtnInactivate().setEnabled(false);
        loadObjectTypeComboBox();
        fillFieldsEmptyText();
        enabledAllFields(true);
        if ("cardGrid".equalsIgnoreCase(selectedCard)) {
            changeCard();
        }
        textArea = "";
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if ("".equalsIgnoreCase(textArea)) {
            int insertDatabase = DAO.insertIntoDatabase(Constantes.Const.SQL.INSERT_OBJECT.getSqlCode(), getTxtObjectName().getText(), getCmbBoxObjectType().getItemAt(getCmbBoxObjectType().getSelectedIndex()), getTxtAreaSQL().getText(), UserInstance.getUsuarioAtivo());
            if (insertDatabase == 0) {
                JOptionPane.showMessageDialog(this, "Falha ao adicionar objeto");
            } else {
                getBtnNew().setEnabled(true);
                getBtnSave().setEnabled(false);
                getBtnUndo().setEnabled(false);
                getBtnDetail().setEnabled(true);
                getBtnInactivate().setEnabled(true);
                fillObjectsTable(false);
                int lastRow = getTblObjects().convertRowIndexToView(getTblObjects().getModel().getRowCount() - 1);
                getTblObjects().setRowSelectionInterval(lastRow, lastRow);
                fillFieldsFromObject();
            }
        } else {
            int insertDatabase = DAO.updateRegisterDatabase(Constantes.Const.SQL.UPDATE_OBJECT.getSqlCode(), getTxtObjectName().getText(), getCmbBoxObjectType().getItemAt(getCmbBoxObjectType().getSelectedIndex()), getTxtAreaSQL().getText(), UserInstance.getUsuarioAtivo(), getTblObjects().getValueAt(getTblObjects().getSelectedRow(), 0));
            if (insertDatabase == 0) {
                JOptionPane.showMessageDialog(this, "Falha ao atualizar objeto");
            } else {
                getBtnNew().setEnabled(true);
                getBtnSave().setEnabled(false);
                getBtnUndo().setEnabled(false);
                getBtnDetail().setEnabled(true);
                getBtnInactivate().setEnabled(true);
                fillObjectsTable(false);
                int lastRow = getTblObjects().convertRowIndexToView(getTblObjects().getModel().getRowCount() - 1);
                getTblObjects().setRowSelectionInterval(lastRow, lastRow);
                fillFieldsFromObject();
            }
        }
        validateObject();
        changeCard();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        getBtnNew().setEnabled(true);
        //getBtnSave().setEnabled(false);
        //getBtnUndo().setEnabled(false);
        getBtnDetail().setEnabled(getTblObjects().getRowCount() > 0);
        getBtnInactivate().setEnabled(getTblObjects().getRowCount() > 0);
        changeCard();
        //enabledAllFields(false);
    }//GEN-LAST:event_btnUndoActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        if ("cardDetail".equalsIgnoreCase(selectedCard)) {
            getBtnDetail().setText("Detalhe");
        } else {
            getBtnDetail().setText("Grid");
        }
        changeCard();
        fillFieldsFromObject();
        loadObjectTypeComboBox(true);
        textArea = getTxtAreaSQL().getText();
        getBtnSave().setEnabled("cardDetail".equalsIgnoreCase(selectedCard));
        //enabledAllFields(false);
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnInactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivateActionPerformed
        /*int deleteFromDatabase = DAO.deleteFromDatabase(Constantes.Const.SQL.DELETE_OBJECT.getSqlCode(), getTblObjects().getValueAt(getTblObjects().getSelectedRow(), 0));
        if (deleteFromDatabase == 0) {
            JOptionPane.showMessageDialog(this, "Falha ao apagar o objeto do banco");
        } else {
            if ("cardDetail".equalsIgnoreCase(selectedCard)) {
                changeCard();
            }
            fillObjectsTable();
            int lastRow = getTblObjects().convertRowIndexToView(getTblObjects().getModel().getRowCount() - 1);
            getTblObjects().setRowSelectionInterval(lastRow, lastRow);
            getBtnDetail().setEnabled(getTblObjects().getRowCount() > 0);
            getBtnInactivate().setEnabled(getTblObjects().getRowCount() > 0);
        }*/
        int ieConfrma = JOptionPane.showConfirmDialog(getDicFrame(), "Deseja inativar o objeto " + getTblObjects().getValueAt(getTblObjects().getSelectedRow(), 1) + "?", "", JOptionPane.YES_NO_OPTION);

        if (ieConfrma == JOptionPane.YES_OPTION) {
            int deleteFromDatabase = DAO.updateRegisterDatabase(Constantes.Const.SQL.UPDATE_OBJECT_FLAG.getSqlCode(), 0, getTblObjects().getValueAt(getTblObjects().getSelectedRow(), 0));
            if (deleteFromDatabase == 0) {
                JOptionPane.showMessageDialog(this, "Falha ao atualizar o objeto do banco");
            } else {
                if ("cardDetail".equalsIgnoreCase(selectedCard)) {
                    changeCard();
                }
                fillObjectsTable();
                int lastRow = getTblObjects().convertRowIndexToView(getTblObjects().getModel().getRowCount() - 1);
                getTblObjects().setRowSelectionInterval(lastRow, lastRow);
                getBtnDetail().setEnabled(getTblObjects().getRowCount() > 0);
                getBtnInactivate().setEnabled(getTblObjects().getRowCount() > 0);
            }
        }
    }//GEN-LAST:event_btnInactivateActionPerformed

    private void menuItemUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUserActionPerformed
        UserFrame userFr = new UserFrame(getDicFrame());
        SwingUtilities.invokeLater(() -> (userFr.setConfiguration()));
        userFr.setVisible(true);
        getDicFrame().setVisible(false);
    }//GEN-LAST:event_menuItemUserActionPerformed

    private void createTemplateJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTemplateJMIActionPerformed
        callCreateTemplate();
    }//GEN-LAST:event_createTemplateJMIActionPerformed

    private void insertIfJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertIfJMIActionPerformed
        DictionaryFrameController.addIf(txtareaSQL);
    }//GEN-LAST:event_insertIfJMIActionPerformed

    private void insertIfElseJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertIfElseJMIActionPerformed
        DictionaryFrameController.addIfElse(txtareaSQL);
    }//GEN-LAST:event_insertIfElseJMIActionPerformed

    private void txtareaSQLMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtareaSQLMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) {
            auxJPM.show(this, evt.getX() + 20, evt.getY() + 20);
        }
    }//GEN-LAST:event_txtareaSQLMouseReleased

    private void validateObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateObjectActionPerformed
        validateObject();
    }//GEN-LAST:event_validateObjectActionPerformed

    private void validateObject() {
        int delete = DAO.updateRegisterDatabase(DictionaryFrameController.getDropClause(txtObjectName.getText(), isProcedure(), isFunction(), isTrigger()));
        if (delete == 1) {
            JOptionPane.showMessageDialog(this, "Falha ao excluir objeto");
        }

        int i = DAO.updateRegisterDatabase(getTxtAreaSQL().getText());
        if (i == 1) {
            JOptionPane.showMessageDialog(this, "Falha ao validar objeto");
        } else {
            JOptionPane.showMessageDialog(this, "Objeto validado com sucesso");
        }
    }

    private void callCreateTemplate() {
        txtareaSQL.append(DictionaryFrameController.getProcedureFunctionTriggerTemplate(txtObjectName.getText(), isProcedure(), isFunction(), isTrigger()));
    }

    private boolean isProcedure() {
        return (Utils.Utilities.validaString(cmbBoxObjectType.getSelectedItem()).equalsIgnoreCase("PROCEDURE"));
    }

    private boolean isFunction() {
        return (Utils.Utilities.validaString(cmbBoxObjectType.getSelectedItem()).equalsIgnoreCase("FUNCTION"));
    }

    private boolean isTrigger() {
        return (Utils.Utilities.validaString(cmbBoxObjectType.getSelectedItem()).equalsIgnoreCase("TRIGGER"));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu auxJPM;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnInactivate;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUndo;
    private javax.swing.JComboBox<String> cmbBoxObjectType;
    private javax.swing.JMenuItem createTemplateJMI;
    private javax.swing.JMenuItem insertIfElseJMI;
    private javax.swing.JMenuItem insertIfJMI;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblObjectDate;
    private javax.swing.JLabel lblObjectName;
    private javax.swing.JLabel lblObjectType;
    private javax.swing.JLabel lblObjectUser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemUser;
    private javax.swing.JMenuItem menuPassword;
    private javax.swing.JMenu menuUser;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlDetailView;
    private javax.swing.JPanel pnlGrid;
    private javax.swing.JPanel pnlGridView;
    private javax.swing.JPanel pnlHistory;
    private javax.swing.JPanel pnlInformation;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlObjectHistory;
    private javax.swing.JPanel pnlSQL;
    private javax.swing.JPanel pnlSQLInformation;
    private javax.swing.JScrollPane scrpnlDetail;
    private javax.swing.JScrollPane scrpnlGrid;
    private javax.swing.JScrollPane scrpnlHistoryContent;
    private javax.swing.JScrollPane scrpnlHistoryGrid;
    private javax.swing.JPopupMenu.Separator separador1JS;
    private javax.swing.JPopupMenu.Separator separador2JS;
    private javax.swing.JTabbedPane tbdpanelMain;
    private javax.swing.JTable tblObjectHistory;
    private javax.swing.JTable tblObjects;
    private javax.swing.JTextField txtObjectDate;
    private javax.swing.JTextField txtObjectName;
    private javax.swing.JTextField txtObjectUser;
    private javax.swing.JTextArea txtareaHistoryContent;
    private javax.swing.JTextArea txtareaSQL;
    private javax.swing.JMenuItem validateObject;
    // End of variables declaration//GEN-END:variables

    public void setConfiguration() {
        setDicFrameConfiguration();
        getTbdpanelMain().addChangeListener((ChangeEvent e) -> {
            if (e.getSource() instanceof JTabbedPane) {
                JTabbedPane selectedPane = (JTabbedPane) e.getSource();
                if (1 == selectedPane.getSelectedIndex()) {
                    getScrpnlHistoryContent().setPreferredSize(new Dimension(getDicFrame().getWidth(), 500));
                    fillHistoryTable(true);
                    getTxtareaHistoryContent().setText(String.valueOf(getTblObjectHistory().getValueAt(getTblObjectHistory().getSelectedRow(), 1)));
                    getTblObjectHistory().getColumnModel().removeColumn(getTblObjectHistory().getColumnModel().getColumn(1));
                }
                getBtnNew().setEnabled(0 == selectedPane.getSelectedIndex());
                getBtnDetail().setEnabled(0 == selectedPane.getSelectedIndex());
                getBtnInactivate().setEnabled(0 == selectedPane.getSelectedIndex());
            }
        });

        getTblObjectHistory().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        getTxtareaHistoryContent().setText(String.valueOf(getTblObjectHistory().getModel().getValueAt(getTblObjectHistory().getSelectedRow(), 4)));
                    }
                });
            }
        });
        fillObjectsTable();
        setButtonsConfiguration();
        setCardLayout((CardLayout) getPnlGrid().getLayout());
    }

    private void setDicFrameConfiguration() {
        getDicFrame().setLocationRelativeTo(null);
        getDicFrame().setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getDicFrame().setResizable(false);
        Rectangle usableBounds = SunGraphicsEnvironment.getUsableBounds(getDicFrame().getGraphicsConfiguration().getDevice());
        setMaximizedBounds(usableBounds);
        setExtendedState(MAXIMIZED_BOTH);
        getDicFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                parentFrame.setVisible(true);
                parentFrame.dispose();
            }
        });
        getMenuItemUser().setVisible(UserInstance.getInstance().isAdmin());
    }

    private void setButtonsConfiguration() {
        getBtnDetail().setEnabled(getTblObjects().getRowCount() > 0);
        getBtnInactivate().setEnabled(getTblObjects().getRowCount() > 0);
    }

    private void fillObjectsTable() {
        fillObjectsTable(true);
    }

    private void fillObjectsTable(boolean selectFirstRow) {
        ResultSet rs = DAO.selectFromDatabase(Constantes.Const.SQL.SELECT_ALL_DICTIONARY.getSqlCode());

        while (getTblObjects().getRowCount() > 0) {
            ((DefaultTableModel) getTblObjects().getModel()).removeRow(0);
        }
        ((DefaultTableModel) getTblObjects().getModel()).setColumnCount(0);

        ResultSetMetaData rsMd = null;
        int columns = 0;
        try {
            rsMd = (ResultSetMetaData) rs.getMetaData();
            columns = rsMd.getColumnCount();

            for (int i = 1; i <= columns; i++) {
                ((DefaultTableModel) getTblObjects().getModel()).addColumn(getColumnName(rsMd.getColumnName(i)));
            }
        } catch (SQLException ex) {
            LOGGER.info(new StringBuilder("Falha na adição das colunas ao objeto de tabela: ").append(ex).toString());
        }

        try {
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }

                ((DefaultTableModel) getTblObjects().getModel()).insertRow(rs.getRow() - 1, row);
            }
        } catch (SQLException ex) {
            LOGGER.info(new StringBuilder("Falha na adição das linhas ao objeto de tabela: ").append(ex).toString());
        }
        getTblObjects().removeColumn(getTblObjects().getColumnModel().getColumn(3));
        getTblObjects().removeColumn(getTblObjects().getColumnModel().getColumn(5));
        adjustTableColumns(getTblObjects().getColumnModel());
        if (selectFirstRow) {
            getTblObjects().getSelectionModel().setSelectionInterval(0, 0);
        }
    }

    private void adjustTableColumns(TableColumnModel columnModel) {
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            int width = String.valueOf(columnModel.getColumn(i).getHeaderValue()).length();
            columnModel.getColumn(i).setPreferredWidth(width * 10);
        }
    }

    private void fillHistoryTable() {
        fillHistoryTable(true);
    }

    private void fillHistoryTable(boolean selectFirstRow) {
        ResultSet rs = DAO.selectFromDatabase(Constantes.Const.SQL.SELECT_ALL_DICTIONARY_HISTORY.getSqlCode(), getTblObjects().getValueAt(getTblObjects().getSelectedRow(), 0));

        while (getTblObjectHistory().getRowCount() > 0) {
            ((DefaultTableModel) getTblObjectHistory().getModel()).removeRow(0);
        }
        ((DefaultTableModel) getTblObjectHistory().getModel()).setColumnCount(0);

        ResultSetMetaData rsMd = null;
        int columns = 0;
        try {
            rsMd = (ResultSetMetaData) rs.getMetaData();
            columns = rsMd.getColumnCount();

            for (int i = 1; i <= columns; i++) {
                ((DefaultTableModel) getTblObjectHistory().getModel()).addColumn(getColumnName(rsMd.getColumnName(i)));
            }
        } catch (SQLException ex) {
            LOGGER.info(new StringBuilder("Falha na adição das colunas ao objeto de tabela: ").append(ex).toString());
        }

        try {
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }

                ((DefaultTableModel) getTblObjectHistory().getModel()).insertRow(rs.getRow() - 1, row);
            }
        } catch (SQLException ex) {
            LOGGER.info(new StringBuilder("Falha na adição das linhas ao objeto de tabela: ").append(ex).toString());
        }
        getTblObjectHistory().removeColumn(getTblObjectHistory().getColumnModel().getColumn(1));
        getTblObjectHistory().removeColumn(getTblObjectHistory().getColumnModel().getColumn(1));
        getTblObjectHistory().removeColumn(getTblObjectHistory().getColumnModel().getColumn(1));
        adjustTableColumns(getTblObjectHistory().getColumnModel());
        if (selectFirstRow) {
            getTblObjectHistory().getSelectionModel().setSelectionInterval(0, 0);
        }
    }

    private String getColumnName(String nmColunaCampo) {
        switch (nmColunaCampo) {
            case "nr_sequence": {
                return "Sequência";
            }
            case "ds_name": {
                return "Nome Objeto";
            }
            case "ie_type": {
                return "Tipo Objeto";
            }
            case "dt_insertion": {
                return "Data Inserção";
            }
            case "nm_user": {
                return "Usuário";
            }
        }
        return "Error";
    }

    private void changeCard() {
        if ("cardDetail".equalsIgnoreCase(selectedCard)) {
            selectedCard = "cardGrid";
        } else {
            selectedCard = "cardDetail";
        }
        getCardLayout().show(getPnlGrid(), selectedCard);
    }

    private void loadObjectTypeComboBox() {
        loadObjectTypeComboBox(false);
    }

    private void loadObjectTypeComboBox(boolean selectRecord) {
        String selectType = "";
        if (selectRecord && getCmbBoxObjectType().getSelectedItem() != null) {
            selectType = String.valueOf(getCmbBoxObjectType().getSelectedItem());
        }
        ResultSet objectTypes = DAO.selectFromDatabase(Constantes.Const.SQL.SELECT_OBJECT_TYPES.getSqlCode());
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        List<String> types = new ArrayList<>();
        try {
            while (objectTypes.next()) {
                types.add(objectTypes.getString("ds_object_type"));
            }
        } catch (SQLException ex) {
            LOGGER.info(new StringBuilder().append("Falha na obtenção dos tipos de objeto do banco: ").append(ex).toString());
        }
        for (final String i : types) {
            EventQueue.invokeLater(() -> {
                comboBoxModel.addElement(i);
            });
        }
        getCmbBoxObjectType().setModel(comboBoxModel);
        if (selectRecord) {
            final String selectTypeW = selectType;
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    getCmbBoxObjectType().setSelectedItem(selectTypeW);
                }
            });

        }
    }

    private void fillFieldsEmptyText() {
        String str = "";
        getTxtObjectName().setText(str);
        getCmbBoxObjectType().setSelectedItem(null);
        getTxtObjectDate().setText(str);
        getTxtObjectUser().setText(str);
        getTxtAreaSQL().setText(str);
    }

    private void fillFieldsFromObject() {
        String str = "";
        str = String.valueOf(getTblObjects().getModel().getValueAt(getTblObjects().getSelectedRow(), 1));
        getTxtObjectName().setText(str);
        str = String.valueOf(getTblObjects().getModel().getValueAt(getTblObjects().getSelectedRow(), 2));
        getCmbBoxObjectType().setSelectedItem(String.valueOf(str));
        str = String.valueOf(getTblObjects().getModel().getValueAt(getTblObjects().getSelectedRow(), 3));
        getTxtAreaSQL().setText(str);
        str = String.valueOf(getTblObjects().getModel().getValueAt(getTblObjects().getSelectedRow(), 4));
        getTxtObjectDate().setText(str);
        str = String.valueOf(getTblObjects().getModel().getValueAt(getTblObjects().getSelectedRow(), 5));
        getTxtObjectUser().setText(str);
    }

    private void enabledAllFields(boolean enabled) {
        getTxtObjectName().setEnabled(enabled);
        getCmbBoxObjectType().setEnabled(enabled);
        getTxtAreaSQL().setEnabled(enabled);
    }

    public DictionaryFrame getDicFrame() {
        return this;
    }

    public JTable getTblObjects() {
        return tblObjects;
    }

    public JTable getTblObjectHistory() {
        return tblObjectHistory;
    }

    public String getSelectedCard() {
        return selectedCard;
    }

    public void setSelectedCard(String selectedCard) {
        this.selectedCard = selectedCard;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public JPanel getPnlGrid() {
        return pnlGrid;
    }

    public JButton getBtnDetail() {
        return btnDetail;
    }

    public JButton getBtnNew() {
        return btnNew;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnUndo() {
        return btnUndo;
    }

    public JButton getBtnInactivate() {
        return btnInactivate;
    }

    public JTextField getTxtObjectDate() {
        return txtObjectDate;
    }

    public JTextField getTxtObjectName() {
        return txtObjectName;
    }

    public JTextField getTxtObjectUser() {
        return txtObjectUser;
    }

    public JTextArea getTxtAreaSQL() {
        return txtareaSQL;
    }

    public JTabbedPane getTbdpanelMain() {
        return tbdpanelMain;
    }

    public JTextArea getTxtareaHistoryContent() {
        return txtareaHistoryContent;
    }

    public JScrollPane getScrpnlHistoryContent() {
        return scrpnlHistoryContent;
    }

    public JComboBox<String> getCmbBoxObjectType() {
        return cmbBoxObjectType;
    }

    public JMenuItem getMenuItemUser() {
        return menuItemUser;
    }

}

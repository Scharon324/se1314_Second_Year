import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JTable_selected_rows_to_another_jtabel extends javax.swing.JFrame {

    /**
     * Creates new form JTable_selected_rows_to_another_jtabel
     */
    public JTable_selected_rows_to_another_jtabel() {
        initComponents();
    }
                        
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_add_rows = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"1", "vcdsf", "hjtrdsd", "44"},
                    {"2", "fhhjjkur", "wcfbnh", "34"},
                    {"3", "lkijhgf", "cvbge", "76"},
                    {"4", "qsze", "aqwxdfr", "13"},
                    {"5", "ddfghjuu", "vccdffdz", "16"},
                    {"6", "bdhjyu", "grfss", "75"},
                    {"7", "wxzrttyu", "nvfty", "53"},
                    {"8", "aqsstgyu", "xcvgrty", "22"},
                    {"9", "adtyyui", "vxsrryi", "11"},
                    {"10", "rtyuio", "iuytr", "45"}
                },
                new String [] {
                    "Id", "First Name", "Last Name", "Age"
                }
            ));
        jScrollPane1.setViewportView(jTable1);

        jButton_add_rows.setText("Add Selected Rows");
        jButton_add_rows.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_add_rowsActionPerformed(evt);
                }
            });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Id", "First Name", "Last Name", "Age"
                }
            ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_add_rows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton_add_rows)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton_add_rowsActionPerformed(java.awt.event.ActionEvent evt) {                                                 

        TableModel model1 = jTable1.getModel();

        int[] indexs = jTable1.getSelectedRows();

        Object[] row = new Object[4];

        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

        for(int i = 0; i < indexs.length; i++)
        {
            row[0] = model1.getValueAt(indexs[i], 0);

            row[1] = model1.getValueAt(indexs[i], 1);

            row[2] = model1.getValueAt(indexs[i], 2);

            row[3] = model1.getValueAt(indexs[i], 3);

            model2.addRow(row);
        }

    }                                                

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
            java.util.logging.Logger.getLogger(JTable_selected_rows_to_another_jtabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable_selected_rows_to_another_jtabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable_selected_rows_to_another_jtabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable_selected_rows_to_another_jtabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new JTable_selected_rows_to_another_jtabel().setVisible(true);
                }
            });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_add_rows;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration                   
}
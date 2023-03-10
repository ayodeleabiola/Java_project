
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Abiola TheGenius
 */
public class ManageCourseForm extends javax.swing.JFrame {

    Course c=new Course();
    private Object idField;
    public ManageCourseForm() {
        initComponents();
        c.display(courseTable);
        courseTable.setRowHeight(40);
        courseTable.setShowGrid(true);
        courseTable.setSelectionBackground(Color.BLUE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelField = new javax.swing.JTextField();
        spinner = new javax.swing.JSpinner();
        hLabel = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRemoveCourse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        fieldId = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("       Manage Course");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Label:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 201, -1, -1));

        labelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelFieldActionPerformed(evt);
            }
        });
        jPanel1.add(labelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 201, 151, -1));
        jPanel1.add(spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 266, -1, -1));

        hLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hLabel.setText("Hour:");
        jPanel1.add(hLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 262, -1, -1));

        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 108, -1));

        btnRemoveCourse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRemoveCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_1.png"))); // NOI18N
        btnRemoveCourse.setText("Remove");
        btnRemoveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCourseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Label", "Hour"
            }
        ));
        courseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(courseTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 316));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 145, -1, -1));

        fieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdActionPerformed(evt);
            }
        });
        jPanel1.add(fieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 149, 151, -1));

        btnEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
         AddCourseForm addcf=new AddCourseForm();
        addcf.setVisible(true);
       // addcf.pack();
        addcf.setLocationRelativeTo(null);
        addcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCourseActionPerformed
        if(!fieldId.getText().equals("")){
          int id=Integer.valueOf(fieldId.getText());
          String label=labelField.getText();
          int spiner=Integer.valueOf(spinner.getValue().toString());
          c.delete('u',id);
          fieldId.setText("");
          labelField.setText("");
          spinner.setValue(4);
        }
    }//GEN-LAST:event_btnRemoveCourseActionPerformed

    private void labelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelFieldActionPerformed

    private void fieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIdActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void courseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseTableMouseClicked
         int index=courseTable.getSelectedRow();
        fieldId.setText(courseTable.getValueAt(index,0).toString());
        labelField.setText(courseTable.getValueAt(index,1).toString());
        spinner.setValue(Integer.valueOf(courseTable.getValueAt(index,2).toString()));
        System.out.print(index);
    }//GEN-LAST:event_courseTableMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(!c.isCourseExisted(labelField.getText())){
          int id=Integer.valueOf(fieldId.getText());
          String label=labelField.getText();
          int spiner=Integer.valueOf(spinner.getValue().toString());
          c.update('u',id,label,spiner);
         // c.display(ManageCourseForm.courseTable);
          // JOptionPane.showMessageDialog(null,"Course Edited");
        }
       
        else{
             JOptionPane.showMessageDialog(null,"Course Already Existed");
        }
        
           
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageCourseForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemoveCourse;
    private javax.swing.JTable courseTable;
    private javax.swing.JTextField fieldId;
    private javax.swing.JLabel hLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField labelField;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables
}

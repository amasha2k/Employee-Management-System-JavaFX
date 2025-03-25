/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colombo.institute.of.studies;

/**
 *
 * @author ASUS Vivobook
 */
public class Options extends javax.swing.JFrame {

    /**
     * Creates new form Options
     */
    public Options() {
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

        jPanel1 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnaddemp = new javax.swing.JButton();
        btnmanagedep = new javax.swing.JButton();
        btnmanageemp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnviewdep = new javax.swing.JButton();
        btnviewemp = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnadd.setBackground(new java.awt.Color(0, 102, 255));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ADD DEPARTMENT");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnaddemp.setBackground(new java.awt.Color(0, 102, 255));
        btnaddemp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddemp.setForeground(new java.awt.Color(255, 255, 255));
        btnaddemp.setText("ADD EMPLOYEE");
        btnaddemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddempActionPerformed(evt);
            }
        });

        btnmanagedep.setBackground(new java.awt.Color(0, 102, 255));
        btnmanagedep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmanagedep.setForeground(new java.awt.Color(255, 255, 255));
        btnmanagedep.setText("MANAGE  DEPARTMENT DETAILS");
        btnmanagedep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagedepActionPerformed(evt);
            }
        });

        btnmanageemp.setBackground(new java.awt.Color(0, 102, 255));
        btnmanageemp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmanageemp.setForeground(new java.awt.Color(255, 255, 255));
        btnmanageemp.setText("MANAGE  EMPLOYEE DETAILS");
        btnmanageemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageempActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("      OPTIONS");

        btnviewdep.setBackground(new java.awt.Color(0, 102, 255));
        btnviewdep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnviewdep.setForeground(new java.awt.Color(255, 255, 255));
        btnviewdep.setText("VIEW DEPARTMENT DETAILS");
        btnviewdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdepActionPerformed(evt);
            }
        });

        btnviewemp.setBackground(new java.awt.Color(0, 102, 255));
        btnviewemp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnviewemp.setForeground(new java.awt.Color(255, 255, 255));
        btnviewemp.setText("VIEW EMPLOYEE DETAILS");
        btnviewemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewempActionPerformed(evt);
            }
        });

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 195, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmanageemp, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(btnaddemp, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(btnmanagedep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewdep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addComponent(btnback)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnadd)
                .addGap(18, 18, 18)
                .addComponent(btnaddemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnviewdep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnviewemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnmanagedep)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnmanageemp)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnback)
                        .addGap(29, 29, 29))))
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

    private void btnviewempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewempActionPerformed
        {setVisible(false);
            viewEmp employee=new viewEmp();
            employee.setVisible(true);
        }
    }//GEN-LAST:event_btnviewempActionPerformed

    private void btnviewdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdepActionPerformed
        {setVisible(false);
            viewDep department=new viewDep();
            department.setVisible(true);
        }
    }//GEN-LAST:event_btnviewdepActionPerformed

    private void btnmanageempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageempActionPerformed
        {setVisible(false);
            ManageEmpDetail employee=new ManageEmpDetail();
            employee.setVisible(true);
        }
    }//GEN-LAST:event_btnmanageempActionPerformed

    private void btnmanagedepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagedepActionPerformed
        {setVisible(false);
            ManageDepDetail department=new ManageDepDetail();
            department.setVisible(true);
        }
    }//GEN-LAST:event_btnmanagedepActionPerformed

    private void btnaddempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddempActionPerformed
        {setVisible(false);
            AddEmployee employee=new AddEmployee();
            employee.setVisible(true);
        }
    }//GEN-LAST:event_btnaddempActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        {setVisible(false);
            AdaDepartment department=new AdaDepartment();
            department.setVisible(true);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        {setVisible(false);
        hrmanager manager=new hrmanager();
        manager.setVisible(true);
        }
       
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnaddemp;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnmanagedep;
    private javax.swing.JButton btnmanageemp;
    private javax.swing.JButton btnviewdep;
    private javax.swing.JButton btnviewemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

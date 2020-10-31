/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import db.DBconnect;
import java.sql.PreparedStatement;

/**
 *
 * @author charm
 */
public class Emp_Login_Manage extends javax.swing.JFrame {

    /** Creates new form Emp_Reg */
    public Emp_Login_Manage() {
        initComponents();
        setTitle("Manager");
        try{
       Connection conn = DBconnect.connect();
       String c = "SELECT * FROM `login`";
       PreparedStatement st = null;
       st = conn.prepareStatement(c);
       ResultSet rs = st.executeQuery();
       DefaultTableModel tm = (DefaultTableModel)tbl_EM.getModel();
       tm.setRowCount(0);
    
       while(rs.next())
       {
            Object o[] = {rs.getInt("Employee_id"),rs.getString("user_Name"),rs.getString("password"),rs.getInt("status")};
            tm.addRow(o);
       }    

       }
       catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
       catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txt_Search = new javax.swing.JTextField();
        emp_Id = new javax.swing.JTextField();
        emp_User = new javax.swing.JTextField();
        user_Status = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_EM = new javax.swing.JTable();
        emp_Pw = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Registration");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 143, 287, -1));

        jPanel5.setBackground(new java.awt.Color(85, 65, 118));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Update");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 220, 287, -1));

        jPanel6.setBackground(new java.awt.Color(85, 65, 118));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Delete");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 297, 287, -1));

        jPanel7.setBackground(new java.awt.Color(85, 65, 118));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Employee Login Management");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 374, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sign out");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 720, 120, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employer Login Manager");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2715, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Employee ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 161, 22));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Username");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 202, 22));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Password");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 388, 202, 22));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Status");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 202, 28));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 596, 1, 10));

        txt_Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txt_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, 255, 42));

        emp_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(emp_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 208, 228, 42));

        emp_User.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(emp_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 290, 228, 42));

        user_Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(user_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 228, 42));

        btn_Search.setBackground(new java.awt.Color(255, 255, 255));
        btn_Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 137, 163, 42));

        btn_Delete.setBackground(new java.awt.Color(255, 255, 255));
        btn_Delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 585, 86, 42));

        btn_Cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 585, 82, 42));

        btn_Update.setBackground(new java.awt.Color(255, 255, 255));
        btn_Update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 585, 101, 42));

        tbl_EM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Username", "Password", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_EM.getTableHeader().setReorderingAllowed(false);
        tbl_EM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_EMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_EM);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 157, 930, 244));
        jPanel3.add(emp_Pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 372, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(121, 121, 121))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed

        try{
       Connection conn = DBconnect.connect();
       String c = "SELECT * FROM login where Employee_id='"+txt_Search.getText()+"' ";
       Statement st = null;
       st = conn.createStatement();
       ResultSet rs = st.executeQuery(c);

       while(rs.next())
       {
            emp_Id.setText(String.valueOf(rs.getInt("Employee_id")));
            emp_User.setText(rs.getString("User_name"));
            emp_Pw.setText(rs.getString("Password"));
            user_Status.setText(String.valueOf(rs.getInt("Status")));
       }    
       }
       catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
       catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
         int response = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION)
        { 
        try{
            Connection conn = DBconnect.connect();
            String c = "DELETE FROM login where Employee_id='"+emp_Id.getText()+"'";  
            Statement st = null;
            st = conn.createStatement();
            int i = st.executeUpdate(c);
            conn.close();
            if(i==1){JOptionPane.showMessageDialog(null, "Information", "Record deleted successfully ", JOptionPane.INFORMATION_MESSAGE);
            Emp_Login_Manage el = new Emp_Login_Manage();
            el.setVisible(true);
            this.setVisible(false);
            }
            else{JOptionPane.showMessageDialog(null, "Error", "Error in deleting record", JOptionPane.ERROR_MESSAGE);}
            }
            catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
            catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
        
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        if(emp_Pw.getText().equals("")){JOptionPane.showMessageDialog(null, "Error", "Password should not be empty", JOptionPane.ERROR_MESSAGE);}
        else if(user_Status.getText().equals("")) {JOptionPane.showMessageDialog(null, "Error", "Status should not be empty", JOptionPane.ERROR_MESSAGE);}
        else{
        int response = JOptionPane.showConfirmDialog(null, "Do you want to update?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION)
        {
        try{
            Connection conn = DBconnect.connect();
            String c = "UPDATE login SET Password='"+emp_Pw.getText()+"',Status='"+user_Status.getText()+"' where Employee_id='"+emp_Id.getText()+"'";  
            Statement st = null;
            st = conn.createStatement();
            int i = st.executeUpdate(c);
            conn.close();
            if(i==1){JOptionPane.showMessageDialog(null, "Information", "Record updated successfully ", JOptionPane.INFORMATION_MESSAGE);
            Emp_Login_Manage el = new Emp_Login_Manage();
            el.setVisible(true);
            this.setVisible(false);}
            else{JOptionPane.showMessageDialog(null, "Error", "Error in updating record", JOptionPane.ERROR_MESSAGE);}
            }
            catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
            catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
        
        }}
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void tbl_EMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_EMMouseClicked
        // TODO add your handling code here:
        try{
       DefaultTableModel model = (DefaultTableModel)tbl_EM.getModel();
       int selectedRowIndex = tbl_EM.getSelectedRow();
       
       emp_Id.setText(model.getValueAt(selectedRowIndex, 0).toString());
       txt_Search.setText(model.getValueAt(selectedRowIndex, 0).toString());
       emp_User.setText(model.getValueAt(selectedRowIndex, 1).toString());
       emp_Pw.setText(model.getValueAt(selectedRowIndex, 2).toString());
       user_Status.setText(model.getValueAt(selectedRowIndex, 3).toString());
        }

       
       catch(Exception e) {JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_tbl_EMMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Emp_Reg er = new Emp_Reg();
        er.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Emp_Upd eu = new Emp_Upd();
        eu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Emp_Del ed = new Emp_Del();
        ed.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Do you want to log out?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION)
        {
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        // TODO add your handling code here:
        Emp_Upd eu = new Emp_Upd();
                eu.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_btn_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(Emp_Login_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emp_Login_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emp_Login_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emp_Login_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emp_Login_Manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Update;
    private javax.swing.JTextField emp_Id;
    private javax.swing.JTextField emp_Pw;
    private javax.swing.JTextField emp_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tbl_EM;
    private javax.swing.JTextField txt_Search;
    private javax.swing.JTextField user_Status;
    // End of variables declaration//GEN-END:variables

}

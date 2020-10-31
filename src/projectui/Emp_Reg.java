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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import db.DBconnect;

/**
 *
 * @author charm
 */
public class Emp_Reg extends javax.swing.JFrame {

    /** Creates new form Emp_Reg */
    public int val=0;
    public String aa = null;
    
    public Emp_Reg() {
        initComponents();
        setTitle("Manager");
        btn_Register.setEnabled(false);
       try{
       Connection conn = DBconnect.connect();
       String c = "SELECT * FROM `employee` order by Employee_id desc limit 1";
       Statement st = null;
       st = conn.createStatement();
       ResultSet rs = st.executeQuery(c);
    
       while(rs.next())
       {
            val = rs.getInt("Employee_id");
       }    
       val = val + 1;
       emp_id.setText(String.valueOf(val));
       }
       catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
       catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
       
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rbn_Female);
        buttonGroup1.add(rbn_Male);
        
        hideSignup();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        nic_No = new javax.swing.JTextField();
        emp_Name = new javax.swing.JTextField();
        mobile_No = new javax.swing.JTextField();
        emp_Age = new javax.swing.JTextField();
        emp_Address = new javax.swing.JTextField();
        basic_Salary = new javax.swing.JTextField();
        rbn_Male = new javax.swing.JRadioButton();
        rbn_Female = new javax.swing.JRadioButton();
        emp_Category = new javax.swing.JComboBox<>();
        heading = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        lbl_pw = new javax.swing.JLabel();
        lbl_re = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        btn_Check = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Register = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        emp_id = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Employee Registration");
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
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Login Management");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 670, 120, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee Registration");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1881, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Employee ID");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, 137, 22));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NIC No");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 161, 22));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Full Name");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 202, 22));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Mobile Number");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 351, 202, 22));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Age");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 409, 202, 28));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Address");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 202, 22));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Gender");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 538, 202, 22));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Employee Category");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 598, 202, 22));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Basic Salary");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 661, 202, 22));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 11, 513, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 588, 1, 10));

        nic_No.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(nic_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 352, 42));

        emp_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(emp_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 275, 352, 42));

        mobile_No.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(mobile_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 331, 352, 42));

        emp_Age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(emp_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 395, 352, 42));

        emp_Address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(emp_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 352, 42));

        basic_Salary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        basic_Salary.setEnabled(false);
        jPanel3.add(basic_Salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 641, 352, 42));

        rbn_Male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbn_Male.setText("Male");
        jPanel3.add(rbn_Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 537, -1, -1));

        rbn_Female.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbn_Female.setText("Female");
        jPanel3.add(rbn_Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 537, -1, -1));

        emp_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Category", "Maintenance", "Front Desk Clerk", "Accountant", "Manager", "Housekeeping", "Kitchen staff" }));
        emp_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_CategoryActionPerformed(evt);
            }
        });
        jPanel3.add(emp_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 586, 352, 34));

        heading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        heading.setText("System Login Credentials");
        heading.setName("lbl1"); // NOI18N
        jPanel3.add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 141, 239, 27));

        lbl_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_user.setText("Username");
        jPanel3.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 186, 202, 22));

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 186, 212, -1));

        lbl_pw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_pw.setText("Password");
        jPanel3.add(lbl_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 239, 202, 22));

        lbl_re.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_re.setText("Re-Enter password");
        jPanel3.add(lbl_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 291, 202, 22));

        password2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password2ActionPerformed(evt);
            }
        });
        jPanel3.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 291, 212, -1));

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 239, 212, -1));

        btn_Check.setBackground(new java.awt.Color(255, 255, 255));
        btn_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Check.setText("Check Availability");
        btn_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 388, 163, 42));

        btn_Clear.setBackground(new java.awt.Color(255, 255, 255));
        btn_Clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Clear.setText("Clear");
        jPanel3.add(btn_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 388, 130, 42));

        btn_Register.setBackground(new java.awt.Color(255, 255, 255));
        btn_Register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Register.setText("Register");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 701, 163, 42));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Cancel");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 701, 130, 42));

        emp_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 141, 352, 34));
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emp_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_CategoryActionPerformed

        status.setText(null);
        if(emp_Category.getSelectedIndex()!=0){
        try{
       Connection conn = DBconnect.connect();
       String c = "SELECT Basic_salary FROM emp_salary where Emp_category='"+emp_Category.getSelectedItem()+"' " ;
       Statement st = null;
       st = conn.createStatement();
       ResultSet rs = st.executeQuery(c);
    
       while(rs.next())
       {
            basic_Salary.setText(String.valueOf(rs.getDouble("Basic_salary")));
       }  
       
       }   
       catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
       catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}}
        
        if(emp_Category.getSelectedIndex()==1 || emp_Category.getSelectedIndex()==5 || emp_Category.getSelectedIndex()==6)
        {
            hideSignup();
            btn_Register.setEnabled(true);
        }
        if(emp_Category.getSelectedIndex()==2 || emp_Category.getSelectedIndex()==3 || emp_Category.getSelectedIndex()==4)
        {
            btn_Register.setEnabled(false);
            showSignup();
        }        
        if(emp_Category.getSelectedIndex()==0)
        {
            hideSignup();
            basic_Salary.setText(null);
        }
    }//GEN-LAST:event_emp_CategoryActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_password2ActionPerformed

    private void btn_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckActionPerformed

        if(username.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Error", "Username field should not be empty", JOptionPane.ERROR_MESSAGE);
           status.setText("Username field should not be empty");
        }
       else if(password.getText().equals("") || password.getText().length()<6)
       {status.setText("Password should be 6 or more characters long");}
       else if(password2.getText().equals(""))
       {status.setText("Re-enter the password");}
       else if(!(password2.getText().equals(password.getText())))
       {status.setText("Passwords doesn't match");}
       else
       {
       String un = username.getText();
       String pw1 = password2.getText();
       String pw2 = password.getText();
       String un_in = null;
       int a = 0;
       status.setText(null);
       
       try{
       Connection conn = DBconnect.connect();
       String c = "SELECT user_Name FROM login";
       Statement st = null;
       st = conn.createStatement();
       ResultSet rs = st.executeQuery(c);
    
       while(rs.next())
       {    
       un_in = rs.getString("user_Name");  
           if(un_in.equals(un))
           {
               JOptionPane.showMessageDialog(null, "Information" , "Username already taken", JOptionPane.INFORMATION_MESSAGE);
               status.setText("Username already taken");
               a = -1;
               break;
           }
           un_in = null;
       }   
       }
       catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
       catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
       
       if(a!=-1){
       if(pw1.equals(pw2))
       {
           status.setText("Login credentials verified");
           btn_Register.setEnabled(true);
       }
       else
       {
           status.setText("Passwords not match");
       }}
       }
    }//GEN-LAST:event_btn_CheckActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // TODO add your handling code here:
        if(nic_No.getText().equals("")){JOptionPane.showMessageDialog(null, "Error", "NIC should not be empty", JOptionPane.ERROR_MESSAGE);}
        else if(emp_Name.getText().equals("")){JOptionPane.showMessageDialog(null, "Error", "Name should not be empty", JOptionPane.ERROR_MESSAGE);}
        else if(mobile_No.getText().equals("")){JOptionPane.showMessageDialog(null, "Error", "Mobile No should not be empty", JOptionPane.ERROR_MESSAGE);}
        else if(emp_Age.getText().equals("")){JOptionPane.showMessageDialog(null, "Error", "Age should not be empty", JOptionPane.ERROR_MESSAGE);}
        else if(emp_Address.getText().equals("")){JOptionPane.showMessageDialog(null, "Error", "Address should not be empty", JOptionPane.ERROR_MESSAGE);}
        else if(rbn_Female.isSelected()==false && rbn_Male.isSelected()==false){JOptionPane.showMessageDialog(null, "Error", "Select employee gender", JOptionPane.ERROR_MESSAGE);}
        else if(emp_Category.getSelectedIndex()==0){JOptionPane.showMessageDialog(null, "Error", "Select employee category", JOptionPane.ERROR_MESSAGE);}
        else{
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDate today = LocalDate.now(); 
        String gender = null;
        
            if(rbn_Female.isSelected())
            {
            gender = rbn_Female.getText();
            }
            else if(rbn_Male.isSelected())
            {
            gender = rbn_Male.getText();
            }
        


                if(emp_Category.getSelectedIndex()==2 || emp_Category.getSelectedIndex()==3 || emp_Category.getSelectedIndex()==4)
                 {
                      try{
                 Connection conn = DBconnect.connect();
                 String c = "INSERT INTO employee values('"+emp_id.getText()+"','"+nic_No.getText()+"','"+emp_Name.getText()+"','"+emp_Age.getText()+"','"+mobile_No.getText()+"','"+emp_Address.getText()+"','"+gender+"','"+emp_Category.getSelectedItem()+"','"+today+"')";
                 String d = "INSERT INTO login(User_name,Password,Employee_id) values('"+username.getText().toLowerCase()+"','"+password2.getText()+"','"+val+"')";
                 Statement st = null;
                 Statement st2 = null;
                 st = conn.createStatement();
                 st2 = conn.createStatement();
                 int i = st.executeUpdate(c);
                 int k = st2.executeUpdate(d);
                 if(i==1 && k==1)
                 {
                     JOptionPane.showMessageDialog(null, "Information", "Records inserted successfully ", JOptionPane.INFORMATION_MESSAGE);
                     Emp_Reg er = new Emp_Reg();
                     er.setVisible(true);
                     this.setVisible(false);
                 }
                 conn.close();
                  }
                catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
                catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
                 }
               
                else if(emp_Category.getSelectedIndex()==1 || emp_Category.getSelectedIndex()==5 || emp_Category.getSelectedIndex()==6)
                 {
                  try{
                 Connection conn = DBconnect.connect();
                 String c = "INSERT INTO Employee values('"+emp_id.getText()+"','"+nic_No.getText()+"','"+emp_Name.getText()+"','"+emp_Age.getText()+"','"+mobile_No.getText()+"','"+emp_Address.getText()+"','"+gender+"','"+emp_Category.getSelectedItem()+"','"+today+"')";
                 Statement st = null;
                 st = conn.createStatement();
                 int i = st.executeUpdate(c);
                 if(i==1)
                 {
                     JOptionPane.showMessageDialog(null, "Information", "Record inserted successfully ", JOptionPane.INFORMATION_MESSAGE);
                     Emp_Reg er = new Emp_Reg();
                     er.setVisible(true);
                     this.setVisible(false);
                 }
                 conn.close();
                 }
                catch(SQLException e1) { JOptionPane.showMessageDialog(null, "Error", "Database Error", JOptionPane.ERROR_MESSAGE);}
                 catch(Exception e) { JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);}
                }
            
        }
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Emp_Login_Manage el = new Emp_Login_Manage();
        el.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        Emp_Upd eu = new Emp_Upd();
                eu.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    public void showSignup()
    {
        lbl_pw.setVisible(true);
        lbl_re.setVisible(true);
        lbl_user.setVisible(true);
        heading.setVisible(true);
        username.setVisible(true);
        password2.setVisible(true);
        password.setVisible(true);
        btn_Clear.setVisible(true);
        btn_Check.setVisible(true);
    }
    
    public void hideSignup()
    {
        lbl_pw.setVisible(false);
        lbl_re.setVisible(false);
        lbl_user.setVisible(false);
        //jLabel19.setVisible(false);
        heading.setVisible(false);
        username.setVisible(false);
        password2.setVisible(false);
        password.setVisible(false);
        btn_Clear.setVisible(false);
        btn_Check.setVisible(false);
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
            java.util.logging.Logger.getLogger(Emp_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emp_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emp_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emp_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emp_Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField basic_Salary;
    private javax.swing.JButton btn_Check;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emp_Address;
    private javax.swing.JTextField emp_Age;
    private javax.swing.JComboBox<String> emp_Category;
    private javax.swing.JTextField emp_Name;
    private javax.swing.JLabel emp_id;
    private javax.swing.JLabel heading;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_pw;
    private javax.swing.JLabel lbl_re;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextField mobile_No;
    private javax.swing.JTextField nic_No;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JRadioButton rbn_Female;
    private javax.swing.JRadioButton rbn_Male;
    private javax.swing.JLabel status;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}

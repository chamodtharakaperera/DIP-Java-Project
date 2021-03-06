/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectui;


import db.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class pay_out extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    

    /**
     * Creates new form pay_out
     */
    public pay_out() {
        
            initComponents();
            setTitle("Accountant");
          
          
       
    }
    public String id=null;
    public pay_out(String id2) {
        
            initComponents();
            con = DBconnect.connect();
            set_invoice_number();
            id = id2;
  
    }
   public  void set_invoice_number(){
        String sql = "SELECT max(bill_id) as max_inv from bill";
       

        try {
             pst = con.prepareStatement(sql);
             rst =pst.executeQuery();
            while(rst.next()){
                int no = rst.getInt("max_inv"); //  val = rs.getInt("Employee_id");
                lbl_invoice.setText(String.valueOf(no));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pay_out.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt_amt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        src = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        search_tb = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_invoice = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 372, 292, 49));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 314, 292, 49));
        getContentPane().add(txt_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 434, 151, 30));

        jLabel2.setText("Bill Invoice Numner");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 31, 151, 30));

        jLabel3.setText("Customer NIC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 381, 151, 30));

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 121, 400, 40));

        jLabel5.setText("Room Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 323, 151, 30));

        src.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Search Option", "NIC", "ROOM ID", " " }));
        getContentPane().add(src, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 121, 191, 40));

        search_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ROOM ID", "NIC"
            }
        ));
        search_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(search_tb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 168, 400, 87));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 121, -1, 40));
        getContentPane().add(lbl_invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1041, 31, 151, 30));

        jButton2.setText("PAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 516, 66, 36));

        jLabel4.setText("Amount");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 449, 151, 30));

        jButton4.setText("Check Income");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 170, 40));

        btn_logout.setText("Sign out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String value = txt_search.getText();
        String sql = "";
     
        
        int option = src.getSelectedIndex();
        if(option == 0){
         JOptionPane.showConfirmDialog(rootPane, "thejan");
        }
        else if(option == 1){
        sql = "select room_no , id_no from booking where id_no like '%"+value+"%'";
        }
       else if(option == 2 ){
           sql = "select room_no ,id_no from booking where room_no like '%"+value+"%'";
         // 
        }
        
     
       // rst = get_connection.retrive_data(sql);
       
       
        DefaultTableModel tm = (DefaultTableModel)search_tb.getModel();
        tm.setRowCount(0);
        

       try {
           pst = con.prepareStatement(sql);
           rst = pst.executeQuery();
            while(rst.next())
            { if(option == 1){
                    Object o[] = {rst.getString("room_no"),rst.getString("id_no")};
                    tm.addRow(o);
                   // JOptionPane.showConfirmDialog(rootPane, "thejan");
                }
            else if(option == 2){
                Object o[] = {rst.getString("room_no"),rst.getString("id_no")};
                tm.addRow(o);
            }
                
            }} catch (SQLException ex  ) {
            Logger.getLogger(pay_out.class.getName()).log(Level.SEVERE, null, ex);
        }     
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
     String value = txt_search.getText();
        String sql = "";
     
        
        int option = src.getSelectedIndex();
        if(option == 0){
         JOptionPane.showConfirmDialog(rootPane, "thejan");
        }
        else if(option == 1){
        sql = "select room_no , id_no from booking where id_no like '%"+value+"%'";
        }
       else if(option == 2 ){
           sql = "select room_no ,id_no from booking where room_no like '%"+value+"%'";
         // 
        }
        
     
       // rst = get_connection.retrive_data(sql);
       
       
        DefaultTableModel tm = (DefaultTableModel)search_tb.getModel();
        tm.setRowCount(0);
        

       try {
           pst = con.prepareStatement(sql);
           rst = pst.executeQuery();
            while(rst.next())
            { if(option == 1){
                    Object o[] = {rst.getString("room_no"),rst.getString("id_no")};
                    tm.addRow(o);
                   // JOptionPane.showConfirmDialog(rootPane, "thejan");
                }
            else if(option == 2){
                Object o[] = {rst.getString("room_no"),rst.getString("id_no")};
                tm.addRow(o);
            }
                
            }} catch (SQLException ex) {
            Logger.getLogger(pay_out.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_txt_searchKeyReleased

    private void search_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_tbMouseClicked
        DefaultTableModel model = (DefaultTableModel)search_tb.getModel();
        //jLabel17.setText(model.getValueAt(selectedRowIndex, 0).toString());
         int selectedRowIndex = search_tb.getSelectedRow();
        txt1.setText(model.getValueAt(selectedRowIndex , 0).toString());
        txt2.setText(model.getValueAt(selectedRowIndex , 1).toString());
                
    }//GEN-LAST:event_search_tbMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       LocalDate today =LocalDate.now();
        String sql = "select * from booking where room_no = '"+txt1.getText()+"'";
       double amt = 0; int days =0;
       String type = "";
        try {
            pst = con.prepareStatement(sql);
            rst = pst.executeQuery();
            while(rst.next()){
              type = rst.getString("booking_type");
              days = rst.getInt("no_Of_Days");
            }
            
                  sql = "select * from room where room_no = '"+txt1.getText()+"'";
                   pst = con.prepareStatement(sql);
                   rst = pst.executeQuery();
            while(rst.next()){
              if(type.equals("Full Board")){
                   amt = rst.getDouble("fullboard_price");
              }
              else if(type.equals("Half Board")){
                 
                  amt = rst.getDouble("halfboard_Price");
              }
             
            }
            
            amt = amt*days;
            txt_amt.setText(String.valueOf(amt));     
            sql = "insert into bill(room_no,amount,employee_Id,bill_date) values ('"+txt1.getText()+"','"+amt+"','"+id+"','"+today+"')";
            pst =con.prepareStatement(sql);
            pst.executeUpdate();
          
            
            sql = "update room set availability = '1' where room_no = '"+lbl_invoice.getText()+"'";
            pst =con.prepareStatement(sql);
            pst.executeUpdate();
              set_invoice_number();
        } catch (SQLException ex) {
            Logger.getLogger(pay_out.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        reports r = new reports();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Do you want to log out?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION)
        {
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(pay_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pay_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pay_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pay_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pay_out().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_invoice;
    private javax.swing.JTable search_tb;
    private javax.swing.JComboBox<String> src;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JLabel txt_amt;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}

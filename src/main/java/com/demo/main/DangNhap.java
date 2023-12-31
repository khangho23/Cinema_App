/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.main;

import com.demo.form.Form_ChonChiNhanh;
import com.raven.DAO.NguoiDungDao;
import com.raven.helper.ThongBao;
import com.raven.model.NguoiDung;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ngoc Han
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    NguoiDungDao dao;
    ThongBao tb;
    public static Object readObj(String path) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        if (ois == null) {
            return null;
        }
        return ois.readObject();
    }

    public static void writeObj(String path, Object data) throws FileNotFoundException, IOException {
        try (
                 FileOutputStream fos = new FileOutputStream(path);  ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(data);
        }
    }

    public DangNhap() {
//        File f = new File("savetk.txt");
       

        initComponents();
        setLocationRelativeTo(null);
//        showTk();
dao = new NguoiDungDao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblDN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMK = new javax.swing.JLabel();
        lblEmailSDT = new javax.swing.JLabel();
        txtEmailSDT = new javax.swing.JTextField();
        btnDN = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        lblDN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDN.setForeground(new java.awt.Color(255, 255, 255));
        lblDN.setText("ĐĂNG NHẬP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel2FocusGained(evt);
            }
        });
        jLabel2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel2MouseWheelMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(lblDN, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDN)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(242, 239, 202));
        jPanel1.setOpaque(false);

        lblMK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMK.setText("Mật khẩu ");

        lblEmailSDT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmailSDT.setText("Email hoặc số điện thoại ");

        txtEmailSDT.setText("ND01@gmail.com");
        txtEmailSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailSDTActionPerformed(evt);
            }
        });

        btnDN.setBackground(new java.awt.Color(255, 51, 51));
        btnDN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDN.setForeground(new java.awt.Color(255, 255, 255));
        btnDN.setText("ĐĂNG NHẬP");
        btnDN.setBorder(null);
        btnDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDNActionPerformed(evt);
            }
        });

        txtPass.setText("11111111");
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnDN, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMK, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(lblEmailSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblEmailSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMK, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnDN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean CheckValidate(int id, String text){
    if(id ==1){
        if(text.equals("")){
            new ThongBao("Không được bỏ trống Email", 1).show();
            return false;
        }
//        if(!text.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")){
//            new ThongBao("Không đúng định dạng Email",1).show();
//            return false;
//        }
    }else if(id ==2){
        if(text.equals("")){
            new ThongBao("Không được bỏ trống mật khẩu", 1).show();
            return false;
        }
        if(text.length()<8){
            new ThongBao("Mật khẩu phải từ 8 kí tự trở lên",1).show();
            return false;
        }
    }
    return true;
}
    private void btnDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDNActionPerformed
        // TODO add your handling code here:
        String username = txtEmailSDT.getText();
        String pass = txtPass.getText();
        if(!CheckValidate(1, username)){
            return;
        }else if(!CheckValidate(2, pass)){
            return;
        }
        System.out.println(username + "," + pass);
        tb = new ThongBao("", 0);
        dao.Select().stream().forEach(s -> {
            if (username.equalsIgnoreCase(s.getEmail()) && pass.equalsIgnoreCase(s.getMatKhau())) {
                tb = new ThongBao("Đăng nhập thành công", 0);
                tb.show();
                try {
                    writeObj("savetk.txt", s);
                } catch (IOException ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                }
//                Main main = new Main();
                NguoiDungDao.setMaNV(s.getMaNguoiDung());
                Form_ChonChiNhanh cn = new Form_ChonChiNhanh();
                cn.show();
//                main.show();
                this.dispose();
                return;
            }
        });
        if(tb.getNoidung().equals("")){
            tb = new ThongBao("Đăng nhập thất bại vui lòng kiểm tra mật khẩu", 1);
            tb.show();
        }
    }//GEN-LAST:event_btnDNActionPerformed

    private void txtEmailSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailSDTActionPerformed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel2FocusGained
        // TODO add your handling code here:
        //        jLabel2.setBackground(Color.red);
    }//GEN-LAST:event_jLabel2FocusGained

    private void jLabel2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel2MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseWheelMoved

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    public void savetk(String username, String pass) {
        try ( FileOutputStream fout = new FileOutputStream("savetk.txt");  ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(username);
            oos.writeObject(pass);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

//    public void showTk() {
//        File f = new File("savetk.txt");
//        if (f.exists()) {
//            try ( FileInputStream fin = new FileInputStream(f);  ObjectInputStream ois = new ObjectInputStream(fin);) {
//
//                String username = (String) ois.readObject();
//                String pass = (String) ois.readObject();
//                txtEmailSDT.setText(username);
//                txtPass.setText(pass);
//                if (txtEmailSDT.getText().length() > 0) {
////                cbRemember.setSelected(true);
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//    }
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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDN;
    private javax.swing.JLabel lblEmailSDT;
    private javax.swing.JLabel lblMK;
    private javax.swing.JTextField txtEmailSDT;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}

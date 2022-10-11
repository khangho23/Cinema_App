/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import com.raven.DAO.NgayChieuDao;
import com.raven.DAO.PhimDao;
import com.raven.DAO.PhongDao;
import com.raven.DAO.XuatChieuDao;
import com.raven.model.NgayChieu;
import com.raven.model.Phim;
import com.raven.model.PhongChieu;
import com.raven.model.XuatChieu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QingShan
 */
public class Form_QuanLyLichChieu extends javax.swing.JPanel {

    List<Phim> ListPhim = new ArrayList<>();
    List<PhongChieu> ListPhong = new ArrayList<>();
    List<XuatChieu> ListXuatChieu = new ArrayList<>();
    PhimDao daophim;
    PhongDao daoPhong;
    XuatChieuDao daoxuatchieu;
    NgayChieuDao daongaychieu;
    String ngayChieuPhim;
    XuatChieu xc;
    NgayChieu nc;
    int index, index2;
    DefaultTableModel tblModel = new DefaultTableModel();

    /**
     * Creates new form Form_QuanLyLichChieu
     */
    public Form_QuanLyLichChieu() {
        initComponents();
        daophim = new PhimDao();
        daoPhong = new PhongDao();
        daoxuatchieu = new XuatChieuDao();
        daongaychieu = new NgayChieuDao();
        tblXuatChieu.getTableHeader().setOpaque(false);
        tblXuatChieu.getTableHeader().setBackground(Color.RED);
        tblXuatChieu.getTableHeader().setForeground(Color.white);
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 15);
        Font font1 = new Font(Font.SANS_SERIF, Font.ITALIC, 12);
        tblXuatChieu.setFont(font1);
        tblXuatChieu.getTableHeader().setFont(font);
        FillPhimPhong();
        filltotable();

    }

    public void filltotable() {
        tblModel = (DefaultTableModel) tblXuatChieu.getModel();
        ListXuatChieu = daoxuatchieu.Select();
        tblModel.setRowCount(0);
        ListXuatChieu.stream().forEach(s -> {
            Object[] row = new Object[]{s.getStt(), s.getMaPhim(), s.getMaPhong(), s.getNgay(),s.getGiaXuatChieu()};
            tblModel.addRow(row);
        });

    }

    public void FillPhimPhong() {
        ListPhim = daophim.Select();
        ListPhong = daoPhong.Select();
        ListPhim.stream().forEach(s -> {
            cboPhim.addItem(s.getTenPhim());
        });
        ListPhong.stream().forEach(s -> {
            cboPhong.addItem(s.getTenPhong());
        });
    }

    public void InsertNgayXuatChieu() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH: mm");
        String maPhim = ListPhim.get(index).getMaPhim();
        String MaPhong = ListPhong.get(index2).getMaPhong();
        Date gioBatDau = (Date) spGioChieu.getValue();
        Date time = gioBatDau;
        String gioChieuPhim = timeFormat.format(time);
        
        Double GiaXuatChieu = Double.valueOf(txtGia.getText());
//        nc = new NgayChieu(stt, ngayChieuPhim, gioChieuPhim);
//        xc = new XuatChieu(stt, ngayChieuPhim, MaPhong, maPhim, GiaXuatChieu);
//        daongaychieu.insert(nc);
        daoxuatchieu.Insert(xc);
    }

    /**
     *
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboPhim = new javax.swing.JComboBox<>();
        ChonNgay = new com.toedter.calendar.JDateChooser();
        cboPhong = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR);
        spGioChieu = new javax.swing.JSpinner(sm);
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblXuatChieu = new javax.swing.JTable();
        txtGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnXoa1 = new javax.swing.JButton();
        btnThem1 = new javax.swing.JButton();
        btnCapNhat1 = new javax.swing.JButton();

        jLabel6.setText("Giờ Chiếu");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Ngày Chiếu");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Phim");

        cboPhim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPhimItemStateChanged(evt);
            }
        });

        ChonNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ChonNgayPropertyChange(evt);
            }
        });

        cboPhong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPhongItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Phòng");

        JSpinner.DateEditor de = new JSpinner.DateEditor(spGioChieu, "HH:mm");
        spGioChieu.setEditor(de);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Giờ Chiếu");

        tblXuatChieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Phim", "Mã Phòng", "Ngày", "Giá"
            }
        ));
        jScrollPane1.setViewportView(tblXuatChieu);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Giá ");

        btnXoa1.setBackground(new java.awt.Color(153, 0, 0));
        btnXoa1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa1.setText("Xóa");
        btnXoa1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });

        btnThem1.setBackground(new java.awt.Color(153, 0, 0));
        btnThem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem1.setForeground(new java.awt.Color(255, 255, 255));
        btnThem1.setText("Thêm");
        btnThem1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        btnCapNhat1.setBackground(new java.awt.Color(153, 0, 0));
        btnCapNhat1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCapNhat1.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhat1.setText("Cập nhật");
        btnCapNhat1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnThem1)
                        .addGap(66, 66, 66)
                        .addComponent(btnCapNhat1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spGioChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(182, 182, 182))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ChonNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(74, 74, 74)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(cboPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChonNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGioChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem1)
                    .addComponent(btnCapNhat1)
                    .addComponent(btnXoa1))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboPhimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPhimItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cboPhim.getSelectedIndex() >= 0) {
                index = cboPhim.getSelectedIndex();
//                
            }
        }
    }//GEN-LAST:event_cboPhimItemStateChanged

    private void ChonNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ChonNgayPropertyChange
        // TODO add your handling code here:
        if (ChonNgay.getDate() != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
            Date date = ChonNgay.getDate();
            ngayChieuPhim = dateFormat.format(date);
        }
    }//GEN-LAST:event_ChonNgayPropertyChange

    private void cboPhongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPhongItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cboPhong.getSelectedIndex() >= 0) {
                index2 = cboPhong.getSelectedIndex();
            }
        }
    }//GEN-LAST:event_cboPhongItemStateChanged

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
//        dao.Delete(list.get(current).getMaPhim());
//        this.Xoa();
    filltotable();
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
        InsertNgayXuatChieu();
    }//GEN-LAST:event_btnThem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ChonNgay;
    private javax.swing.JButton btnCapNhat1;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JComboBox<String> cboPhim;
    private javax.swing.JComboBox<String> cboPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spGioChieu;
    private javax.swing.JTable tblXuatChieu;
    private javax.swing.JTextField txtGia;
    // End of variables declaration//GEN-END:variables
}

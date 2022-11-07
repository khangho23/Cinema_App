/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import com.raven.DAO.PhongDao;
import com.raven.model.Model_Card;
import com.raven.model.Model_Phong;
import com.raven.model.Model_topping;
import com.raven.model.PhongChieu;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hohoa
 */
public class Form_QLPhong extends javax.swing.JPanel {

    PhongChieu pc = new PhongChieu();
    PhongDao dao;
    List<PhongChieu> listPC = new ArrayList<>();
    Model_Phong mp;

    /**
     * Creates new form Form_QLPhong
     */
    public Form_QLPhong() {
        initComponents();

        dao = new PhongDao();
        listPC.addAll(dao.Select());
        mp = new Model_Phong();
       
        for (PhongChieu pc : listPC) {
            mp = new Model_Phong(pc.getTenPhong());
            mp.setColor1(Color.ORANGE);
            mp.setColor2(Color.BLUE);
            
            pnlQLPhong.add(mp);
            mp.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    pnlQLPhong.removeAll();
                    pnlQLPhong.add(new Form_ChoNgoi());
                    pnlQLPhong.repaint();
                    pnlQLPhong.revalidate();
                }

            });
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

        pnlQLPhong = new javax.swing.JPanel();

        pnlQLPhong.setBackground(new java.awt.Color(255, 255, 255));
        pnlQLPhong.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlQLPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlQLPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlQLPhong;
    // End of variables declaration//GEN-END:variables
}

package View.Admin;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;


public class HomeAdmin extends javax.swing.JPanel {

    public HomeAdmin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_avatar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pn_trangchu = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lb_trangchu = new javax.swing.JLabel();
        pn_sinhvien = new javax.swing.JPanel();
        lb_sinhvien = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pn_phong = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pn_xetduyet = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pn_thongke = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pn_lichtruc = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pn_thongbao = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pn_sukien = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pn_hoadon = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pn_dangxuat = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(17, 144, 119));

        pn_avatar.setBackground(new java.awt.Color(17, 144, 119));
        pn_avatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_avatarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Xin chào, Lương Chin Du");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản trị viên");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-admin-48.png"))); // NOI18N

        javax.swing.GroupLayout pn_avatarLayout = new javax.swing.GroupLayout(pn_avatar);
        pn_avatar.setLayout(pn_avatarLayout);
        pn_avatarLayout.setHorizontalGroup(
            pn_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_avatarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addGroup(pn_avatarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))))
        );
        pn_avatarLayout.setVerticalGroup(
            pn_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_avatarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_avatarLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_avatarLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(27, 27, 27))))
        );

        pn_trangchu.setBackground(new java.awt.Color(17, 144, 119));
        pn_trangchu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_trangchu.setPreferredSize(new java.awt.Dimension(200, 38));
        pn_trangchu.setRequestFocusEnabled(false);
        pn_trangchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_trangchuMouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-home-page-50.png"))); // NOI18N

        lb_trangchu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_trangchu.setForeground(new java.awt.Color(255, 255, 255));
        lb_trangchu.setText("Trang chủ");

        javax.swing.GroupLayout pn_trangchuLayout = new javax.swing.GroupLayout(pn_trangchu);
        pn_trangchu.setLayout(pn_trangchuLayout);
        pn_trangchuLayout.setHorizontalGroup(
            pn_trangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_trangchuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(lb_trangchu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_trangchuLayout.setVerticalGroup(
            pn_trangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_trangchuLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_trangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_trangchu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_sinhvien.setBackground(new java.awt.Color(17, 144, 119));
        pn_sinhvien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_sinhvien.setPreferredSize(new java.awt.Dimension(200, 38));
        pn_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_sinhvienMouseClicked(evt);
            }
        });

        lb_sinhvien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_sinhvien.setForeground(new java.awt.Color(255, 255, 255));
        lb_sinhvien.setText("Sinh viên");
        lb_sinhvien.setAlignmentX(0.5F);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-group-25.png"))); // NOI18N

        javax.swing.GroupLayout pn_sinhvienLayout = new javax.swing.GroupLayout(pn_sinhvien);
        pn_sinhvien.setLayout(pn_sinhvienLayout);
        pn_sinhvienLayout.setHorizontalGroup(
            pn_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sinhvienLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(lb_sinhvien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_sinhvienLayout.setVerticalGroup(
            pn_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sinhvienLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lb_sinhvien)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(pn_sinhvienLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Quản lý");

        pn_phong.setBackground(new java.awt.Color(17, 144, 119));
        pn_phong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_phong.setPreferredSize(new java.awt.Dimension(200, 38));
        pn_phong.setRequestFocusEnabled(false);
        pn_phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_phongMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phòng");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-room-25.png"))); // NOI18N

        javax.swing.GroupLayout pn_phongLayout = new javax.swing.GroupLayout(pn_phong);
        pn_phong.setLayout(pn_phongLayout);
        pn_phongLayout.setHorizontalGroup(
            pn_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_phongLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel17)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_phongLayout.setVerticalGroup(
            pn_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_phongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel7))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pn_xetduyet.setBackground(new java.awt.Color(17, 144, 119));
        pn_xetduyet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_xetduyet.setPreferredSize(new java.awt.Dimension(132, 38));
        pn_xetduyet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_xetduyetMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Xét duyệt");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-verified-25.png"))); // NOI18N

        javax.swing.GroupLayout pn_xetduyetLayout = new javax.swing.GroupLayout(pn_xetduyet);
        pn_xetduyet.setLayout(pn_xetduyetLayout);
        pn_xetduyetLayout.setHorizontalGroup(
            pn_xetduyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_xetduyetLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel18)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_xetduyetLayout.setVerticalGroup(
            pn_xetduyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_xetduyetLayout.createSequentialGroup()
                .addGroup(pn_xetduyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pn_thongke.setBackground(new java.awt.Color(17, 144, 119));
        pn_thongke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_thongke.setPreferredSize(new java.awt.Dimension(132, 38));
        pn_thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_thongkeMouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thống kê");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-graph-report-script-25.png"))); // NOI18N

        javax.swing.GroupLayout pn_thongkeLayout = new javax.swing.GroupLayout(pn_thongke);
        pn_thongke.setLayout(pn_thongkeLayout);
        pn_thongkeLayout.setHorizontalGroup(
            pn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_thongkeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel19)
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_thongkeLayout.setVerticalGroup(
            pn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_thongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel9))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pn_lichtruc.setBackground(new java.awt.Color(17, 144, 119));
        pn_lichtruc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_lichtruc.setPreferredSize(new java.awt.Dimension(132, 38));
        pn_lichtruc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_lichtrucMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lịch trực");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-schedule-25.png"))); // NOI18N

        javax.swing.GroupLayout pn_lichtrucLayout = new javax.swing.GroupLayout(pn_lichtruc);
        pn_lichtruc.setLayout(pn_lichtrucLayout);
        pn_lichtrucLayout.setHorizontalGroup(
            pn_lichtrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_lichtrucLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel20)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_lichtrucLayout.setVerticalGroup(
            pn_lichtrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_lichtrucLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(16, 16, 16))
            .addGroup(pn_lichtrucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        pn_thongbao.setBackground(new java.awt.Color(17, 144, 119));
        pn_thongbao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_thongbao.setPreferredSize(new java.awt.Dimension(132, 38));
        pn_thongbao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_thongbaoMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Thông báo");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-notification-25.png"))); // NOI18N

        javax.swing.GroupLayout pn_thongbaoLayout = new javax.swing.GroupLayout(pn_thongbao);
        pn_thongbao.setLayout(pn_thongbaoLayout);
        pn_thongbaoLayout.setHorizontalGroup(
            pn_thongbaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_thongbaoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_thongbaoLayout.setVerticalGroup(
            pn_thongbaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_thongbaoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        pn_sukien.setBackground(new java.awt.Color(17, 144, 119));
        pn_sukien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_sukien.setPreferredSize(new java.awt.Dimension(132, 38));
        pn_sukien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_sukienMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sự kiện");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-event-25.png"))); // NOI18N

        javax.swing.GroupLayout pn_sukienLayout = new javax.swing.GroupLayout(pn_sukien);
        pn_sukien.setLayout(pn_sukienLayout);
        pn_sukienLayout.setHorizontalGroup(
            pn_sukienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sukienLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel21)
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_sukienLayout.setVerticalGroup(
            pn_sukienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_sukienLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(pn_sukienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel12))
                .addGap(16, 16, 16))
        );

        pn_hoadon.setBackground(new java.awt.Color(17, 144, 119));
        pn_hoadon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_hoadon.setPreferredSize(new java.awt.Dimension(132, 38));
        pn_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_hoadonMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hóa đơn");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-bill-25.png"))); // NOI18N

        javax.swing.GroupLayout pn_hoadonLayout = new javax.swing.GroupLayout(pn_hoadon);
        pn_hoadon.setLayout(pn_hoadonLayout);
        pn_hoadonLayout.setHorizontalGroup(
            pn_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_hoadonLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel22)
                .addGap(32, 32, 32)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_hoadonLayout.setVerticalGroup(
            pn_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_hoadonLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(pn_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Tổng quan");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pn_dangxuat.setBackground(new java.awt.Color(17, 144, 119));
        pn_dangxuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_dangxuat.setPreferredSize(new java.awt.Dimension(132, 38));
        pn_dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_dangxuatMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Đăng xuất");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-logout-50.png"))); // NOI18N

        javax.swing.GroupLayout pn_dangxuatLayout = new javax.swing.GroupLayout(pn_dangxuat);
        pn_dangxuat.setLayout(pn_dangxuatLayout);
        pn_dangxuatLayout.setHorizontalGroup(
            pn_dangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dangxuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_dangxuatLayout.setVerticalGroup(
            pn_dangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dangxuatLayout.createSequentialGroup()
                .addGroup(pn_dangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_dangxuatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_dangxuatLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_sukien, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_hoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_sinhvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_avatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pn_phong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_xetduyet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_thongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_lichtruc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_thongbao, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(pn_dangxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pn_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(pn_trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_sinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_xetduyet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_lichtruc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_sukien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pn_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(242, 172, 119));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1261, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab7", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab8", jPanel10);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab9", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab10", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jTabbedPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pn_avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_avatarMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#CC9966"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_avatarMouseClicked

    private void pn_trangchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_trangchuMouseClicked
        
        jTabbedPane1.setSelectedIndex(1);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#CC9966"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_trangchuMouseClicked

    private void pn_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_sinhvienMouseClicked
        jTabbedPane1.setSelectedIndex(2);
        pn_sinhvien.setBackground(Color.decode("#CC9966"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));

        JOptionPane.showMessageDialog(null, "Lỗi xảy ra!", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_pn_sinhvienMouseClicked

    private void pn_phongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_phongMouseClicked
        jTabbedPane1.setSelectedIndex(3);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#CC9966"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_phongMouseClicked

    private void pn_xetduyetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_xetduyetMouseClicked
       
        jTabbedPane1.setSelectedIndex(4);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#CC9966"));
    }//GEN-LAST:event_pn_xetduyetMouseClicked

    private void pn_thongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_thongkeMouseClicked
        jTabbedPane1.setSelectedIndex(5);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#CC9966"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_thongkeMouseClicked

    private void pn_lichtrucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_lichtrucMouseClicked
        jTabbedPane1.setSelectedIndex(6);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#CC9966"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_lichtrucMouseClicked

    private void pn_thongbaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_thongbaoMouseClicked
        jTabbedPane1.setSelectedIndex(7);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#CC9966"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_thongbaoMouseClicked

    private void pn_sukienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_sukienMouseClicked
        jTabbedPane1.setSelectedIndex(8);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#CC9966"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_sukienMouseClicked

    private void pn_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_hoadonMouseClicked
       
        jTabbedPane1.setSelectedIndex(9);
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#CC9966"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_hoadonMouseClicked

    private void pn_dangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_dangxuatMouseClicked
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#CC9966"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_sukien.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_dangxuatMouseClicked
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
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Main Frame");

        // Tạo một JPanel HomeAdmin
        HomeAdmin homePanel = new HomeAdmin();

        // Thêm HomeAdmin vào cửa sổ JFrame
        frame.add(homePanel);

        // Cài đặt kích thước cửa sổ JFrame thành fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Vô hiệu hóa khả năng thay đổi kích thước cửa sổ
        frame.setResizable(false);

        // Đặt JFrame hiển thị
        frame.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_sinhvien;
    private javax.swing.JLabel lb_trangchu;
    private javax.swing.JPanel pn_avatar;
    private javax.swing.JPanel pn_dangxuat;
    private javax.swing.JPanel pn_hoadon;
    private javax.swing.JPanel pn_lichtruc;
    private javax.swing.JPanel pn_phong;
    private javax.swing.JPanel pn_sinhvien;
    private javax.swing.JPanel pn_sukien;
    private javax.swing.JPanel pn_thongbao;
    private javax.swing.JPanel pn_thongke;
    private javax.swing.JPanel pn_trangchu;
    private javax.swing.JPanel pn_xetduyet;
    // End of variables declaration//GEN-END:variables
}

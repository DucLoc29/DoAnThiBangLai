
package doanthibanglai;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class JFrameManHinhKetQua extends javax.swing.JFrame {
       
   
    
    public JFrameManHinhKetQua() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
        jProgressBarCustomLietKiLuc.setMinimum(0);
        jProgressBarCustomLietKiLuc.setMaximum(300);
        jProgressBarCustomLyThuyetKiLuc.setMinimum(0);
        jProgressBarCustomLyThuyetKiLuc.setMaximum(300);
        jProgressBarCustomBienBaoKiLuc.setMinimum(0);
        jProgressBarCustomBienBaoKiLuc.setMaximum(300);
        jProgressBarCustomSaHinhKiLuc.setMinimum(0);
        jProgressBarCustomSaHinhKiLuc.setMaximum(300);
        jProgressBarCustomTongSoKiLuc.setMinimum(0);
        jProgressBarCustomTongSoKiLuc.setMaximum(300);
        
        jProgressBarCustomLietKetQua.setMinimum(0);
        jProgressBarCustomLietKetQua.setMaximum(300);
        jProgressBarCustomLyThuyetKetQua.setMinimum(0);
        jProgressBarCustomLyThuyetKetQua.setMaximum(300);
        jProgressBarCustomBienBaoKetQua.setMinimum(0);
        jProgressBarCustomBienBaoKetQua.setMaximum(300);
        jProgressBarCustomSaHinhKetQua.setMinimum(0);
        jProgressBarCustomSaHinhKetQua.setMaximum(300);
        jProgressBarCustomTongSoKetQua.setMinimum(0);
        jProgressBarCustomTongSoKetQua.setMaximum(300);
        
        
        ChamDiem chamDiem = new ChamDiem();
        chamDiem.tinhDiem(Main.getDsCauHoiThi(), Main.getDsCauTraLoi());
        
        jLabelKetQua.setText(chamDiem.getKetQua()); // Hien ket qua (PASS/FALES)
                    
        jProgressBarCustomLietKetQua.setValue(300/Main.getSoCauLiet()*chamDiem.getSoCauDungLiet());
        jProgressBarCustomLyThuyetKetQua.setValue(300/Main.getSoCauLyThuyet()*chamDiem.getSoCauDungLyThuyet());
        jProgressBarCustomBienBaoKetQua.setValue(300/Main.getSoCauBienBao()*chamDiem.getSoCauDungBienBao());
        jProgressBarCustomSaHinhKetQua.setValue(300/Main.getSoCauSaHinh()*chamDiem.getSoCauDungSaHinh());
        jProgressBarCustomTongSoKetQua.setValue(300/(Main.getSoCauBienBao() + Main.getSoCauLiet() + Main.getSoCauLyThuyet() + Main.getSoCauSaHinh())*chamDiem.getSoCauDungTongCong());
        
        jLabelLietKetQua.setText(String.valueOf(chamDiem.getSoCauDungLiet()) + "/3");
        jLabelLyThuyetKetQua.setText(String.valueOf(chamDiem.getSoCauDungLyThuyet()) + "/6");
        jLabelBienBaoKetQua.setText(String.valueOf(chamDiem.getSoCauDungBienBao()) + "/6");
        jLabelSaHinhKetQua.setText(String.valueOf(chamDiem.getSoCauDungSaHinh()) + "/5");
        jLabelTongSoKetQua.setText(String.valueOf(chamDiem.getSoCauDungTongCong()) + "/20");
        
        
        KiLuc kiLuc = Main.getKiLuc();
        jProgressBarCustomLietKiLuc.setValue(300/Main.getSoCauLiet()*kiLuc.getSoCauLiet());
        jProgressBarCustomLyThuyetKiLuc.setValue(300/Main.getSoCauLyThuyet()*kiLuc.getSoCauLyThuyet());       
        jProgressBarCustomBienBaoKiLuc.setValue(300/Main.getSoCauBienBao()*kiLuc.getSoCauBienBao());
        jProgressBarCustomSaHinhKiLuc.setValue(300/Main.getSoCauSaHinh()*kiLuc.getSoCauSaHinh());
        jProgressBarCustomTongSoKiLuc.setValue(300/(Main.getSoCauBienBao() + Main.getSoCauLiet() + Main.getSoCauLyThuyet() + Main.getSoCauSaHinh())*kiLuc.getTongSoCau());
        
        jLabelLietKiLuc.setText(String.valueOf(kiLuc.getSoCauLiet()) + "/3");
        jLabelLyThuyetKiLuc.setText(String.valueOf(kiLuc.getSoCauLyThuyet()) + "/6");
        jLabelBienBaoKiLuc.setText(String.valueOf(kiLuc.getSoCauBienBao()) + "/6");
        jLabelSaHinhKiLuc.setText(String.valueOf(kiLuc.getSoCauSaHinh()) + "/5");
        jLabelTongSoKiLuc.setText(String.valueOf(kiLuc.getTongSoCau()) + "/20");
        
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelKetQua = new javax.swing.JLabel();
        troVeButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBarCustomTongSoKiLuc = new doanthibanglai.JProgressBarCustom();
        jProgressBarCustomSaHinhKiLuc = new doanthibanglai.JProgressBarCustom();
        jProgressBarCustomBienBaoKiLuc = new doanthibanglai.JProgressBarCustom();
        jProgressBarCustomLyThuyetKiLuc = new doanthibanglai.JProgressBarCustom();
        jProgressBarCustomLietKiLuc = new doanthibanglai.JProgressBarCustom();
        jLabelLietKiLuc = new javax.swing.JLabel();
        jLabelLyThuyetKiLuc = new javax.swing.JLabel();
        jLabelBienBaoKiLuc = new javax.swing.JLabel();
        jLabelSaHinhKiLuc = new javax.swing.JLabel();
        jLabelTongSoKiLuc = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jProgressBarCustomLietKetQua = new doanthibanglai.JProgressBarCustom();
        jProgressBarCustomLyThuyetKetQua = new doanthibanglai.JProgressBarCustom();
        jProgressBarCustomBienBaoKetQua = new doanthibanglai.JProgressBarCustom();
        jProgressBarCustomSaHinhKetQua = new doanthibanglai.JProgressBarCustom();
        jProgressBarCustomTongSoKetQua = new doanthibanglai.JProgressBarCustom();
        jLabelLietKetQua = new javax.swing.JLabel();
        jLabelLyThuyetKetQua = new javax.swing.JLabel();
        jLabelBienBaoKetQua = new javax.swing.JLabel();
        jLabelSaHinhKetQua = new javax.swing.JLabel();
        jLabelTongSoKetQua = new javax.swing.JLabel();
        xemDapAnButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KẾT QUẢ");

        jLabelKetQua.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelKetQua.setForeground(new java.awt.Color(204, 204, 255));
        jLabelKetQua.setText(" PASS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jLabelKetQua))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabelKetQua)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        troVeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        troVeButton.setText("TRỞ VỀ");
        troVeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troVeButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(242, 242, 222));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("KỈ LỤC GẦN NHẤT");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Liệt");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Sa hình");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("Lý thuyết");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Biển báo");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 102, 0));
        jLabel8.setText("Tổng số");

        jProgressBarCustomTongSoKiLuc.setForeground(new java.awt.Color(204, 102, 0));

        jProgressBarCustomSaHinhKiLuc.setForeground(new java.awt.Color(153, 0, 153));

        jProgressBarCustomBienBaoKiLuc.setForeground(new java.awt.Color(0, 0, 153));

        jProgressBarCustomLyThuyetKiLuc.setForeground(new java.awt.Color(0, 153, 0));

        jProgressBarCustomLietKiLuc.setForeground(new java.awt.Color(204, 0, 0));

        jLabelLietKiLuc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLietKiLuc.setForeground(new java.awt.Color(204, 0, 0));
        jLabelLietKiLuc.setText("3/3");

        jLabelLyThuyetKiLuc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLyThuyetKiLuc.setForeground(new java.awt.Color(0, 153, 0));
        jLabelLyThuyetKiLuc.setText("6/6");

        jLabelBienBaoKiLuc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelBienBaoKiLuc.setForeground(new java.awt.Color(0, 0, 153));
        jLabelBienBaoKiLuc.setText("6/6");

        jLabelSaHinhKiLuc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSaHinhKiLuc.setForeground(new java.awt.Color(153, 0, 153));
        jLabelSaHinhKiLuc.setText("5/5");

        jLabelTongSoKiLuc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTongSoKiLuc.setForeground(new java.awt.Color(204, 102, 0));
        jLabelTongSoKiLuc.setText("20/20");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTongSoKiLuc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jProgressBarCustomTongSoKiLuc, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(jProgressBarCustomBienBaoKiLuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBarCustomLyThuyetKiLuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBarCustomLietKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBarCustomSaHinhKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLietKiLuc)
                            .addComponent(jLabelLyThuyetKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBienBaoKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSaHinhKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jProgressBarCustomLietKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelLietKiLuc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jProgressBarCustomLyThuyetKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLyThuyetKiLuc))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jProgressBarCustomBienBaoKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBienBaoKiLuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jProgressBarCustomSaHinhKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSaHinhKiLuc))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jProgressBarCustomTongSoKiLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTongSoKiLuc))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(220, 228, 225));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("KẾT QUẢ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Liệt");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText("Lý thuyết");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Biển báo");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("Sa hình");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 102, 0));
        jLabel13.setText("Tổng số");

        jProgressBarCustomLietKetQua.setForeground(new java.awt.Color(204, 0, 0));

        jProgressBarCustomLyThuyetKetQua.setForeground(new java.awt.Color(0, 153, 0));

        jProgressBarCustomBienBaoKetQua.setForeground(new java.awt.Color(0, 0, 153));

        jProgressBarCustomSaHinhKetQua.setForeground(new java.awt.Color(153, 0, 153));

        jProgressBarCustomTongSoKetQua.setForeground(new java.awt.Color(204, 102, 0));

        jLabelLietKetQua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLietKetQua.setForeground(new java.awt.Color(204, 0, 0));
        jLabelLietKetQua.setText("3/3");

        jLabelLyThuyetKetQua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLyThuyetKetQua.setForeground(new java.awt.Color(0, 153, 0));
        jLabelLyThuyetKetQua.setText("6/6");

        jLabelBienBaoKetQua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelBienBaoKetQua.setForeground(new java.awt.Color(0, 0, 153));
        jLabelBienBaoKetQua.setText("6/6");

        jLabelSaHinhKetQua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSaHinhKetQua.setForeground(new java.awt.Color(153, 0, 153));
        jLabelSaHinhKetQua.setText("5/5");

        jLabelTongSoKetQua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTongSoKetQua.setForeground(new java.awt.Color(204, 102, 0));
        jLabelTongSoKetQua.setText("20/20");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(192, 192, 192))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBarCustomTongSoKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabelTongSoKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBarCustomSaHinhKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSaHinhKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBarCustomBienBaoKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelBienBaoKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBarCustomLyThuyetKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLyThuyetKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBarCustomLietKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLietKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jProgressBarCustomLietKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLietKetQua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jProgressBarCustomLyThuyetKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLyThuyetKetQua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jProgressBarCustomBienBaoKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBienBaoKetQua))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jProgressBarCustomSaHinhKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSaHinhKetQua))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jProgressBarCustomTongSoKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTongSoKetQua))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        xemDapAnButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xemDapAnButton.setText("XEM ĐÁP ÁN");
        xemDapAnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xemDapAnButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(troVeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(xemDapAnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(troVeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(xemDapAnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void troVeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_troVeButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == troVeButton) {
            
            ChamDiem chamDiem = new ChamDiem();
            chamDiem.tinhDiem(Main.getDsCauHoiThi(), Main.getDsCauTraLoi());
            KiLuc kiLuc = Main.getKiLuc();            
            
            // Gan Ki luc
            
            if(chamDiem.getSoCauDungTongCong() > kiLuc.getTongSoCau()) {
                kiLuc.setSoCauLiet(chamDiem.getSoCauDungLiet());
                kiLuc.setSoCauLyThuyet(chamDiem.getSoCauDungLyThuyet());
                kiLuc.setSoCauBienBao(chamDiem.getSoCauDungBienBao());
                kiLuc.setSoCauSaHinh(chamDiem.getSoCauDungSaHinh());
                kiLuc.setTongSoCau(chamDiem.getSoCauDungTongCong());
                
                Main.setKiLuc(kiLuc);                                      
                
//                System.out.println(kiLuc.getSoCauLiet());
//                System.out.println(kiLuc.getSoCauLyThuyet());
//                System.out.println(kiLuc.getSoCauBienBao());
//                System.out.println(kiLuc.getSoCauSaHinh());
//                System.out.println(kiLuc.getTongSoCau());
                
                                    
                // ghi vao file Ki luc                                              
                String textFileKiLucPath = "src\\KiLuc\\KiLuc.txt";
                Main.getKiLuc().ghiFileKiLuc(textFileKiLucPath);
                                                
            }          
            
                                              
            // Xoa du lieu 
            ArrayList<CauHoi> dsCauHoiThi = Main.getDsCauHoiThi();          
            Map<String, String> dsCauTraLoi = Main.getDsCauTraLoi();
            
            dsCauHoiThi.clear();          
            dsCauTraLoi.clear();
            
            Main.setDsCauHoiThi(dsCauHoiThi);          
            Main.setDsCauTraLoi(dsCauTraLoi);
            
                                          
            this.setVisible(false);
            this.dispose();
            new JFrameManHinhChinh();
        }
    }//GEN-LAST:event_troVeButtonActionPerformed

    private void xemDapAnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xemDapAnButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        
        new JFrameManHinhHienThiDapAn();
    }//GEN-LAST:event_xemDapAnButtonMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameManHinhKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameManHinhKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameManHinhKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameManHinhKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBienBaoKetQua;
    private javax.swing.JLabel jLabelBienBaoKiLuc;
    private javax.swing.JLabel jLabelKetQua;
    private javax.swing.JLabel jLabelLietKetQua;
    private javax.swing.JLabel jLabelLietKiLuc;
    private javax.swing.JLabel jLabelLyThuyetKetQua;
    private javax.swing.JLabel jLabelLyThuyetKiLuc;
    private javax.swing.JLabel jLabelSaHinhKetQua;
    private javax.swing.JLabel jLabelSaHinhKiLuc;
    private javax.swing.JLabel jLabelTongSoKetQua;
    private javax.swing.JLabel jLabelTongSoKiLuc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomBienBaoKetQua;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomBienBaoKiLuc;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomLietKetQua;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomLietKiLuc;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomLyThuyetKetQua;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomLyThuyetKiLuc;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomSaHinhKetQua;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomSaHinhKiLuc;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomTongSoKetQua;
    private doanthibanglai.JProgressBarCustom jProgressBarCustomTongSoKiLuc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton troVeButton;
    private javax.swing.JButton xemDapAnButton;
    // End of variables declaration//GEN-END:variables
}

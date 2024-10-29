/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package JInternalFrameHienThiCauHoi;

import doanthibanglai.CauHoi;
import doanthibanglai.Main;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DASH ST
 */
public class HienThiCau14 extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameCau1
     */
    Color DefaultColor, ClickColor;
    private ArrayList<CauHoi> dsCauHoiThi = Main.getDsCauHoiThi();
    private Map<String, String> dsCauTraLoi = Main.getDsCauTraLoi();
    private String idCauHoi = dsCauHoiThi.get(13).getId();
    
    
    public HienThiCau14() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        // Hien thi mau
        DefaultColor = new Color(246,243,243);
        ClickColor = new Color(153,255,153);
        
        // hien thi mau dap an duoc chon
        String cauTraLoi = dsCauTraLoi.get(idCauHoi);
        if(cauTraLoi.equals("None")) {
            jPanelA.setBackground(DefaultColor);
            jPanelB.setBackground(DefaultColor);
            jPanelC.setBackground(DefaultColor);
        }
        else if (cauTraLoi.equals("A")) {
            jPanelA.setBackground(ClickColor);
            jPanelB.setBackground(DefaultColor);
            jPanelC.setBackground(DefaultColor);
        }
        else if (cauTraLoi.equals("B")) {
            jPanelA.setBackground(DefaultColor);
            jPanelB.setBackground(ClickColor);
            jPanelC.setBackground(DefaultColor);
        }
        else if (cauTraLoi.equals("C")) {
            jPanelA.setBackground(DefaultColor);
            jPanelB.setBackground(DefaultColor);
            jPanelC.setBackground(ClickColor);
        }
        
        
        
        // Cau 1
        CauHoi cauhoi = Main.getDsCauHoiThi().get(13);
                
        // Nhan Anh
        ImageIcon imageIcon = new ImageIcon(cauhoi.getImagePath());
        // Thay doi kich thuoc anh     
        Image resizeImage = imageIcon.getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH);; 
        ImageIcon resizeImageIcon = new ImageIcon(resizeImage);
        // Gan anh vao bien imageLabel1
        imageHienThi.setIcon(resizeImageIcon);
        
        
        // Hien thi cau hoi
        cauHoiHienThi.setText("<html><div style='width:350px;'>" + cauhoi.getQuestion() + "</div></html>");
        
        // Hien thi cau tra loi
        String cauA = "A. " + cauhoi.getA();
        String cauB = "B. " + cauhoi.getB();
        String cauC = "C. " + cauhoi.getC();
        
        cauAHienThi.setText("<html><div style='width:600px;'>" + cauA + "</div></html>");
        cauBHienThi.setText("<html><div style='width:600px;'>" + cauB + "</div></html>");
        cauCHienThi.setText("<html><div style='width:600px;'>" + cauC + "</div></html>");

        
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
        cauHoiHienThi = new javax.swing.JLabel();
        imageHienThi = new javax.swing.JLabel();
        jPanelA = new javax.swing.JPanel();
        cauAHienThi = new javax.swing.JLabel();
        jPanelB = new javax.swing.JPanel();
        cauBHienThi = new javax.swing.JLabel();
        jPanelC = new javax.swing.JPanel();
        cauCHienThi = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cauHoiHienThi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cauHoiHienThi.setText("Cau1");

        imageHienThi.setLabelFor(cauHoiHienThi);

        jPanelA.setBackground(new java.awt.Color(246, 243, 243));
        jPanelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelAMousePressed(evt);
            }
        });

        cauAHienThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cauAHienThi.setText("CauA");

        javax.swing.GroupLayout jPanelALayout = new javax.swing.GroupLayout(jPanelA);
        jPanelA.setLayout(jPanelALayout);
        jPanelALayout.setHorizontalGroup(
            jPanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelALayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(cauAHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelALayout.setVerticalGroup(
            jPanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cauAHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelB.setBackground(new java.awt.Color(246, 243, 243));
        jPanelB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBMousePressed(evt);
            }
        });

        cauBHienThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cauBHienThi.setText("CauB");

        javax.swing.GroupLayout jPanelBLayout = new javax.swing.GroupLayout(jPanelB);
        jPanelB.setLayout(jPanelBLayout);
        jPanelBLayout.setHorizontalGroup(
            jPanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(cauBHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelBLayout.setVerticalGroup(
            jPanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cauBHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelC.setBackground(new java.awt.Color(246, 243, 243));
        jPanelC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelCMousePressed(evt);
            }
        });

        cauCHienThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cauCHienThi.setText("CauC");

        javax.swing.GroupLayout jPanelCLayout = new javax.swing.GroupLayout(jPanelC);
        jPanelC.setLayout(jPanelCLayout);
        jPanelCLayout.setHorizontalGroup(
            jPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(cauCHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelCLayout.setVerticalGroup(
            jPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cauCHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(imageHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(cauHoiHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cauHoiHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAMousePressed
        // TODO add your handling code here:
        
        dsCauTraLoi.put(idCauHoi, "A");
        Main.setDsCauTraLoi(dsCauTraLoi);
        
        jPanelA.setBackground(ClickColor);
        jPanelB.setBackground(DefaultColor);
        jPanelC.setBackground(DefaultColor);
    }//GEN-LAST:event_jPanelAMousePressed

    private void jPanelBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBMousePressed
        // TODO add your handling code here:
        
        dsCauTraLoi.put(idCauHoi, "B");
        Main.setDsCauTraLoi(dsCauTraLoi);
        
        jPanelA.setBackground(DefaultColor);
        jPanelB.setBackground(ClickColor);
        jPanelC.setBackground(DefaultColor);
    }//GEN-LAST:event_jPanelBMousePressed

    private void jPanelCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCMousePressed
        // TODO add your handling code here:
        
        dsCauTraLoi.put(idCauHoi, "C");
        Main.setDsCauTraLoi(dsCauTraLoi);
        
        jPanelA.setBackground(DefaultColor);
        jPanelB.setBackground(DefaultColor);
        jPanelC.setBackground(ClickColor);
    }//GEN-LAST:event_jPanelCMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cauAHienThi;
    private javax.swing.JLabel cauBHienThi;
    private javax.swing.JLabel cauCHienThi;
    private javax.swing.JLabel cauHoiHienThi;
    private javax.swing.JLabel imageHienThi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelA;
    private javax.swing.JPanel jPanelB;
    private javax.swing.JPanel jPanelC;
    // End of variables declaration//GEN-END:variables
}

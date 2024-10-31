/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanthibanglai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author DASH ST
 */
public class Main extends javax.swing.JFrame {
    
    

    
    private static ArrayList<CauHoi> dsCauLiet = new ArrayList<>();
    private static ArrayList<CauHoi> dsCauLyThuyet = new ArrayList<>();
    private static ArrayList<CauHoi> dsCauSaHinh = new ArrayList<>();
    private static ArrayList<CauHoi> dsCauBienBao = new ArrayList<>();
    private static ArrayList<CauHoi> dsCauHoiThi = new ArrayList<>();
    private static Map<String, String> dsCauTraLoi = new HashMap<>();
    
    private static int soCauLyThuyet = 6; 
    private static int soCauLiet = 3;
    private static int soCauBienBao = 6;
    private static int soCauSaHinh = 5;
    
    public Main() {
        initComponents();
    }




    public static void setDsCauLiet(ArrayList<CauHoi> dsCauLiet) {
        Main.dsCauLiet = dsCauLiet;
    }

    public static void setDsCauLyThuyet(ArrayList<CauHoi> dsCauLyThuyet) {
        Main.dsCauLyThuyet = dsCauLyThuyet;
    }

    public static void setDsCauSaHinh(ArrayList<CauHoi> dsCauSaHinh) {
        Main.dsCauSaHinh = dsCauSaHinh;
    }

    public static void setDsCauBienBao(ArrayList<CauHoi> dsCauBienBao) {
        Main.dsCauBienBao = dsCauBienBao;
    }

    public static void setDsCauHoiThi(ArrayList<CauHoi> dsCauHoiThi) {
        Main.dsCauHoiThi = dsCauHoiThi;
    }

    public static void setSoCauLyThuyet(int soCauLyThuyet) {
        Main.soCauLyThuyet = soCauLyThuyet;
    }

    public static void setSoCauLiet(int soCauLiet) {
        Main.soCauLiet = soCauLiet;
    }

    public static void setSoCauBienBao(int soCauBienBao) {
        Main.soCauBienBao = soCauBienBao;
    }

    public static void setSoCauSaHinh(int soCauSaHinh) {
        Main.soCauSaHinh = soCauSaHinh;
    }

    public static void setDsCauTraLoi(Map<String, String> dsCauTraLoi) {
        Main.dsCauTraLoi = dsCauTraLoi;
    }

    
    
    

    public static ArrayList<CauHoi> getDsCauLiet() {
        return dsCauLiet;
    }

    public static ArrayList<CauHoi> getDsCauLyThuyet() {
        return dsCauLyThuyet;
    }

    public static ArrayList<CauHoi> getDsCauSaHinh() {
        return dsCauSaHinh;
    }

    public static ArrayList<CauHoi> getDsCauBienBao() {
        return dsCauBienBao;
    }

    public static ArrayList<CauHoi> getDsCauHoiThi() {
        return dsCauHoiThi;
    }

    public static int getSoCauLyThuyet() {
        return soCauLyThuyet;
    }

    public static int getSoCauLiet() {
        return soCauLiet;
    }

    public static int getSoCauBienBao() {
        return soCauBienBao;
    }

    public static int getSoCauSaHinh() {
        return soCauSaHinh;
    }

    public static Map<String, String> getDsCauTraLoi() {
        return dsCauTraLoi;
    }

    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Duong dan File excel CauHoi
                String excelFileCauLietPath = "src\\FileExcelCauHoi\\CauLiet.xlsx";
                String excelFileCauLyThuyetPath = "src\\FileExcelCauHoi\\CauLyThuyet.xlsx";
                String excelFileCauSaHinhPath = "src\\FileExcelCauHoi\\CauSaHinh.xlsx";
                String excelFileCauBienBaoPath = "src\\FileExcelCauHoi\\CauBienBao.xlsx";

                dsCauLiet = ReadExcel.readCauHoiFromExcel(excelFileCauLietPath);
                dsCauLyThuyet = ReadExcel.readCauHoiFromExcel(excelFileCauLyThuyetPath);
                dsCauSaHinh = ReadExcel.readCauHoiFromExcel(excelFileCauSaHinhPath);
                dsCauBienBao = ReadExcel.readCauHoiFromExcel(excelFileCauBienBaoPath);
                
                // Duong dan File anh CauHoi
                String FileImageCauLietPath = "src\\ImageCauHoi\\CauLietImage";
                String FileImageCauBienBaoPath = "src\\ImageCauHoi\\CauBienBaoImage";
                String FileImageCauSaHinhPath = "src\\ImageCauHoi\\CauSaHinhImage";
                String FileImageCauLyThuyetPath = "src\\ImageCauHoi\\CauLyThuyetImage";

                ReadExcel.addImagePath(dsCauLiet, FileImageCauLietPath);
                ReadExcel.addImagePath(dsCauLyThuyet, FileImageCauLyThuyetPath);
                ReadExcel.addImagePath(dsCauBienBao, FileImageCauBienBaoPath);
                ReadExcel.addImagePath(dsCauSaHinh, FileImageCauSaHinhPath);
                
                new JFrameManHinhChinh();

                
                     
                
                
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

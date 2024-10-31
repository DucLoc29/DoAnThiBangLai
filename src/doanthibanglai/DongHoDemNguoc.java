/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanthibanglai;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author DASH ST
 */
public class DongHoDemNguoc extends Thread {
    private volatile boolean running = true;
    private int totalSeconds;

    public void run(JLabel jLabel, int minutes, int seconds) {
        totalSeconds = minutes * 60 + seconds;

        while (running && totalSeconds >= 0) {
            int displayMinutes = totalSeconds / 60;
            int displaySeconds = totalSeconds % 60;

            
            // Dinh dang dong ho
            String formattedTime = String.format("%02d:%02d", displayMinutes, displaySeconds); 
            System.out.println("Thời gian còn lại: " + formattedTime);
           
            
            // Thay doi JLabel Time tren giao dien nguoi dung
            SwingUtilities.invokeLater(() -> {
                jLabel.setText(formattedTime);
            });
           
            try {
                Thread.sleep(1000); // Tạm dừng 1 giây
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Đặt lại trạng thái ngắt
            }

            totalSeconds--;
        }

        if (totalSeconds < 0) {
            System.out.println("Hết giờ!");
        }
    }

    public void stopClock() {        
        running = false;
    }
}

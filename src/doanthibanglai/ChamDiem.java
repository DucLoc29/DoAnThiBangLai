/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanthibanglai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ChamDiem {
    private int soCauDungTongCong = 0;
    private String ketQua;
    private int soCauDungLiet;
    private int soCauDungSaHinh;
    private int soCauDungLyThuyet;
    private int soCauDungBienBao;
    
    Map<String, String> dsLiet = new HashMap<>();
    Map<String, String> dsSaHinh = new HashMap<>();
    Map<String, String> dsLyThuyet = new HashMap<>();
    Map<String, String> dsBienBao = new HashMap<>();

    
    
    public int getSoCauDungLiet() {
        return soCauDungLiet;
    }

    public int getSoCauDungSaHinh() {
        return soCauDungSaHinh;
    }

    public int getSoCauDungLyThuyet() {
        return soCauDungLyThuyet;
    }

    public int getSoCauDungBienBao() {
        return soCauDungBienBao;
    }
    
    public int getSoCauDungTongCong() {
        return soCauDungTongCong;
    }

    public String getKetQua() {
        return ketQua;
    }
    
    
    
    private void tachCauTraLoi(Map<String, String> dsCauTraLoi) {
        for (String key : dsCauTraLoi.keySet()) {
            // tach ra cac ds cau tra loi
            if (key.startsWith("L") && !key.startsWith("LT")) {
                dsLiet.put(key, dsCauTraLoi.get(key));
            } else if (key.startsWith("LT")) {
                dsLyThuyet.put(key, dsCauTraLoi.get(key));
            } else if (key.startsWith("SH")) {
                dsSaHinh.put(key, dsCauTraLoi.get(key));
            } else if (key.startsWith("BB")) {
                dsBienBao.put(key, dsCauTraLoi.get(key));
            }
                     
        }
    }  
    
    private CauHoi timCauHoiTheoID(ArrayList<CauHoi> dsCauHoiThi, String ID) {
        for(CauHoi cauHoi : dsCauHoiThi) {
            if(cauHoi.getId().equals(ID)) {
                return cauHoi;
            }           
        }
        return null;
    }
    
    private int tinhSoCauDung(ArrayList<CauHoi> dsCauHoiThi, Map<String, String> dsCauTraLoi) {        
        int soCauDung = 0;
        
        
        CauHoi cauHoi;
        String cauTraLoi;
        String dapAnDung;
        for(String key : dsCauTraLoi.keySet()) {
            // lay cau hoi            
            cauHoi = timCauHoiTheoID(dsCauHoiThi, key);
            
            if (cauHoi != null) {
                dapAnDung = cauHoi.getCorrectAnswer();
                cauTraLoi = dsCauTraLoi.get(key);
                if(dapAnDung.equals(cauTraLoi)) {
                    soCauDung++;
                }
            }
            else {
                System.out.println("Ko tim thay cau hoi");
            }
        }
        return soCauDung;
    }
    
    public void tinhDiem(ArrayList<CauHoi> dsCauHoiThi, Map<String, String> dsCauTraLoi) {
        
        tachCauTraLoi(dsCauTraLoi);
        
        int soCauDungLT = tinhSoCauDung(dsCauHoiThi, dsLyThuyet);
        int soCauDungL = tinhSoCauDung(dsCauHoiThi, dsLiet);
        int soCauDungSH = tinhSoCauDung(dsCauHoiThi, dsSaHinh);
        int soCauDungBB = tinhSoCauDung(dsCauHoiThi, dsBienBao);
         
        
        soCauDungLyThuyet = soCauDungLT;
        soCauDungLiet = soCauDungL;
        soCauDungBienBao = soCauDungBB;
        soCauDungSaHinh = soCauDungSH;
        soCauDungTongCong = soCauDungBB + soCauDungL + soCauDungLT + soCauDungSH;
        
        System.out.println("So cau dung Liet: " + soCauDungL);
        System.out.println("So cau dung Ly thuyet: " + soCauDungLT);
        System.out.println("So cau dung Sa hinh: " + soCauDungSH);
        System.out.println("So cau dung Bien bao: " + soCauDungBB);
        
        // Khong sai cau Liet va chinh xac 16 cau thi PASS
        if (soCauDungL == 3 && soCauDungTongCong >= 16) {
            ketQua = " PASS";
        }
        else {
            ketQua = "FALSE";
        }
        
        System.out.println(ketQua);
        
    }
}


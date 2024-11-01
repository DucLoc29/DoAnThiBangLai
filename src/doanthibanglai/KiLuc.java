
package doanthibanglai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class KiLuc {
    private int soCauLyThuyet;
    private int soCauLiet;
    private int soCauBienBao;
    private int soCauSaHinh;
    private int tongSoCau;

    public void setSoCauLyThuyet(int soCauLyThuyet) {
        this.soCauLyThuyet = soCauLyThuyet;
    }

    public void setSoCauLiet(int soCauLiet) {
        this.soCauLiet = soCauLiet;
    }

    public void setSoCauBienBao(int soCauBienBao) {
        this.soCauBienBao = soCauBienBao;
    }

    public void setSoCauSaHinh(int soCauSaHinh) {
        this.soCauSaHinh = soCauSaHinh;
    }

    public void setTongSoCau(int tongSoCau) {
        this.tongSoCau = tongSoCau;
    }

    public int getSoCauLyThuyet() {
        return soCauLyThuyet;
    }

    public int getSoCauLiet() {
        return soCauLiet;
    }

    public int getSoCauBienBao() {
        return soCauBienBao;
    }

    public int getSoCauSaHinh() {
        return soCauSaHinh;
    }

    public int getTongSoCau() {
        return tongSoCau;
    }
       
    public void kiemTraKiLuc(int soCauLiet, int soCauLyThuyet, int soCauBienBao, int soCauSaHinh, int tongSoCau) {
        if (soCauLiet == 3) {
            if (this.tongSoCau < tongSoCau) {
                this.soCauLiet = soCauLiet;
                this.soCauLyThuyet = soCauLyThuyet;
                this.soCauBienBao = soCauBienBao;
                this.tongSoCau = tongSoCau;
            }
        } 
    }
    
    public void ghiFileKiLuc (String fileName) {
        try (FileWriter file = new FileWriter(fileName, false)) { // false = ghi de            
            file.write(this.soCauLyThuyet + "\n");
            file.write(this.soCauLiet + "\n");
            file.write(this.soCauBienBao + "\n");
            file.write(this.soCauSaHinh + "\n"); 
            file.write(this.tongSoCau + "\n");
            System.out.println("Da ghi file");
        } catch (Exception e) {
            System.out.println("Loi ghi vao file: " + e.getMessage());
        }
    }
    
    public void docFileKiLuc (String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            this.soCauLyThuyet = Integer.parseInt(reader.readLine()); 
            this.soCauLiet = Integer.parseInt(reader.readLine()); 
            this.soCauBienBao = Integer.parseInt(reader.readLine()); 
            this.soCauSaHinh = Integer.parseInt(reader.readLine()); 
            this.tongSoCau = Integer.parseInt(reader.readLine());
            
        } catch (Exception e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doanthibanglai;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ReadExcel {
   
    public static boolean isFileExists(String filePath) {
        File file = new File(filePath);

        return file.exists();
    }
    
    public static void addImagePath(ArrayList<CauHoi> dsCauHoi, String FileImageCauHoiPath){
        String noImagePath = "src\\ImageCauHoi\\NoImage.png";
        String imageFilePath = FileImageCauHoiPath; 
        boolean result = true;
        for (CauHoi cauHoi : dsCauHoi) {
            // Ket hop thanh duong dan tuyet doi
            imageFilePath = imageFilePath + "\\" + cauHoi.getImagePath();
            result = isFileExists(imageFilePath);
            
            if(result) {
                cauHoi.setImagePath(imageFilePath);
            }
            else {
                cauHoi.setImagePath(noImagePath);      
            }
            
            imageFilePath = FileImageCauHoiPath;
        }
    }

    public static ArrayList<CauHoi> readCauHoiFromExcel(String excelFilePath) {
        
        ArrayList<CauHoi> danhSachCauHoi = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    // Bỏ qua hàng tiêu đề
                    continue;
                }

                String id = row.getCell(0).getStringCellValue();
                String question = row.getCell(1).getStringCellValue();
                String a = row.getCell(2).getStringCellValue();
                String b = row.getCell(3).getStringCellValue();
                String c = row.getCell(4).getStringCellValue();
                String correctAnswer = row.getCell(5).getStringCellValue();
                String imagePath = id + ".png";
                
                

                CauHoi cauHoi = new CauHoi(id, question, a, b, c, correctAnswer, imagePath);
                danhSachCauHoi.add(cauHoi);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return danhSachCauHoi;
    }
    
    public static void randomAddCauHoi(ArrayList<CauHoi> dsCauHoiThi ,ArrayList<CauHoi> dsCauHoi, int soCau) {
        
        Random random = new Random();
        Set<Integer> dsViTriCauHoiThi = new HashSet<>() ;
        
        int n;
        while(dsViTriCauHoiThi.size() < soCau) {
            n = random.nextInt(dsCauHoi.size());
            dsViTriCauHoiThi.add(n);
        }
        
        for(int vitri : dsViTriCauHoiThi) {
            dsCauHoiThi.add(dsCauHoi.get(vitri));
        }
               
    }
}



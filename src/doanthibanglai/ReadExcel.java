/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doanthibanglai;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ReadExcel {

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

                CauHoi cauHoi = new CauHoi(id, question, a, b, c, correctAnswer);
                danhSachCauHoi.add(cauHoi);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return danhSachCauHoi;
    }

}



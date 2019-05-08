package com.kgisl.qs1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.ComparisonOperator;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * ReadAndWrite
 */
public class Twofile {
    static FileInputStream file;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static List<Marks> markList = new ArrayList();
    static Map<String, Marks[]> data = new TreeMap<String, Marks[]>();

    public static void main(String[] args)throws Exception{
        readExcelFile();
        writeExcelFile();
    }

    public static void readExcelFile() {
        try {
            file = new FileInputStream(new File("d:/results.xlsx"));
            // Create Workbook instance holding reference to .xlsx file
           
           
           
           
           
           
           
            workbook = new XSSFWorkbook(file);

            
            sheet = workbook.getSheetAt(1);

            int noOfRows = sheet.getLastRowNum();
            short noOfColumns = sheet.getRow(0).getLastCellNum();

            markList = new ArrayList();

            data = new TreeMap<String, Marks[]>();
            

            for (int i = sheet.getFirstRowNum() + 1; i <= noOfRows; i++) {
                // System.out.println(i);
                Row currentRow = sheet.getRow(i);
                Marks marks = new Marks();
                for (int j = currentRow.getFirstCellNum(); j <= noOfColumns; j++) {
                  

                    Cell cell = currentRow.getCell(j);
                    // id name college department year mark1 mark2 mark3
                    if (j == 0) {

                        marks.setId((int) cell.getNumericCellValue());
                    }
                    if (j == 1) {
                        marks.setName(cell.getStringCellValue());
                    }
                    if (j == 2) {
                        marks.setCollege(cell.getStringCellValue());
                    }
                    if (j == 3) {
                        marks.setDepartment(cell.getStringCellValue());
                    }
                    if (j == 4) {
                        marks.setYear((int) cell.getNumericCellValue());
                    }
                    if (j == 5) {
                        marks.setMark1((int) cell.getNumericCellValue());
                    }
                    if (j == 6) {
                        marks.setMark2((int) cell.getNumericCellValue());
                    }
                    if (j == 7) {
                        marks.setMark3((int) cell.getNumericCellValue());
                    }

                }
                markList.add(marks);
                
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeExcelFile() {
        // Blank workbook
        workbook = new XSSFWorkbook();

        // Create a blank sheet
        sheet = workbook.createSheet("Results");

        // Create a headerRow
        String[] columns = { "id", "name", "college", "department", "year", "mark1", "mark2", "mark3", "total" };
        Row headerRow = sheet.createRow(0);

        // Create headerRow cells
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
        }

        // Construct data cells

        int rowNum = 1;
        for (Marks employee : markList) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(employee.getId());
            row.createCell(1).setCellValue(employee.getName());
            row.createCell(2).setCellValue(employee.getCollege());
            row.createCell(3).setCellValue(employee.getDepartment());
            row.createCell(4).setCellValue(employee.getYear());
            row.createCell(5).setCellValue(employee.getMark1());
            row.createCell(6).setCellValue(employee.getMark2());
            row.createCell(7).setCellValue(employee.getMark3());

            // Add a new cell as "Total"
            Cell totcell = row.createCell(row.getLastCellNum(), CellType.NUMERIC);
            if (row.getRowNum() != 0) {
                double m1 = row.getCell(5).getNumericCellValue();
                double m2 = row.getCell(6).getNumericCellValue();
                double m3 = row.getCell(7).getNumericCellValue();
                totcell.setCellValue(m1 + m2 + m3);
                ;
            }
        }

        try {
            // Formatting
            cellFormatting();
            // Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("D://studentResults.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("File written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void cellFormatting() {
        SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();

        ConditionalFormattingRule rule2 = sheetCF.createConditionalFormattingRule(ComparisonOperator.LT, "40");
        PatternFormatting fill2 = rule2.createPatternFormatting();
        fill2.setFillBackgroundColor(IndexedColors.RED.index);
        fill2.setFillPattern(PatternFormatting.SOLID_FOREGROUND);

        CellRangeAddress[] regions = { CellRangeAddress.valueOf("F1:F11"), CellRangeAddress.valueOf("G1:G11"),
                CellRangeAddress.valueOf("H1:H11") };

        sheetCF.addConditionalFormatting(regions, rule2);

    }
}













    

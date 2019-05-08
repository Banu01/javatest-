package com.kgisl.qs1;

import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//import java.util.regex.Pattern;

////import javax.swing.text.DefaultStyledDocument.ElementSpec;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFSheetConditionalFormatting;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Count;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.ComparisonOperator;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.IndexedColors;
// import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * Hssfexample
 */
public class Hssfexample {

    public static void main(String args[]) {
        HSSFWorkbook ob = new HSSFWorkbook();
        HSSFSheet sh = ob.createSheet("maintanance");
        HSSFSheetConditionalFormatting format = sh.getSheetConditionalFormatting();

ConditionalFormattingRule rule=format.createConditionalFormattingRule(ComparisonOperator.GT,"50");
 PatternFormatting pattern = rule.createPatternFormatting();
 pattern.setFillBackgroundColor(IndexedColors.BROWN.index);
 pattern.setFillPattern(PatternFormatting.NO_FILL);
 CellRangeAddress[] cell={CellRangeAddress.valueOf("A2:A4"),
 CellRangeAddress.valueOf("B2:B4"),
 CellRangeAddress.valueOf("c3:c5")};

    
format.addConditionalFormatting(cell, rule);

Map<String,Object[]> mm=new TreeMap<String,Object[]>();
mm.put("1",new Object[] {"id","name","address","m1","m2","m3"});
mm.put("2",new Object[] {1,"banu","mtp",33,44,56});
mm.put("3",new Object[] {2,"uma","cbe",56,76,56});
Set<String> set=mm.keySet();
int r=0;
for(String key:set)
{
Row row=sh.createRow(r++);
Object[] obarr=mm.get(key);

int c=0;
for(Object obj:obarr)
{
Cell celll=row.createCell(c++);

if(obj instanceof String)
 celll.setCellValue((String) obj);
    else if(obj instanceof Integer)
    celll.setCellValue((Integer) obj);

Cell newcell=row.createCell(row.getLastCellNum(),CellType.STRING);
Cell count=row.createCell(row.getLastCellNum(),CellType.NUMERIC);

if(row.getRowNum()==0)
{
count.setCellValue("counts");
}
else
{
    double m1 = row.getCell(3).getNumericCellValue();
    double m2 = row.getCell(4).getNumericCellValue();
    double m3 = row.getCell(5).getNumericCellValue();
    count.setCellValue(m1+m2+m3);
  

}

try{
    FileOutputStream file=new FileOutputStream(new File("d:\\mybook.xslx"));
ob.close();

    file.close();

System.out.println("file working");

    }
    catch(Exception e)
    {
        System.out.println("Exception"+e.getStackTrace());
    }
    
    }
}
 


}
}
package com.kgisl.qs1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Sample
 */
public class Sample {

    public static void main(String[] args) {
        XSSFWorkbook ob=new XSSFWorkbook();


        XSSFSheet oc=ob.createSheet("studentcalculation");

        Map<String,Object[]> mm=new TreeMap<String,Object[]>();
        mm.put("1",new Object[]{"sno","name","m1","m2"});
        mm.put("2",new Object[] {01,"anu",80,90});
        mm.put("3",new Object[] {02,"divi",70,100});
        

        Set<String>set=mm.keySet();
        int rownumber=0;
        for(String key:set)
        {
Row row=oc.createRow(rownumber++);
Object[] objarray=mm.get(key);

int cellnum=0;

for (Object obj : objarray) {
    Cell cell = row.createCell(cellnum++);
    if (obj instanceof String)
        cell.setCellValue((String) obj);
    else if (obj instanceof Integer)
        cell.setCellValue((Integer) obj);

}

Cell tcell=row.createCell(row.getLastCellNum(),CellType.NUMERIC);
if(row.getRowNum()==0)
{
    tcell.setCellValue("total");
}else{
    double m1=row.getCell(3).getNumericCellValue();
    double m2=row.getCell(4).getNumericCellValue();
    //double m3=row.getCell(5).getNumericCellValue();
    tcell.setCellValue(m1+m2);

}
        }
        try{
            FileOutputStream fo=new FileOutputStream(new File("d://my.xlsx"));
            ob.write(fo);
            fo.close();
            System.out.println("successfully........................");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }



        

    }
}
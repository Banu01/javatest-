package com.kgisl.qs1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

/**
 * CsvWriterr
 */
public class CsvWriterr {

    public static void main(String[] args) throws Exception {
        StringWriter stw = new StringWriter();
        CSVWriter cs = new CSVWriter(stw, '#', '\'');
        List<Bean2> lll = CsvWriterr.parseCSVWithHeader();
        List<String[]> obj = toStringArray(lll);
        cs.writeAll(obj);
        cs.close();
        System.out.println(stw);

    }

    

    private static List<Bean2> parseCSVWithHeader() throws Exception {
        CSVReader reader = new CSVReader(new FileReader("d://lll.csv"), ',');

        List<Bean2> lll = new ArrayList<Bean2>();
        List<String[]> obj = reader.readAll();
        Iterator<String[]> iterator = obj.listIterator();
        System.out.println(iterator);


	
        while (iterator.hasNext()) {
            String[] record = iterator.next();
			Bean2 emp = new Bean2();
			emp.setId(record[0]);
			emp.setName(record[1]);
			emp.setAge(record[2]);
			emp.setCountry(record[3]);
			lll.add(emp);
		}

		System.out.println(lll);
		
		reader.close();
		return lll;
      
    }
    private static List<String[]> toStringArray(List<Bean2> lll) {
        List<String[]> obj =new ArrayList<String[]>();

obj.add(new String[] { "ID", "NAME", "AGE", "COUNTRY" });
Iterator<Bean2> it = lll.iterator();
		while (it.hasNext()) {
			Bean2 emp = it.next();
			obj.add(new String[] { emp.getId(), emp.getName(), emp.getAge(), emp.getCountry() });
		}
		return obj;
    }

}
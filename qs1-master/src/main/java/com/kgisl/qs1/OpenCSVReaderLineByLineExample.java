
package com.kgisl.qs1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import com.journaldev.csv.model.Bean2;
import com.opencsv.CSVReader;


 
public class OpenCSVReaderLineByLineExample {

	public static void main(String[] args) throws IOException {

		CSVReader reader = new CSVReader(new FileReader("d://emps.csv"), ',');

        List<Bean2> emps = new ArrayList<Bean2>();
        List<String[]> records = reader.readAll();
        Iterator<String[]> iterator = records.listIterator();
        System.out.println(iterator);

	
        while (iterator.hasNext()) {
            String[] record = iterator.next();
			Bean2 emp = new Bean2();
			emp.setId(record[0]);
			emp.setName(record[1]);
			emp.setAge(record[2]);
			emp.setCountry(record[3]);
			emps.add(emp);
		}

		System.out.println(emps);
		
		reader.close();
	}

}

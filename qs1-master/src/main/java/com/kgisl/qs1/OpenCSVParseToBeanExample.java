
package com.kgisl.qs1;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class OpenCSVParseToBeanExample {

	public static void main(String[] args) throws IOException {
		StringWriter writer = new StringWriter();
		
		//using custom delimiter and quote character
		CSVWriter csvWriter = new CSVWriter(writer, '*', '\'');

		List<Bean2> emps = OpenCSVParseToBeanExample.parseCSVWithHeader();

		List<String[]> data = toStringArray(emps);

		csvWriter.writeAll(data);

		csvWriter.close();
		
		System.out.println(writer);

	}

	private static List<Bean2> parseCSVWithHeader() throws IOException {
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
		return emps;
	}

	private static List<String[]> toStringArray(List<Bean2> emps) {
		List<String[]> records = new ArrayList<String[]>();

		// adding header record
		records.add(new String[] { "ID", "Name", "Age", "Country" });

		Iterator<Bean2> it = emps.iterator();
		while (it.hasNext()) {
			Bean2 emp = it.next();
			records.add(new String[] { emp.getId(), emp.getName(), emp.getAge(), emp.getCountry() });
		}
		return records;
	}

}

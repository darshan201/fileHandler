package com.app.fileReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.app.fileService.AmountError;
import com.app.fileService.IdError;
import com.opencsv.CSVReader;

public class Reader {

	@SuppressWarnings("null")
	public static String s[];
	public static BufferedWriter idbufferwriter;
	public static BufferedWriter amountbufferwriter;
	
	public static void main(String[] args) throws IOException {
		CSVReader reader = new CSVReader(
				new FileReader("C:\\Users\\darsh\\eclipse-workspace\\filehandler\\src\\main\\resources\\readfile.csv"));
		idbufferwriter = new BufferedWriter(new FileWriter(
				"C:\\Users\\darsh\\eclipse-workspace\\filehandler\\src\\main\\resources\\writefile.csv"));
		amountbufferwriter = new BufferedWriter(new FileWriter(
				"C:\\Users\\darsh\\eclipse-workspace\\filehandler\\src\\main\\resources\\Errorfile.csv"));
		
		while ((s = reader.readNext()) != null) // returns a Boolean value
		{
			/*//   reading file and printing in console///
			 * for (int i = 0; i < 5; i++) { String s2 = s[i]; // System.out.println(s2); }
			 */
			IdError idError = new IdError();
			idError.Errorfinder();
			AmountError amounterror = new AmountError();
			Thread thread =new Thread(amounterror);
			thread.start();
			

		}
		Reader.idbufferwriter.close();
	}
}
/*
 * System.out.println();
 * 
 * System.out.println(s1[0] + " is not a valid integer"); System.out.println();
 * }
 * 
 * class Writtter { Reader reader = new Reader();
 * 
 * public void m1() throws IOException { BufferedWriter writer = new
 * BufferedWriter(new FileWriter(
 * "C:\\Users\\darsh\\eclipse-workspace\\filehandler\\src\\main\\resources\\writerfile.csv"
 * )); writer.write(reader.s2); }
 * 
 * }
 * 
 * class Errorr {
 * 
 * }
 */

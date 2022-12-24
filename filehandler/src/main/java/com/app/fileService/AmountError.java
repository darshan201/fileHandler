package com.app.fileService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.app.fileReader.Reader;

public class AmountError implements Runnable{
	/*
	 * public void amountfinder() throws IOException { String[] sread = Reader.s;
	 * try { Float.parseFloat(sread[2]); } catch (NumberFormatException e) {
	 * List<String> list = new ArrayList<>(); list.add(sread[2]); for (String ss :
	 * list) { System.out.println(ss); Reader.amountbufferwriter.write(ss + "  ");
	 * Reader.amountbufferwriter.flush(); } } }
	 */

	@Override
	public void run()   {
		String[] sread = Reader.s;
		try {
			Float.parseFloat(sread[2]);
		} catch (NumberFormatException e) {
			List<String> list = new ArrayList<>();
			list.add(sread[2]);
			for (String ss : list) {
				System.out.println(ss);
				try {
					Reader.amountbufferwriter.write(ss + "  ");
					Reader.amountbufferwriter.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		}
		
	}
}

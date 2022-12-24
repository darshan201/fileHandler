package com.app.fileService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.app.fileReader.Reader;

public class IdError {

	public void Errorfinder() throws IOException {
		String[] sread = Reader.s;
		try {
			Integer.parseInt(sread[0]);
		} catch (NumberFormatException e) {

			List<String> list = new ArrayList<>();
			list.add(sread[0]);
			for (String ss : list) {
				System.out.println(ss);
				Reader.idbufferwriter.write(ss + "  ");
				Reader.idbufferwriter.flush();
			}
		}
	}
}



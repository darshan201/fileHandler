package com.app.fileService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class NameError {
	public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\\\Users\\\\darsh\\\\eclipse-workspace\\\\filehandler\\\\src\\\\main\\\\resources\\\\readfile.csv");

        BufferedReader br = null;

        try {
            java.io.FileReader fr = new java.io.FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while( (line = br.readLine()) != null ) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
            PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\darsh\\eclipse-workspace\\filehandler\\src\\main\\resources\\test2_output.txt"));
            System.setErr(out);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            }
            catch(NullPointerException ex) {
            }
        }



    }
}

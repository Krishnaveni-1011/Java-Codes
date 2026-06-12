package com.gqt.javacodes.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingprogram2 {

	public static void main(String[] args) throws IOException {
		String p1 = "F:\\Adv_Java\\Input1.txt";
		String p2 = "F:\\Adv_Java\\Output1.txt";
		FileReader fr = new FileReader(p1);
		int temp;
		FileWriter fw = new FileWriter(p2);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		fw.close();
		fr.close();

	}

}

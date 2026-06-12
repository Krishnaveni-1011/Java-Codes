package com.gqt.javacodes.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingprogram3 {

	public static void main(String[] args) throws IOException {
		String p1 = "F:\\Adv_Java\\Input2.txt";
		String p2 = "F:\\Adv_Java\\Output2.txt";
		FileReader fr = new FileReader(p1);
		BufferedReader br = new BufferedReader(fr);
		int temp;
		FileWriter fw = new FileWriter(p2);
		BufferedWriter bw = new BufferedWriter(fw);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		bw.close();
		br.close(); 
		fw.close();
		fr.close();

	}

}

package com.gqt.javacodes.filehandling;
import java.io.*;
public class File_Handling {

	public static void main(String[] args) throws IOException{
	String p1 = "F:\\Adv_Java\\Input.txt";
	String p2 = "F:\\Adv_Java\\Output.txt";
	FileInputStream fis = new FileInputStream(p1);
	int temp;
	FileOutputStream fos = new FileOutputStream(p2);
	while((temp = fis.read())!= -1)
	{
		fos.write(temp);
	}
	fos.close();
	fis.close();

	}

}

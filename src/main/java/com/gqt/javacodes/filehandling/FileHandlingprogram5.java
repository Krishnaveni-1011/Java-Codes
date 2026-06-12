package com.gqt.javacodes.filehandling;
	import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	public class FileHandlingprogram5 {



		public static void main(String[] args) throws IOException {
			String p1 = "F:\\Adv_Java\\Input3.jpg";
			String p2 = "F:\\Adv_Java\\Output3.jpg";
			FileInputStream fis  = new FileInputStream(p1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int temp;
			FileOutputStream fos = new FileOutputStream(p2);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			while((temp=fis.read())!=-1) {
				fos.write(temp);
			}
			bos.close();
			bis.close(); 
			fos.close();
			fis.close();

		}
	}
	

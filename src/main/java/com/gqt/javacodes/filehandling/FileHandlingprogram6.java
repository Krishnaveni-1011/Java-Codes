package com.gqt.javacodes.filehandling;
import java.io.*;
class Cricketer implements Serializable
{
	String name;
	String country;
	int runs;
	int wickets;
	int catches;
	
	public Cricketer (String name,String country,int runs,int wickets,int catches) {
		super();
		this.name = name;
		this.country = country;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
	}
	void display() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(runs);
		System.out.println(wickets);
		System.out.println(catches);
	}
}

public class FileHandlingprogram6 {

	public static void main(String[] args) throws IOException{
		Cricketer c1 = new Cricketer("Virat","India",19000,20,300);
		c1.display();
		FileOutputStream fos = new FileOutputStream("F:\\Adv_Java\\Cricketer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1); 

	}

}

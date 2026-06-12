package com.gqt.javacodes.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.Serializable;

class Cricketer1 implements Serializable{
String name;
String country;
transient int runs;
int wickets;
transient int catches;


public Cricketer1(String name,String country,int runs,int wickets,int catches) {
super();
this.name=name;
this.country=country;
this.runs=runs;
this.wickets=wickets;
this.catches=catches;
}
void display() {
System.out.println("Name : "+name);
System.out.println("Country : "+country);
System.out.println("Runs : "+runs);
System.out.println("Wickets: "+wickets);
System.out.println("Catches: "+catches);
}
}
class S_Ds {

public static void main(String[] args) throws IOException , ClassNotFoundException {
//Serialization
/*Cricketer c1=new Cricketer("Virat","India",19000,20,300);
c1.display();
String p1="D:\\Advance Java\\File Handling\\Serializable\\Cricketer.txt";
FileOutputStream fos = new FileOutputStream(p1);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(c1);*/

//De-Serialization
String p1="F:\\Adv_Java\\Cricketer.txt";
FileInputStream fis=new FileInputStream(p1);
ObjectInputStream ois =new ObjectInputStream(fis);
Cricketer c1 =(Cricketer)ois.readObject();
c1.display();






}

}

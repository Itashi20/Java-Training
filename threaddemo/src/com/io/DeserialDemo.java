package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("data.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student stu=(Student)ois.readObject();
		System.out.println(stu);

	}

}

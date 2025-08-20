package exceptionhandile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenotfoundexceptionhandile {

	public static void main(String[] args){
		try {
		
		FileInputStream file=new FileInputStream("./filename");
		}catch(FileNotFoundException e) {
			
		}
		System.out.println("FileNotFoundException successfully handiled");

	}

}

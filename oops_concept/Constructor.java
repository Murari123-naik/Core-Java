package oops_concept;

public class Constructor {
	
	int empID;
	String name;
	
	//Np parameter construcor
	Constructor(){
		System.out.println("Hi Constructor");
		
	}
	//With parameter construcor
	Constructor(int a, String b){
		empID=a;
		name=b;
		
		System.out.println("EmpID"+"---"+empID+"---"+"Name"+"---"+name);
		
	}
	public static void main(String[] args) {
		new Constructor();
		new Constructor(1398,"Murari");
		
	}
	

}

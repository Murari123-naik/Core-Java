package oops_concept;

public class call_constructors {
	
	int ID;
	String name;
	String department;
	
	call_constructors(){
		this(1398);
		
		System.out.println("Constructor 1: No parameter");
		
	}
	
	
	
	call_constructors(int empID){
		this(empID,"murari","QA");

		System.out.println("Constructor 2: 1 parameter");
		
	}
	
	call_constructors(int empID,String empName,String dep){
		
		ID=empID;
		name=empName;
		department=dep;
		
		System.out.println("Constructor 3: 3 parameter constructor");
	}
	
	public void allconstructors() {
		
		System.out.println("empID="+ID);
		System.out.println("Employname="+name);
		System.out.println("Department="+department);
	}
	
    public static void main(String[] args) {
    	
    	call_constructors call=new call_constructors();
    	call.allconstructors();
    	
    }
    

}



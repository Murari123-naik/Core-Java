package oops_concept;

public class overloading {

	    
	    public int add(int a, int b) {
	        return a + b;
	    }

	    
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    
	    public double add(double a, double b) {
	        return a + b;
	    }
	
     
	public static void main(String[] args) {
		
		overloading over=new overloading();
		
		System.out.println(over.add(29, 10));
		System.out.println(over.add(10, 29, 10));
		
	}

	}

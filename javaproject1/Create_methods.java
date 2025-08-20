package javaproject1;

public class Create_methods {

	public static void main(String[] args) {
		Create_methods method=new Create_methods();
		
		method.noparameter();
		int ab=method.add();
		System.out.println(ab);
		System.out.println(method.upCasting());
		System.out.println(method.explicitCasting());
		method.oneparameter(4);
		boolean c=method.add(5,7);
		System.out.println(c);
		int d=method.multiply(4, 6, 5);
		System.out.println(d);
		
	}
	
	public static void noparameter() {
		System.out.println("Hi hello");
	}
    public static int add() {
    	int a=10;
    	int b=20;
    	int c=a+b;
    	return c;
    	
    }
    public static int upCasting() {
    	byte n=10;
    	return n;
    	
    }
    public static byte explicitCasting() {
    	int num=10;
    	return (byte)num;
    }
    
    public static void oneparameter(int x) {
    	if(x%2==0) {
    		System.out.println("Number is even");
    	}else {
    		System.out.println("Number is odd");
    	}	
    }
    
    public static boolean add(int x,int y) {
		boolean c=x>y;
		return c;
		
	}
    
    public static int multiply(int a,int b,int c) {
    	int d=a*b*c;
    	return d;
    	
    	
    }
}

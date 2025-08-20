package practice;

public class overloding {
	
	public static int add(int a,int b) {
		
		return a+b;	
	}
	public static int sub(int a, int b, int c) {
		return a-b-c;
	}
	
	public static void mull(int a, int b, int c) {
		int d=a*b*c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		int c=add(10,20);
		System.out.println(c);
		mull(2,3,4);
		System.out.println(sub(4,5,6));
						
	}

}

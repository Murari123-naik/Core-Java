package javaproject1;

public class prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		int b=n++ + n + n++;
		
		System.out.println(b);
		
		
		 int a = 10;

	        a += 5; // a = a + 5
	        System.out.println("a += 5: " + a);

	        a -= 3;
	        System.out.println("a -= 3: " + a);

	        a *= 2;
	        System.out.println("a *= 2: " + a);

	        a /= 4;
	        System.out.println("a /= 4: " + a);

	        a %= 3;
	        System.out.println("a %= 3: " + a);
	        
	        
	        boolean x = true, y = false;

	        System.out.println("a && b: " + (x && y));
	        System.out.println("a || b: " + (x || y));
	        System.out.println("!a: " + (!x));


	}

}

package practice;

public class arrayspractice {
	
	
	public static void reversestring(String s) {
	
	String reverse="";
	
	for(int i=s.length()-1;i>=0;i--) {
		
		char ch=s.charAt(i);
		
		reverse=reverse+ch;	
	  }
	System.out.println(reverse);
}
	
	
	public static void reversewords(String r) {
		
		String reverse="";
		String[] word=r.split(" ");
		for(int i=0;i<word.length;i++) {
			String rev=word[i];
			String reve="";
			
			for(int j=rev.length()-1;j>=0;j--) {
				
				char ch=rev.charAt(j);
				
				reve=reve+ch;
				
			}
			reverse=reverse+reve+" ";
			
		}
		System.out.println(reverse);
		
	}
	
	
	public static void removeduplicates() {
		int n[] = {1,5,4,1,2,6,5};
		
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					
					n[j]=0;
				}	
			}
			if(n[i]!=0) {
				System.out.print(n[i]);
				
			}
			
		}
		
	}
	public static void highestsecondnumber() {
		int n[] = {1,5,4,1,2,6,5};
		
		int temp=0;
		int a=n.length;
		
		for(int i=0;i<n.length;i++) {
			
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
									
				}
				
			}
			
			
		}
		System.out.print(n[a-1]);
		
	}
	
	public static void switchcase() {
		
		int age=25;
		
		
		switch (age=25) {
		
		case 10:
		System.out.println(" age is less than 25");
		break;
		
		case 20:
			System.out.println("age is less than 25");
			break;
		case 25:
			System.out.println("Age is equal");
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		reversestring("this is my collage");
		reversewords("This is my collage");	
		//removeduplicates();
		highestsecondnumber();
		switchcase();
		
		
	}
}


package javaproject1;

public class repeatenumbers {
public static void main(String[] args) {
int a[]= {1,2,2,4,3,1,4};
	
	for(int i=0;i<a.length;i++) {
		int count=1;
		boolean alreadycounted= false;
		for(int j=0;j<i;j++) {
			if(a[i]==a[j]) {
				
				alreadycounted=true;
				break;
			}
			}
				if(alreadycounted) {
					continue;
				}
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					}
				}
				System.out.println("occurance are"+"  "+ a[i]+"   "+count);
			}
}

}


//public class Occurance_numbers
//{
//	
//	public static void main(String[] args)
//	{	
//		int a[] = {1, 2, 2, 4, 3, 1, 4};
//		
//		int count ;
//		for(int i=0; i<a.length ;i++)
//		{   count =1;
//			
//			for(int j=i+1; j<a.length ;j++)
//			{
//				if(a[i]==a[j])
//					
//				{			
//					count++;
//					
//			a[j]=0;		
//				
//				}				
//			}
//			
//			if (a[i]!=0)
//			{
//			System.out.println( a[i] + "occurance are" + count);
//			}
//			
//		}
//		
//	}
//	
//}

package javaproject1;


abstract class black{
	abstract void eyes();	
   
	String name="naik";
}
class weight extends black{

	
	void eyes() {
		
		String name="murari";
		int number=6789;
		
		System.out.println(name);
	}
	
}

public abstract class base {

	public static void main(String[] args) {
		black b=new weight();
		b.eyes();
		System.out.println(b.name);
	}

}

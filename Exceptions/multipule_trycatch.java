package Exceptions;


public class multipule_trycatch {
	
	
	public static void main(String[] args) {

        try {
            String text = null;
            System.out.println("Text length: " + text.length()); 

            int result = 10 / 0; 
       
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}

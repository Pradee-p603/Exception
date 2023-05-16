package in.co.rays.Exception;

public class ExTio {
	public static void main(String[] args) {
		
	
	String name = "pradeep";
	
	try {
		System.out.println(name.charAt(3));
		System.out.println(10/0);
		
	}catch(StringIndexOutOfBoundsException e) {
		e.getStackTrace();
		System.out.println(e.getMessage());
		
	}catch(NullPointerException e){
		System.out.println("me hu null pointer exception");
		
		
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.getStackTrace();
		
	}finally {
		System.out.println("rok sako to rok lo");
		System.out.println("dekho aap nhi rok sakte mujhe");
	}
	}
	
}



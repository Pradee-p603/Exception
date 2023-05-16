package in.co.rays.Exception;

public class ExcpHndlng {
	
	public static void main(String[] args) {
		String name = null;
		name = "rays";
		try {
		System.out.println("before");
		System.out.println(name.charAt(3));
		System.out.println("error line");
		try {
			System.out.println(name.charAt(4));
			System.out.println("mujhe to dekho");
			System.out.println(name.charAt(3));
			System.out.println("new try");
//		}//catch(Exception e){
//			System.out.println("exception");
//            // e.printStackTrace();
//			//System.out.println(e.getMessage());
//			System.out.println("after");
//			
		}catch(Exception f) {}
		
		
		
		} finally{
			System.out.println("hello");
			
			System.out.println("pagal ho kya 0 se koi divide hota h = ");
			System.out.println("finally aap kuch bhi kar lo me nhi rukne wala");
			
		
		}
	
		
	
	}
}
	


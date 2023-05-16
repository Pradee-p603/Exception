package in.co.rays.Exception;

public class FamilyPrapogationCheked {
	public static void main(String[] args) throws MistakeException {
		dad();
			
		System.out.println("tumhare bas ka nhi he me handle karta hu....!!!!");
		
	}

	public static void dad() throws MistakeException {
		mom();
		System.out.println("beta me tumhari maa hu me sambhal lungi.....!!!");
	}

	public static void mom() throws MistakeException {
		son();
		System.out.println("mamma galti ho gyii sambhal lo.....!!!!");
		
	} 

	private static void son() throws MistakeException  {
		MistakeException e = new MistakeException();
		throw e;
		
	}

}

package in.co.rays.Exception;

public class custmor implements Cloneable {
	public String name = null;
	public Account account = null;
	
	public custmor() {}
	public custmor(String name) {
		this.name = name;
		account = new Account(10);
	}
	public String getname() {
		System.out.println(name);
		return name;
	}
	public Account getaccount() {
		System.out.println(account);
		return account;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}

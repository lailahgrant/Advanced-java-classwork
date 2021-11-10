package myfunc;

public class FunctionDemo1 {

	//we cant create a fn inside a fn
	public String lailah(String f, String l) {
		String fullname=null;
		fullname=f+l;
		return fullname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionDemo1 l = new FunctionDemo1();
	String	fn = l.lailah("Lailah", "\tGrant");
		System.out.println(fn);
	}

}

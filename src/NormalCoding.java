
public class NormalCoding {

	public static void main(String[] args) {
		
		// we want to featch Ramanpassword in String...
		
		String  sp="Plaease use temporary password 'Ramanpassword' to login";
		String passwordArray[] =sp.split("'");
		// 0 index=Plaease use temporary password
		// 1 index=Ramanpassword' to login
		String passwordArray2[]=passwordArray[1].split("'");
		// 0 index=Ramanpassword
		// 1 index=to login
		System.out.println(passwordArray2[0]);
		
		
		

	}

}

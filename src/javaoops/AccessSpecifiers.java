package javaoops;

public class AccessSpecifiers {

	public static void main(String[] args) {
		
		PrivateAccess pa = new PrivateAccess();
		// uncomment below lines
		// pa.id;
		// compile time error

		//pa.printId();
		// compile time error
		
		System.out.println("non-subclass within same package");
		DefaultAccess da = new DefaultAccess();
		System.out.println(da.rank);
		da.printRank();

		
		PublicAccess pac = new PublicAccess();
		System.out.println(pac.myRank);
		pac.printmyRank();
	}
}

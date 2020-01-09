package primitivetypeschallenge;

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {
		byte a = 10;
		short b = 20;
		int c = 50;
		long d = 50_000L + 10L * (a + b + c);
		System.out.println(d);
		
		short e = (short) (1000 + 10 * (a + b + c));
		System.out.println(e);
	}
	
}

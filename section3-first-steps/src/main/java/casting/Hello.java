package casting;

public class Hello {

	public static void main(String[] args) {
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN Value = " + (myMinIntValue - 1));
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("My MIN byte value = " + myMinByteValue);
		System.out.println("My MAX byte value = " + myMaxByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("My MIN short value = " + myMinShortValue);
		System.out.println("My MAX short value = " + myMaxShortValue);
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("My MIN long value = " + myMinLongValue);
		System.out.println("My MAX long value = " + myMaxLongValue);
		
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		System.out.println(myNewByteValue);
	}

}

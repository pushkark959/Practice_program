package day12;

public class Wrapperclass_Autoboxing {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0d;
		char c='a';
		boolean b2=true;
		
		//Converting primitive into object : Autoboxing
		
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj =d;
		Character charobj =  c;
		Boolean boolobj = b2;
		
		System.out.println("Byte Object : "+ byteobj);
		System.out.println("Short Object : "+ shortobj);
		System.out.println("Integer Object : "+ intobj);
		System.out.println("Long Object : "+ longobj);
		System.out.println("Float Object : "+ floatobj);
		System.out.println("Double Object : "+ doubleobj);
		System.out.println("Char Object : "+ charobj);
		System.out.println("Boolean Object : "+ boolobj);
		
		
		//Converting object into primitive : Unoxing
		
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = shortobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean booleanvalue = boolobj;
		
		System.out.println(); //For a line
		
		System.out.println("Byte Value.." + bytevalue);
		System.out.println("Short Value.." + shortvalue);
		System.out.println("int Value.." + intvalue);
		System.out.println("long Value.." + longvalue);
		System.out.println("float Value.." + floatvalue);
		System.out.println("double Value.." + doublevalue);
		System.out.println("char Value.." + charvalue);
		System.out.println("boolean Value.." + booleanvalue);
	}

}

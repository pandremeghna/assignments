
 class VariablesWork {
	public static void main(String[] args) {
//		DataType indentifier; //Variable Declaration syntax
		
//		Declare a variable of type short
		short val;
		
//		Intialize the variable
		val = 8;
		
//		 Re-intialize
		val = 98;
		
//		Print the variable's value
		System.out.println(val);
		
		
		char ch = 't'; //Declare and initialize at the same liner
		
		System.out.println(ch);
		
		int a, b; //Works
		
		int first = 98, second;// Works
		
//		int len, char r;//Doesn't work
		
//		float vr = 98.90;//Precision numbers in java are of the type double by default
		
//		double vr = 98.90; //Works
		
		float vr = 98.90F;
		
		System.out.println("Value of vr is : " + vr);
		
//		int value = vr;//Works in C++, not in Java
		int value = (int)vr; //Narrowing, hence we did Explicit type-casting
		
		System.out.println(value);
		
		int tree = 78;
		
		double d = tree;//Widening, hence no explicit type-casting required!
		
		System.out.println(d);
	}
}

//	Primitive DataTypes in Java :
//		boolean true/false 1
//		byte 1
//		short 2
//		char 2
//		int 4
//		long 8
//		float 4
//		double 8



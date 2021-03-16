class operatorsarth{
	public static void main(String[] args){
		int a=10;
		int b=5;
		int c=2;
		int min=(a<b)?a:b;   // ternary operator if a is lessthan b it will print a else it will print b 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(10*10/5+3-1*4/2);
		System.out.println(10<<2) ; // 10 * 2 ^ 2 = 40
		System.out.println(10<<3) ;// 10*2^3 = 80
		System.out.println(10>>2) ;// 10/2^2
		System.out.println(10>>3) ;  // 10/2^3
		//  The logical && operator doesn't check second condition if first condition is false. It checks second condition only if first one is true
		System.out.println(a<b && a<c);
		// The bitwise & operator always checks both conditions whether first condition is true or false.
		System.out.println(a<b & a<c);
		System.out.println(a<b&&a++<c);
		System.out.println(a);//10 because second condition is not checked
		System.out.println(a<b&a++<c);
		System.out.println(a);
		// The logical || operator doesn't check second condition if first condition is true. It checks second condition only if first one is false.
		System.out.println(a>b||a<c);
		// he bitwise | operator always checks both conditions whether first condition is true or false.
		System.out.println(a>b|a<c); 
  		System.out.println(min);
	}
}
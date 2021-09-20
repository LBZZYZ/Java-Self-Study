package Number;

public class Part {
	
	
	static final double PI = 3.1415926;
	static int age = 32;
	
	public static void main(String[] args) {
		
		final int number;
		number = 333;
		age = 333;
		//number = 222;  报错，final变量不能重新赋值
		System.out.println("PI = " + PI);
		System.out.println("age = " + age);
		System.out.println("number = " + number);
		
	}
}

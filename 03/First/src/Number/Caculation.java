package Number;

public class Caculation {

	public static void main(String[] args) {
		//逻辑运算符
		// &与&&都代表逻辑“与”，区别是&当表达式两边都为false时才会返回false，表达式都能被运行
		// 而&&当第一个表达式为false时，不会运行后面的表达式，直接返回false。
		int a = 2;
		int b = 3;
		
		boolean result1 = ((a > b) && (a != b));
		boolean result2 = ((a > b) || (a != b));
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}

}

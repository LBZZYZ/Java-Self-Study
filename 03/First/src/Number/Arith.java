package Number;

public class Arith {

	public static void main(String[] args) {
		
		//算术运算符
		//+ - * / %
		//除法运算时，0不能做除数
		final float f = 45.56f;
		final int i = 152;
		System.out.println("f与i的和为" + (f + i));
		System.out.println("f与i的差为" + (f - i));
		System.out.println("f与i的积为" + (f * i));
		System.out.println("f与i的商为" + (f / i));
		
		
		//自增&自减运算符：单目运算符，操作元必须是一个整型or浮点型变量
		int a = 1,b = 2;
		int x,y;
		x = ++a;	//先加再赋值。
		y = b++;	//先赋值再加。	
		
		System.out.println("x = " + x + ",y = " + y);
		
		
	}

}

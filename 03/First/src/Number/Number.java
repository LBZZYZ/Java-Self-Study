package Number;

public class Number {

	public static void main(String[] args) {
		
		//例3.3
		byte mybyte = 124;
		short myshort = 32564;
		int myint = 45784612;
		long mylong = 46789451;
		
		long result = mybyte + myshort + myint + mylong;
		
		System.out.println("result is " + result);
		
		
		//例3.4
		//声明的变量默认为double类型，如果声明浮点类型的📖，结尾必须加f或F
		System.out.println("===============例3.4====================");
		float f1 = 13.23f;
		double d1 = 4562.12d;
		double d2 = 45678.1564;
		System.out.println("===============例3.4====================");
		
		
		//字符类型
		//1.char型
		System.out.println("===============例3.5====================");
		char a = 97;  //字符a在unicode中的编码为97，所以变量a和变量b的打印结果相同
		char b = 'a';
		System.out.println("a = " + a + " b = " + b);
		System.out.println("===============例3.5====================");
		
		
		System.out.println("===============例3.6====================");
		char word = 'd';
		char word2 = '@';
		int p = 23045;
		int p2 = 45213;
		System.out.println("字符d在unicode字符表中的位置是" + (int)word);
		System.out.println("字符@在unicode字符表中的位置是" + (int)word2);
		System.out.println("unicode字符表中23045的位置是字符" + (char)p);
		System.out.println("unicode字符表中45213的位置是字符" + (char)p2);
		System.out.println("===============例3.6====================");

		
		//2.转义字符
		
		//例3.7 转义字符的使用
		System.out.println("===============例3.7====================");
		char c1 = '\\';    //c1 代表的值为反斜杠字符
		char c2 = '\u5a05'; //将unicode字符集中0x2605代表的字符赋值给c2;
		
		System.out.println("c1 = " + c1 + " c2 = " + c2);
		System.out.println("===============例3.7====================");
		
		
		//布尔类型
		//例3.8 声明布尔变量
		boolean bFlag;
		boolean b1,b2;
		bFlag = true;
		
		
		
		
		
		
	}

}

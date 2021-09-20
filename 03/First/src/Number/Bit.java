package Number;

public class Bit {

	public static void main(String[] args) {
		//位操作符 &(与) ｜(或) ～(取反) ^(异或) >>(右移) <<(左移) >>>(无符号右移)
		int a = 5;
		int b = -4;
		
		System.out.println("a & b = " + (a & b));
		System.out.println("a | b = " + (a | b));
		System.out.println("a ^ b = " + (a ^ b));		//位相同出0，位不同出1
		System.out.println("~a = " + (~a));
		System.out.println("a >> 1 = " + (a >> 1));		//根据符号位对左侧空出的位补0或补1
		System.out.println("a << 1 = " + (a << 1));
		System.out.println("a >>> 1 = " + (a >>> 1));	//不看符号位，一律补0
		
		
		
		//三元运算符
		
		int x = 1;
		int y = 2;
		
		boolean result  = (x > y)?true:false;
		System.out.println("result = " + result);
		
		
	
	
	
	
	}

}

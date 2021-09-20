package Number;

public class var_range {

	//3.3.4变量的作用范围
	
	int x = 45;			//实例变量
	static int y = 90;	//静态变量（也称为类变量，可以作用与其他类，类名.变量名直接存取）
	
	public static void main(String[] args) {
	
		int x = 4;		//	局部变量，作用范围在当前大括号内，内存由Java虚拟机分配，
						//	当前大括号结束后，变量内存空间自动被释放。
		
		
		//此时输出x的值为4，当实例变量与局部变量名相同，实例变量被覆盖。
		System.out.println("x = " + x);
		
		
		

	}

}

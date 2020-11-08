package test;
/*
 * final
 * final 修饰的函数名，防止父类的函数不能被重写，子类只能使用，不能重写函数
 * fianl 变量只能赋值一次,在构造函数的的时候赋值，创建的时候赋值，构造代码块的时候赋值
 * final 修饰的类不能被继承，最终类不能有子类，绝育了
 * final 可以修饰局部变量，地址值不能变，
 * 
 */
class tests{
	
	final int num;
	
	
	public tests(int num) {
		this.num = num;
	}
	
	public final void aa() {
		System.out.println("final");
		
	}
}

class tests1 extends tests{
	
	int num1;
	
	public tests1(int num) {
		super(num);
	}
	
//	public void aa() {
//		System.out.println("override final");
//	}
}

public class a0901_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final tests1 s = new tests1(1); 
		System.out.println(s.num);
		s.num1 = 2;
		System.out.println(s.num1);
		
		
		
	}

}

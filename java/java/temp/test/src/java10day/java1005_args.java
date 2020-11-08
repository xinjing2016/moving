package java10day;
/*
 * 形参：类、抽象类、接口
 * 
 * 抽象类和接口一定要具体化才能用传参
 */

	
//abstract class tests{
//	abstract public void print();
//}	

interface tests{
	abstract public void print();
}

class testDemo{
	public void method(tests t) {
		t.print();
	}
}

class ex implements tests{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("具体化 tests里面的print方法");
	}
	
}

public class java1005_args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tests t = new ex();
		testDemo td = new testDemo();
		td.method(t);
		
//		new testDemo().method(new tests());;
		
//		new testDemo().method(new ex());;
	}
}

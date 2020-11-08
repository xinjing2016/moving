package test;
/*
 * 匿名对象
 * 
 * 调用方法，仅仅用一次的方法
 * new setudt().show();
 * 匿名对象作为参数传递
 * 
 */
class test{
	public void show() {
		System.out.println("testing");
	}
}

class one{
	
	public void show() {
		System.out.println("showing");
	}
	
	public void method(test t) {
		t.show();
	}
}

public class noname0703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new one().show();
		
		one o = new one();
		o.method(new test());
		
		//
		new one().method(new test());
	}

}

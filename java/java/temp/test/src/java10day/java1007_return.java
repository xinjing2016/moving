package java10day;
/*
 * 返回值：类、抽象类、接口
 * 
 * 返回值是类名，真正返回的是实例化的对象
 * 
 * 链式方程要返回对象才能继续调方法
 */

//abstract class tests{
//	abstract public void print();
//}	

abstract class Bro {
	abstract public void jiayou();
}

class broFractory {
	public Bro make() {
//		return new Bro();
		return new TureBro();
	}
}

class TureBro extends Bro{
	public void jiayou() {
		System.out.println("carry ons");
	}
}

public class java1007_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		broFractory bf = new broFractory();
		Bro bb = bf.make();
		bb.jiayou();
		
		//链式写法
		new broFractory().make().jiayou();
	}
}

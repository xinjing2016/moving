package test;
/*
 * 接口
 * 接口无法实例化
 * 接口要实例化，只能通过多态
 * 
 * 多态：
 * 1，具体类实例化，几乎不用
 * 2，抽象类多态（常用）
 * 3，接口（最常用）
 * 因为接口中一定要重写
 * 
 * 子类可以是抽象类，具体类,,但是抽象类没啥意义
 * 
 * 接口中的变量也是final类型，默认的，public static final类型
 * 接口没有构造方法
 * 接口成员方法默认修饰符 public abstract
 * 
 * 类和接口可以多继承，但是要注意对应的方法
 * 接口和接口可以extends
 */

interface Train {
	public abstract void Jump();
//	public abstract void Jump1();
}


interface Trains{
	public abstract void Jump();
	public abstract void Jump2();
}
//接口和接口可以单继承，可以多继承
interface Training extends Train,Trains{}

class AmimalTrain implements Train{
	public void Jump() {
		System.out.println("Amimal Jump");
	}
}

//这里没有报错是因为还没有被实例化
abstract class PersonTrain implements Train{
	
}
//还是要实例化jump
class cc extends PersonTrain{
	public void Jump() {
		System.out.println("cc Jump");
	}
}

//类和接口之间，可以单继承，可以多继承
class aT implements Train,Trains{
	public void Jump() {
		System.out.println("aT Jump");
	}
	public void Jump2() {
		System.out.println("aT Jump2");
	}
	
}

//类和多继承接口关系
class sister implements Training{
	public void Jump() {
		System.out.println("aT Jump");
	}
	public void Jump2() {
		System.out.println("aT Jump2");
	}
}


public class a0926_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train t = new AmimalTrain();
		t.Jump();
		
		System.out.println("-----------");
		Trains at = new aT();
		at.Jump2();
		
		System.out.println("-----------");
		Training s = new sister();
		s.Jump();
		
	}

}

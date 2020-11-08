package test;

/*
 * abstract 
 * 抽象类不一定有抽象方法，但是有抽象方法的类一定是抽象类
 * 抽象类不能初始化
 * 有构造方法但是不能被实例化
 * 
 * 抽象类的子类是抽象类
 * 抽象类的子类不是抽象类就要重写抽象类的方法,
 * 看到abstract就要重写方法
 * 
 * 
 * 不能和哪些关键字共存
 * private 冲突
 * final 冲突
 * static 
 */

abstract class Animals{
	
	public int num = 10;
	
	private String name;
	private int age;
	
	public Animals() {};
	
	public Animals(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getName() {
		System.out.println(this.name);
	}
	
	public void getAge() {
		System.out.println(this.age);
	}
	
	
	//没有方法体{}
	public abstract void eat();
}

abstract class Cats extends Animals{
		
	public void eat() {
		System.out.println("cat eat fish");
	}
}

class Dogs extends Animals{
	
	private int sp;
	
	public Dogs() {}
	
	public Dogs(String name,int age,int sp) {
		super(name,age);
		this.sp = sp;
	}
	
	public void eat() {
		System.out.println("dog eat shi");
	}
	
	public void getSp() {
		System.out.println(this.sp);
	}
}

public class a0917_abstrust {

	public static void main(String[] args) {
		
		// 不能实例化
//		Animals a = new Animals();
		
		//实例化cat子类，不能实例化
//		Cats c = new Cats();
		
		//多态实例化抽象子类,不行
//		Animals a = new Cats();
		
		//多tai实例化dog
		Animals dd = new Dogs();
		dd.eat();
		System.out.println(dd.num);
		//不能初始化
//		dd = new Animals();
		
		//实例化dog
		Dogs d = new Dogs("nn",18,10);
		d.eat();
		d.getAge();
		d.getSp();
		
		
	}

}

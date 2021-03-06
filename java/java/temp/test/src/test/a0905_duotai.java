package test;

/*
 * 多态
 * 同一个事物在不同时间体现不同的状态
 * 前提：要有继承关系，有方法重写，父类引用指向子类
 * 
 * 构造方法：创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
 * 实例化使用的是父类的成员变量，使用的是子类的重写的成员方法
 * 静态方法还是用的父类的函数
 * 
 * 多态不能使用子类的特有功能
 * 
 */

class Fu{
	
	int num = 1;
	String name;
	
	public Fu(String name) {
		this.name = name;
		System.out.println("fu is name : "+this.name);
	}
	
	public static void show() {
		System.out.println("duotai-fu");
	}
}

class Zi extends Fu{
	
	int num = 2;
	
	public Zi(String name) {
		super(name);
	}
	
	public static void show() {
		System.out.println("duotai-zi");
	}
	
	public static void showZi() {
		System.out.println("duotai-zi-sp");
	}
}

public class a0905_duotai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu f = new Zi("f");
		f.show();
		System.out.println(f.num);
//		f.showZi();
		System.out.println("---------------");
		
		//将多态强转成子类，z向下转型，把子转成父类
		Zi z = (Zi)f;
		z.showZi();
		z.show();
		System.out.println(z.num);
		System.out.println("---------------");
		
		Zi z2 = new Zi("z2");
		z2.showZi();
		z2.show();
		System.out.println(z2.num);
	}

}

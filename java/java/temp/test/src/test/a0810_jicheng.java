package test;
/*
 * 继承
 * 类的继承出来成一个类,只支持单继承，不支持多继承，可以多层继承
 * 只能继承父类中public属性
 *  class ba{}
 *  class zi extends ba{}
 */

class Person{
	
	String Name;
	int age;
	private String country;
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
}

class Stu extends Person{
	
}

class Teacher extends Person{
	public void teac(){
		System.out.println("继承子psrson，在teacher里");
	}
	
}

class Tea extends Teacher{
	
	public void teacs(){
		System.out.println("继承自teacher，在tea里");
	}
}

public class a0810_jicheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s = new Stu();
		s.sleep();
		Teacher t = new Teacher();
		t.sleep();
		
		Tea t1 = new Tea();
		t1.teac();
		t1.teacs();
	}	

}







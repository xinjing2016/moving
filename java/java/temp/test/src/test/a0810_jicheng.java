package test;
/*
 * �̳�
 * ��ļ̳г�����һ����,ֻ֧�ֵ��̳У���֧�ֶ�̳У����Զ��̳�
 * ֻ�ܼ̳и�����public����
 *  class ba{}
 *  class zi extends ba{}
 */

class Person{
	
	String Name;
	int age;
	private String country;
	
	public Person(String name ) {
		this.Name = name;
		System.out.println(this.Name);
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
}

class Stu extends Person{
	
	public Stu(String name) {
		super(name);
	}
}

class Teacher extends Person{
	
	public Teacher(String name) {
		super(name);
	}
	
	public void teac(){
		System.out.println("�̳���psrson����teacher��");
	}
	
}

class Tea extends Teacher{
	
	public Tea(String name) {
		super(name);
	}
	
	public void teacs(){
		System.out.println("�̳���teacher����tea��");
	}
}

public class a0810_jicheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s = new Stu("stu");
		s.sleep();
		Teacher t = new Teacher("teacher");
		t.sleep();
		
		Tea t1 = new Tea("t1");
		t1.teac();
		t1.teacs();
	}	

}







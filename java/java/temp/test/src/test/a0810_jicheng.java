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
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
}

class Stu extends Person{
	
}

class Teacher extends Person{
	public void teac(){
		System.out.println("�̳���psrson����teacher��");
	}
	
}

class Tea extends Teacher{
	
	public void teacs(){
		System.out.println("�̳���teacher����tea��");
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







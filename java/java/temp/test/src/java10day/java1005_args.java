package java10day;
/*
 * �βΣ��ࡢ�����ࡢ�ӿ�
 * 
 * ������ͽӿ�һ��Ҫ���廯�����ô���
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
		System.out.println("���廯 tests�����print����");
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

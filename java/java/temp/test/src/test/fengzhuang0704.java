package test;
/*
 * private,隐藏实现的细节，对外提供接口和方法 
 * this 代表当前类的名字：局部变量隐藏关键变量
 * 
 */
class Pri{
	String name;
	private int age;
	
	public void setAge(int age) {
		this.age = age;
		System.out.println(this.age);
	}
	
	private void method() {
		System.out.println("private");
	}
}

public class fengzhuang0704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pri p = new Pri();
		p.setAge(100);
		
	}

}

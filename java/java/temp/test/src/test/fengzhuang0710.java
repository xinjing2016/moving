package test;
/*
 * 构造方法
 *方法名和类型一致，没有返回值 
 *系统自动给出，无参数构造
 *构造函数的重载
 *不能有void返回值,不然就不是构造函数了
 */

class Studenta{
	private String name;
	private int age;
	
	//给对象初始化的函数
	public Studenta(){
		System.out.println("无参构造");
	}
	
	public Studenta(String name) {
		this.name = name;
	}
		
	public Studenta(int age) {
		this.age = age;
	}
	
	public Studenta(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
}

public class fengzhuang0710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studenta s = new Studenta(13,"guoxinjing");
		System.out.println(s.getAge()+"---"+s.getName());
	}

}

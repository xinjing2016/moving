package test;
/*
 * 0622
 * 面向对象设计：对象之间的关系
 * 面向对象开发：指挥对象干活
 */

//定义一个学生类
class studentt {
	
	String name;
	int age;
	String address;
	
	public void study() {
		System.out.println("studying");
	}
	
	

}


//定义学生测试类
class stu_demo {
	public static void main(String[] args) {
		studentt s = new studentt();
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		
		s.study();
		
		s.name = "guo";
		s.age = 13;
		s.address = "beijing";
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		s.study();
	}
}





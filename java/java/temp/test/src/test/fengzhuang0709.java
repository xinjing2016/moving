package test;

class Student{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
		
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
}


public class fengzhuang0709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setAge(20);
		s.setName("aa");
		System.out.println(s.getAge());
		System.out.println(s.getName());
	}

}

package java10;

/*
 * main 
 * Syso
 * 提示

 * Alt + /
 * 格式化 ctrl shift f
 */
class Student {
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Teacher {
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public Teacher(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}

class cc extends Student implements Cloneable{
	
	private String name;
	
	public cc(String name) {
		super();
		this.name = name;
	}


	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}


	@Override
	public String toString() {
		return "cc [name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//比较name
		//string 对比字符串的值
		
		if (this == obj) {
			return true;
		}
			
		if (!(obj instanceof Student)) {
			return false;
		}else {
			Student o = (Student)obj;
			if (this.name.equals(o.getName())){
				return true;
			}
			else{
				return false;
			}
		}
		
		
//		@Override
//		protected Object clone() throws CloneNotSupportedException {
//			return super.clone();
//		}
			
	} 
	
	
	
}

public class java10_eclips {

	public static void main(String[] args) {
		int a = 1;
//		System.out.println();
//		Scanner sc = new Scanner(System.in);
		
		cc d = new cc("d");
		System.out.println(d.toString());
		System.out.println("-----------------");
		
		cc dd = new cc("dd");
		System.out.println(dd.equals(d));
		
		Student s = new Student();
		System.out.println(dd.equals(s));
		
//		Object obj = d.clone();
	}

}

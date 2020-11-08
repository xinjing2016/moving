package test;
/*
 * 参数是引用类型,要初始化才能传进去
 */
class args{
	public int sum(int a,int b) {
		return a+b;
	}
}

class students{
	public void study() {
		System.out.println("studying");
	}
}

class student_demo{
	public void method(students s) {
		s.study();
	}
}

public class args0702 {
	public static void main(String[] args) {
		args a = new args();
		System.out.println(a.sum(1, 2));
		
		//
		students s = new students();
		student_demo sd = new student_demo();
		sd.method(s);
	}
}

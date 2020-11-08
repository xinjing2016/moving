package test;

interface Jumping{
	public abstract void jump();
}

abstract class Animala {
	private String name;
	private int age;
	
//	public Animala() {}
	public Animala(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void getName() {
		System.out.println(this.name);
	}
	public void getAge() {
		System.out.println(this.age);
	}
	public abstract void eat();
	
}

class Cata extends Animala{
//	public Cata() {}
	public Cata(String name,int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("cat goes sleepipng");
	}
}

class JumpCat extends Cata implements Jumping{
//	public JumpCat() {}
	public JumpCat(String name,int age) {
		super(name, age);
	}
	public void jump() {
		System.out.println("cat goes jumping");
	}
}

public class a0931_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpCat jc = new JumpCat("cats",12);
		jc.eat();
		jc.jump();
		jc.getAge();
		jc.getName();
	}

}

package test;

/*
 * 多态
 * 
 * 
 */

class Animal{
	
	public void eat() {
		System.out.println("rice");
	}
}

class Cat extends Animal{
		
	public void eat() {
		System.out.println("cat eat fish");
	}
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("dog eat shi");
	}
}

public class a0914_duotai_anli {

	public static void main(String[] args) {
		// 动物多态猫
		Animal a = new Cat();
		a.eat();
		System.out.println("---------------");
		
		//ture cat
		Cat c = (Cat)a;
		c.eat();
		System.out.println("---------------");
		
		//变回多太狗
		a = new Dog();
		a.eat();
		System.out.println("---------------");
		
		//
		Dog d = (Dog)a;
		d.eat();
		
		
		
	}

}

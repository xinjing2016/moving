package test;

/*
 * ��̬
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
		// �����̬è
		Animal a = new Cat();
		a.eat();
		System.out.println("---------------");
		
		//ture cat
		Cat c = (Cat)a;
		c.eat();
		System.out.println("---------------");
		
		//��ض�̫��
		a = new Dog();
		a.eat();
		System.out.println("---------------");
		
		//
		Dog d = (Dog)a;
		d.eat();
		
		
		
	}

}

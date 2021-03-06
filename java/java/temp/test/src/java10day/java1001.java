package java10day;

interface SpeakEnglish{
	public abstract void speak(); 
}

abstract class Person{
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("sleepping");
	}
	
	public abstract void eat();
}

abstract class Player extends Person{

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void study();
}

abstract class Coach extends Person{
	
	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public abstract void Teach();
}

class PingPongPlayer extends Player implements SpeakEnglish{

	public PingPongPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PingPongPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("PingPongPlayer speaks English");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("����");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�ײ�");
	}
	
}

class BasketballPlayer extends Player{

	public BasketballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasketballPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Ͷ��");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ţ��");
	}
	
}

class PingPongCoash extends Coach{

	public PingPongCoash() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PingPongCoash(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("�̷���");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���޲ˣ���ˮ");
	}
	
}

class BaskballCoash extends Coach{

	public BaskballCoash() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaskballCoash(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("�̴���");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���⣬�Ⱥ�ţ");
	}
	
}

public class java1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PingPongPlayer pc = new PingPongPlayer("guoxinjing",18);
		pc.eat();
		pc.speak();
		
		BasketballPlayer bp = new BasketballPlayer("qinaide",20);
		bp.eat();
		bp.sleep();
		bp.study();
	
	}

}

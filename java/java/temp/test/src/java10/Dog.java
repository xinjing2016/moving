package java10;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		System.out.println("dog jumps");
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		System.out.println("dog eat rice");
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("dog sleepings");

	}
	
	@Override
	public String toString() {
		
//		return super.toString();
		return "name:"+super.getName();
	}

}

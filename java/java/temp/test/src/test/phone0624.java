package test;
/*
 * 把对象赋值给同一个对象，值会指向同一个内存值
 */

class phone{
	String brand;
	int price;
	String color;
	
}


public class phone0624 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p1 = new phone();
		p1.brand = "m";
		p1.price = 99;
		p1.color = "yellow";
		
		System.out.println(p1.brand+"----"+p1.price+"---"+p1.color);
		
		phone p2 = p1;
		System.out.println(p2.brand+"----"+p2.price+"---"+p2.color);
		p2.brand = "ms";
		p2.price = 990;
		p2.color = "yellows";
		
		System.out.println(p1.brand+"----"+p1.price+"---"+p1.color);
		System.out.println(p2.brand+"----"+p2.price+"---"+p2.color);
		
	}

}

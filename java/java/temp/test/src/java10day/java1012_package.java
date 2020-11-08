package java10day;
//package java10;

/*
 * 包
 * package > import > class
 * 只有一个 》 多个 》 多个
 * 
 */

//abstract class tests{
//	abstract public void print();
//}	



public class java1012_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		broFractory bf = new broFractory();
		Bro bb = bf.make();
		bb.jiayou();
		
		//链式写法
		new broFractory().make().jiayou();
	}
}

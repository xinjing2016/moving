package java_jar;
/*
 * hashCode
 * getClass
 * toString 要重写
 * toHexString
 * equals 默认对比地址值 要重写，对比对象的成员变量
 * 
 */
import java10.Dog;

public class java1122_api extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		System.out.println(d.hashCode());
		
		Dog dd = d;
		System.out.println(dd.hashCode());
		
		Dog ds = new Dog();
		
		//当前包的类名
		System.out.println(dd.getClass());
		System.out.println(dd.getClass().getName());
		System.out.println(dd.toString());
		System.out.println(Integer.toHexString(dd.hashCode()));
		System.out.println(dd.equals(d));
		System.out.println(dd.equals(ds));

	}

}

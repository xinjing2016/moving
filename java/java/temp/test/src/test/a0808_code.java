package test;
/*
 * �����
 *  �ֲ�����飬�������飬��̬�����
 *  
 *  �������飺���캯�����еĿ�
 *  ��̬����飺static���Σ�ִֻ��һ��,��ִ��static ����ִ�й�������
 */



class Code{
	
	int x;
	
	//��������
	{
		int x = 1;
		System.out.println(x);
//		System.out.println();
	}
	
	public Code() {
		System.out.println("code");
	}
	public Code(int x,int y) {
		x = 2;
		y = 2;
		System.out.println(x);
	}
	
	static {
		int x = 3;
		System.out.println(x);
	}
}


public class a0808_code {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Code c = new Code(1,1);
//		System.out.println(c.x);
//		
//	}	
	

}







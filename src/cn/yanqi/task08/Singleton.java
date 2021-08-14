package cn.yanqi.task08;

/*
    ���ʵ��Singleton��ķ�װ
 */
public class Singleton {
	
	// 2.�����������͵�����ָ�������͵Ķ���ʹ��private static�ؼ��ֹ�ͬ����
	//private static Singleton sin = new Singleton();  // ����ʽ
	private static Singleton sin = null;               // ����ʽ
	
	// 1.˽�л����췽����ʹ��private�ؼ�������
	private Singleton() {}
	
	// 3.�ṩ���е�get�������𽫶��󷵻س�ȥ��ʹ��public static�ؼ��ֹ�ͬ����
	public static Singleton getInstance() {
		//return sin;
		if(null == sin) {
			sin = new Singleton();
		}
		return sin;
	}
}
package cn.yanqi.task08;

/*
    ���ʵ��Singleton��Ĳ���
 */
public class SingletonTest {
	
	public static void main(String[] args) {
		
		// 1.����Singleton���͵�����ָ������͵Ķ���
		//Singleton s1 = new Singleton();
		//Singleton s2 = new Singleton();
		//System.out.println(s1 == s2); // �Ƚϱ���s1����ֵ�Ƿ������s2����ֵ���  false
		//Singleton.sin = null;  ����ʹ�����ñ�����Ч
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2); // true
	}
}
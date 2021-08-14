package cn.yanqi.task08;

/*
    ���ʵ��People��Ĳ���
 */
public class PeopleTest {
	
	public static void main(String[] args) {
		
		// 3.��֤static�ؼ������εľ�̬��Ա(���Ա)�Ƿ��봴�������޹�  ����.�ķ�ʽ => �޹�
		//System.out.println("��ȡ���Ĺ�����Ϣ�ǣ�" + People.country); // null
		System.out.println("��ȡ���Ĺ�����Ϣ�ǣ�" + People.getCountry()); // null
		
		// 1.ʹ���вη�ʽ��������People���͵Ķ��󲢴�ӡ����
		People p1 = new People("zhangfei", 30/*, "China"*/);
		p1.show(); // zhangfei 30 China
		
		People p2 = new People("guanyu", 35/*, "China"*/);
		p2.show(); // guanyu 35 China

		System.out.println("--------------------------------------------");
		// 2.��֤static�ؼ������εľ�̬��Ա(���Ա) �Ƿ����ж�����  => ����
		//p1.country = "���";
		p1.setCountry("���");
		//System.out.println("��һ������Ĺ����ǣ�" + p1.country); // ���
		//System.out.println("�ڶ�������Ĺ����ǣ�" + p2.country); // ���
		System.out.println("��һ������Ĺ����ǣ�" + p1.getCountry()); // ���
		System.out.println("�ڶ�������Ĺ����ǣ�" + p2.getCountry()); // ���
		
		People p3 = new People();
		//System.out.println("����������Ĺ����ǣ�" + p3.country); // ���
		System.out.println("����������Ĺ����ǣ�" + p3.getCountry()); // ���
	}
}
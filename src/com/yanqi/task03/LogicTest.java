/*
    ���ʵ���߼��������ʹ��
 */
public class LogicTest {
	
	public static void main(String[] args) {
		
		// 1.��������boolean���͵ı�������ʼ��
		boolean b1 = true;
		boolean b2 = false;
		// 2.��ӡ��������ֵ
		System.out.println("b1 = " + b1); // b1 = true
		System.out.println("b2 = " + b2); // b2 = false
		
		System.out.println("---------------------------------------------");
		// 3.ʹ����������ʵ���߼��������ʹ��
		boolean b3 = b1 && b2;
		System.out.println("b3 = " + b3); // false
		System.out.println(b1 && b2); // false   ����
		System.out.println(b1 || b2); // true    ����
		System.out.println(!b1);  // false       ȡ��
		System.out.println(!b2);  // true
		
		System.out.println("---------------------------------------------");
		// 4.����һ�¶�·����
		int ia = 3;
		int ib = 5;
		// �����߼����������˵������һ������Ϊ�����������ʽΪ�٣���ʱ�����ڶ������ʽ��ִ��
		boolean b4 = (++ia == 3) && (++ib == 5);
		System.out.println("b4 = " + b4); // false
		System.out.println("ia = " + ia); // 4
		System.out.println("ib = " + ib); // 5
		
		// �����߼����������˵������һ������Ϊ�����������ʽΪ�棬��ʱ�����ڶ������ʽ��ִ��
		boolean b5 = (++ia == 5) || (++ib == 5);
		System.out.println("b5 = " + b5); // true
		System.out.println("ia = " + ia); // 5
		System.out.println("ib = " + ib); // 5
	}
}
/*
    ���ʵ�������������ʹ��
 */
public class ArithmeticTest {
	
	public static void main(String[] args) {
		
		// 1.��������int���͵ı�������ʼ��
		//int ia = 6, ib = 2;       // ��ʾ��������int���͵ı���ia��ib�����Ƽ�ʹ��
		int ia = 6;                 // �Ƽ��÷�ʽ������˴���Ŀɶ���
		int ib = 2;
		System.out.println("ia = " + ia); // ia = 6
		System.out.println("ib = " + ib); // ib = 2
		
		System.out.println("----------------------------------------");
		// 2.ʹ����������ʵ�������������ʹ��   +  -  *  /  %
		// ��ʾ��������ic����¼ia��ib�ĺ�
		int ic = ia + ib;
		System.out.println("ic = " + ic); // ic = 8
		// ����ia+ib�������������ʽ  ia��ib����������   +����������/�����
		System.out.println(ia + ib);  // 8
		System.out.println(ia - ib);  // 4
		System.out.println(ia * ib);  // 12
		System.out.println(ia / ib);  // 3
		System.out.println(ia % ib);  // 0
		
		System.out.println("----------------------------------------");
		// 3.ע������
		// 3.1 �������������ʱ���ֻ�����������֣�����С������
		System.out.println(5 / 2); // 2
		
		System.out.println("----------------------------------------");
		// 3.2 ��ϣ������С�����ָ���δ���
		// ����ʽһ��ʹ��ǿ������ת��������һ��������ת��Ϊdouble���������㼴��
		System.out.println((double)5 / 2);   // 2.5
		System.out.println(5 / (double)2);   // 2.5
		System.out.println((double)5 / (double)2); // 2.5
		System.out.println((double)(5 / 2)); // 2.0
		// ����ʽ����������һ������������1.0���ɣ��Ƽ���
		System.out.println(5*1.0 / 2); // 2.5
		System.out.println(5.0 / 2);   // 2.5   ia.0 ����ı�ʾ
		
		System.out.println("----------------------------------------");
		// 3.3 0����������
		//System.out.println(5 / 0); // ����ok�����з���java.lang.ArithmeticException(�����쳣 ��ס): / by zero
		System.out.println(5 / 0.0); // Infinity ����
 		System.out.println(0 / 0.0); // NaN Not a Number 
	}
}
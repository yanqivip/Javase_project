/*
    ���ʵ�ֹ�ϵ�������ʹ��
 */
public class RelationTest {
	
	public static void main(String[] args) {
		
		// 1.��������int���͵ı�������ʼ��
		int ia = 5;
		int ib = 2;
		
		// 2.ʹ�ñ���ʵ�ֹ�ϵ�������ʹ�ò���ӡ���
		boolean b1 = ia > ib;
		System.out.println("b1 = " + b1); // b1 = true
		System.out.println(ia > ib);   // �Ƿ����       true
		System.out.println(ia >= ib);  // �Ƿ���ڵ���   ���ڻ��ߵ���  true
		System.out.println(ia < ib);   // �Ƿ�С��       false
		System.out.println(ia <= ib);  // �Ƿ�С�ڵ���   false
		System.out.println(ia == ib);  // �Ƿ����       false
		System.out.println(ia != ib);  // �Ƿ񲻵���     true
	}
}
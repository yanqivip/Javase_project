/*
    ���ʵ�ֲ������͵�ʹ��
 */
public class BooleanTest {
	
	public static void main(String[] args) {
		
		// 1.����һ��boolean���͵ı�������ʼ��
		boolean b1 = true;
		// 2.��ӡ��������ֵ
		System.out.println("b1 = " + b1); // b1 = true
		
		System.out.println("-------------------------------------------");
		// 3.�޸ı���b1����ֵ   = ��ֵ����������ڽ�=�ұߵ����ݸ�ֵ��=��ߵı��������Ǳ�����ԭ������ֵ
		b1 = false;
		System.out.println("b1 = " + b1); // b1 = false
		
		System.out.println("-------------------------------------------");
		//b1 = 1; // ����: �����ݵ�����: int�޷�ת��Ϊboolean
	}
}
/*
    ��ֵ�������ʹ��
 */
public class AssignTest {
	
	public static void main(String[] args) {
		
		// 1.����һ��int���͵ı�������ʼ��
		int ia = 3;
		// 2.��ӡ��������ֵ
		System.out.println("ia = " + ia); // ia = 3
		
		System.out.println("-----------------------------------");
		// 3.�򵥸�ֵ�������ʹ��
		// ��ʾ������5��ֵ������ia���Ҹ��Ǳ���iaԭ������ֵ
		ia = 5;
		System.out.println("ia = " + ia); // ia = 5
		// ����Ĵ������ڴ�ӡ���ʽ�Ľ��
		System.out.println( ia = 5 ); // 5
		System.out.println("ia = " + ia); // ia = 5
		int ib = ia = 6;
		System.out.println("ia = " + ia); // ia = 6
		System.out.println("ib = " + ib); // ib = 6
		int ic;
		ic = ib = ia = 8;
		System.out.println("ia = " + ia); // ia = 8
		System.out.println("ib = " + ib); // ib = 8
		System.out.println("ic = " + ic); // ic = 8
		
		System.out.println("-----------------------------------");
		// 4.���ϸ�ֵ�������ʹ��
		//ia = ia + 2;  Ŀǰ�Ƽ�ʹ�ø÷�ʽ
		ia += 2;        // ��д�����ӽ���������ǵȼ۵�
		System.out.println("ia = " + ia); // ia = 10
		
		System.out.println("-----------------------------------");
		// 5.���Կ���1
		byte b1 = 10;
		System.out.println("b1 = " + b1); // b1 = 10
		//b1 = b1 + 2; // ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ         byte + int ��ӽ������int����
		//b1 = b1 + (byte)2; // ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ   byte + byte ��ӽ������int����  �������Ż�
		//b1 = (byte)(b1 + 2); // ǿ������ת������int����ת��Ϊbyte
		b1 += 2; // �����ȼ���b1 = (byte)(b1 + 2);
		System.out.println("b1 = " + b1); // b1 = 12
		
		System.out.println("-----------------------------------");
		// 6.���Կ���2
		//ia == 2; - ��ʾ�жϱ���ia����ֵ�Ƿ����2
		//2 == ia; - ��ʾ�ж�2�Ƿ���ڱ���ia����ֵ���ӽ������˵�ȼۣ��Ƽ��÷�ʽ
		//ia = 2;  - ��ʾ��2��ֵ������ia�����Ǳ���iaԭ������ֵ
		//2 = ia;  //- ���뱨��  ����: ���������
	}
}
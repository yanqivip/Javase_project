/*
    ���ʹ�����������ʵ�������Ĳ��
 */

import java.util.Scanner; 
 
public class ArithmeticTimeTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����һ����������������ʹ�ñ�����¼
		System.out.println("������һ����������������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.�����������������Ϊʱ�����ʹ�ñ�����¼
		// 3666�� => 1Сʱ1����6����
		// 3666 / 3600 = 1 Сʱ     3666 % 3600 = 66 / 60 = 1 ����     3666 % 60 = 6 ���� 
		int hour = num / 3600;      // ���Сʱ��
		int min = num % 3600 / 60;  // ��ַ�����
		int sec = num % 60;         // �������
		
		// 3.��ӡ���յĲ�ֽ��
		System.out.println(num + "��ת��Ϊ" + hour + "Сʱ" + min + "����" + sec + "����");
		
		System.out.println("---------------------------------------------------------------------");
		// 4.+�ȿ�����Ϊ�ַ������ӷ����ֿ�����Ϊ�ӷ������
		// ֻҪ+���ߵĲ���������һ�����������ַ������ͣ����+�ͱ������ַ������ӷ������������ӷ����������
		System.out.println(hour + min + sec);       // 8
		System.out.println(hour + min + sec + "");  // 8
		System.out.println(hour + min + "" + sec);  // 26
		System.out.println(hour + "" + min + sec);  // 116
		System.out.println("" + hour + min + sec);  // 116
		System.out.println("" + (hour + min + sec));// 8
	}
}
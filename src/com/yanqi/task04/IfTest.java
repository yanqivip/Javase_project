/*
     ���ʹ��if��֧�ṹģ�����������Ĺ���
 */

import java.util.Scanner; 
 
public class IfTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����������Ϣ��ʹ�ñ�����¼
		System.out.println("�������������䣺");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		// 2.ʹ��if��֧�ṹ�ж��Ƿ���겢������Ӧ����ʾ
		if(age >= 18) {
			System.out.println("���ĵ����������ҳ...");
		}
		
		// 3.��ӡһ�仰
		System.out.println("���õ�ʱ�����Ƕ��ݵģ�");
	}
}
/*
    ���ʵ��if  else if  else��֧�ṹ��ʹ�ã���ģ�⹺���Ʊ�Ĺ���
 */

import java.util.Scanner; 
 
public class IfElseifElseTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û����������Ϣ��ʹ�ñ�����¼
		System.out.println("���������������Ϣ��");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 2.ʹ��if  else if  else��֧�ṹ�ж������Ϣ��������Ӧ����ʾ
		// �ж�"����"�Ƿ����str���Ƿ���str����ֵ���
		if("����".equals(str)) {
			System.out.println("����ѳ˳���");
		} else if("ѧ��".equals(str)) {
			System.out.println("�빺����Ʊ��");
		} else {
			System.out.println("�빺��ȫ��Ʊ��");
		}
		
		// 3.��ӡһ�仰
		System.out.println("�����˻�ȥ������ȥ���������Ĳ�������");
	}
}
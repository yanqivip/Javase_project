/*
    ���ʹ��if else��֧�ṹ��ģ�⿼�Գɼ���ѯ�Ĺ���
 */

import java.util.Scanner; 
 
public class IfElseTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û����뿼�Գɼ���ʹ�ñ�����¼
		System.out.println("���������Ŀ��Գɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 2.ʹ��if else��֧�ṹ�жϿ��Գɼ��Ƿ񼰸񲢸�����Ӧ����ʾ
		if(score >= 60) {
			System.out.println("��ϲ������ͨ���ˣ�");
		} else {
			System.out.println("��ѧ���������ɣ�");
		}
		
		// 3.��ӡһ�仰
		System.out.println("��������ңԶ�ľ��벻����������������if����else���ƺ�һֱ���ȴ����Զ���룡");
	}
}
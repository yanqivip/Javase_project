/*
    ���ʹ��switch case��֧�ṹʵ�ֿ��Գɼ��ĵȼ��ж�
 */

import java.util.Scanner; 
 
public class SwitchScoreTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û����뿼�Գɼ���ʹ�ñ�����¼  0 ~ 100
		System.out.println("���������Ŀ��Գɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 2.ʹ��switch case��֧�ṹʵ�ֿ��Գɼ��ĵȼ��ж�
		switch(score / 10) {
			case 10: //System.out.println("�ȼ�A"); //break;
			case 9:  System.out.println("�ȼ�A"); break; // case��͸  
			case 8:  System.out.println("�ȼ�B"); break;
			case 7:  System.out.println("�ȼ�C"); break;
			case 6:  System.out.println("�ȼ�D"); break;
			default: System.out.println("�ȼ�E"); //break;
		}
		
		// 3.��ӡһ�仰
		System.out.println("�����������ĵȴ������ҵ�case�㵱switch��������Զ������ѡ���Լ���");
	}
}
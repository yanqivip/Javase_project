/*
    ���ʹ��if else if else��֧�ṹ�жϿ��Գɼ����ڵĵȼ�
 */

import java.util.Scanner; 
 
public class IfScoreTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û����뿼�Գɼ���ʹ�ñ�����¼
		System.out.println("���������Ŀ��Գɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 2.ʹ��if else if else��֧�ṹ�ж����ڵĵȼ�����ӡ
		// 90 / 10 = 9;    91 / 10 = 9;  92 / 10 = 9;  99 / 10 = 9;   100 / 10 = 10;
		if(score >= 90 && score <= 100) {     // case 9:    case 10:  
			System.out.println("�ȼ�A");
		} else if(score >= 80) {              // case 8: 
			System.out.println("�ȼ�B");
		} else if(score >= 70) {              // case 7:
			System.out.println("�ȼ�C");
		} else if(score >= 60) {              // case 6:
			System.out.println("�ȼ�D");   
		} else {                              // default:
			System.out.println("�ȼ�E");
		}
	}
}
/*
    ���ʹ��if else��֧�ṹ�ж��Ƿ�Ϊ�����ͷǸ���
 */

import java.util.Scanner; 
 
public class IfElseJudgeTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����һ��������ʹ�ñ�����¼
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.ʹ��if else��֧�ṹ�жϸ����ͷǸ�������ӡ
		if(num < 0) {
			System.out.println(num + "�Ǹ�����");
		} else {
			//System.out.println(num + "�ǷǸ�����");
			// ���Ŀǰ�ķǸ����ٴ��ж�������������
			if(num > 0) {
				System.out.println(num + "������!");
			} else {
				System.out.println(num + "���㣡");
			}
		}
	}
}
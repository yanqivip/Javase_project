/*
    ���ʹ�ù�ϵ�����ʵ�ָ������ж�
 */

import java.util.Scanner; 
 
public class RelationJudgeTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����һ��������ʹ�ñ�����¼
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.�жϸ������Ƿ�Ϊ��������ӡ
		boolean b1 = num < 0;
		System.out.println("b1 = " + b1);
		System.out.println(num < 0);
	}
}
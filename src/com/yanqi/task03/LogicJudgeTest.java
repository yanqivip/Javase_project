/*
    ���ʹ���߼�������ж���λ��
 */

import java.util.Scanner; 
 
public class LogicJudgeTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����һ����������ʹ�ñ�����¼
		System.out.println("������һ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.ʹ���߼�������ж��Ƿ�Ϊ��λ������ӡ    >= 100   <= 999   &&
		//System.out.println(100 <= num <= 999); // ����: ��Ԫ����� '<=' �Ĳ��������ʹ���
		// �߼��������Ҫ�������Ӷ����ϵ�������Ϊ��������ı��ʽ������ʵ�ֶ�����������
		System.out.println(100 <= num && num <= 999);
		// ʹ����Ŀ��������ж��Ƿ�Ϊ��λ��
		System.out.println(num + ((100 <= num && num <= 999)? "����λ��": "������λ��"));
	}
}
 
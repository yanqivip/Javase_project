/*
    ���ʹ��forѭ��ʵ�ֲ�������Ϸ
 */

import java.util.Random; 
import java.util.Scanner;
 
public class ForGuessTest {
	
	public static void main(String[] args) {
		
		// 1.�������1 ~ 100֮���������ʹ�ñ�����¼
		Random ra = new Random();
		int temp = ra.nextInt(100) + 1;
		//System.out.println("temp = " + temp);
		
		// 4.����һ��int���͵ı�����ͳ���û��²�Ĵ���
		int cnt = 0;
		
		for(;;) {
			// 2.��ʾ�û�����1 ~ 100֮��²��������ʹ�ñ�����¼
			System.out.println("������1 ~ 100֮��²��������");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			cnt++;
			
			// 3.ʹ���û�����������������֮��Ƚϴ�С��������Ӧ����ʾ
			if(num > temp) {
				System.out.println("�´��ˣ���Сһ��ɣ�");
			} else if(num < temp) {
				System.out.println("��С�ˣ��ٴ�һ��ɣ�");
			} else {
				System.out.println("��ϲ���¶��ˣ���Ϸ������");
				break;
			}
		}
		
		if(1 == cnt) {
			System.out.println("���Ȼ�Ǹ��󿧣�");
		} else if(cnt <= 6) {
			System.out.println("ˮƽ������������Ŷ��");
		} else {
			System.out.println("�㻹���Զ��漸����Ϸ��");
		}
		
		
	}
}
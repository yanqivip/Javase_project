/*
    ���ʹ��whileѭ��ʵ�ֵ������е��ۼӺͲ���ӡ
 */

import java.util.Scanner; 
 
public class WhileSumTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����һ��������ʹ�ñ�����¼
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.ʹ��whileѭ������������еĺͲ�ʹ�ñ�����¼
		double sum = 0.0;
		/*
		for(int i = 1; i <= num; i++) {
			sum += 1.0/i;
		}
		*/
		int i = 1;
		while(i <= num) {
			sum += 1.0/i;
			 i++;
		}
		
		// 3.��ӡ���յļ�����
		System.out.println("���յļ������ǣ�" + sum);
	}
}
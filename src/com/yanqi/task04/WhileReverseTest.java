/*
    ���ʹ��whileѭ��ʵ�������������ķ������
 */

import java.util.Scanner; 
 
public class WhileReverseTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����һ����������ʹ�ñ�����¼  123
		System.out.println("������һ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.ʹ��whileѭ�����в�ֲ���ӡ
		//while(num > 0) {
			//System.out.print(num % 10);  // ��ָ�λ��
			//num /= 10;  // ������λ��
		//}
		// 2.ʹ��whileѭ����������е�ÿ�����ֲ���¼��������
		int res = 0;
		int temp = num;  // ָ��������Ϊnum������
		while(temp > 0) {
			res = res*10 + temp % 10; // 3     32   321
			temp /= 10;               // 12    1    0
		}
		
		// 3.��ӡ�����Ľ��
		System.out.println(num + "�����Ľ���ǣ�" + res);
	}
}
/*
    ���ʹ����Ŀ������������ֵ
 */

import java.util.Scanner; 
 
public class ThreeEyeTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û���������������ʹ�ñ�����¼
		System.out.println("����������������");
		Scanner sc = new Scanner(System.in);
		int ia = sc.nextInt();
		int ib = sc.nextInt();
		
		// 2.ʹ����Ŀ������ҵ����ֵ����ӡ
		int max = ia > ib? ia: ib;
		System.out.println("���ֵ�ǣ�" + max);
		System.out.println("���ֵ�ǣ�" + (ia > ib? ia: ib));
	}
}
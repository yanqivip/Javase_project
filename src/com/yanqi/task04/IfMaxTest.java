/*
    ���ʹ��if��֧�ṹ�������������е����ֵ
 */

import java.util.Scanner; 
 
public class IfMaxTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û���������������ʹ�ñ�����¼
		System.out.println("����������������");
		Scanner sc = new Scanner(System.in);
		int ia = sc.nextInt();
		int ib = sc.nextInt();
		
		// 2.ʹ��if��֧�ṹ�ҵ����ֵ����ӡ
		// ��ʽһ��ʹ������if��֧�ṹ�����ҵ����ֵ
		/*
		if(ia >= ib) {
			System.out.println("���ֵ�ǣ�" + ia);
		}
		if(ia < ib) {
			System.out.println("���ֵ�ǣ�" + ib);
		}
		*/
		// ��ʽ���������һ����Ϊ���ֵ����¼  �Ƽ���ʽ  ͨ����
		int max = ia;
		if(ib > max) {
			max = ib;
		}
		System.out.println("���ֵ�ǣ�" + max);
	}
}
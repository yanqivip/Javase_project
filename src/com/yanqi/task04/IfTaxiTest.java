/*
    ���ʹ��if��֧�ṹʵ�ֳ��⳵�Ʒ�ϵͳ��ʵ��
 */

import java.util.Scanner; 
 
public class IfTaxiTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û����빫�����͵ȴ���������ʹ�ñ�����¼
		System.out.println("�����빫�����͵ȴ���������");
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		int sec = sc.nextInt();
		
		// 2.���ݹ����������Ӧ����̷Ѳ�ʹ�ñ�����¼
		int kmPrice = 0;
		if(km <= 3) {
			kmPrice = 13;
		} else if(km <= 15) {
			kmPrice = 13 + (km - 3) * 2;
		} else {
			kmPrice = 13 + (15 - 3) * 2 + (km - 15) * 3;
		}
		
		// 3.���ݵȴ��������������Ӧ�ĵȴ��Ѳ�ʹ�ñ�����¼
		int secPrice = sec / 150;
		
		// 4.�����ܷ��ò���ӡ
		int sumPrice = kmPrice + secPrice;
		System.out.println("���γ��⳵���ܷ����ǣ�" + sumPrice);
	}
}
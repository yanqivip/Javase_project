/*
    ���ʹ��forѭ����break�ؼ�����ģ������Ĺ���
 */

import java.util.Scanner; 
 
public class ForBreakTest {
	
	public static void main(String[] args) {
		
		// 5.����һ��boolean���͵ı�����Ϊ���ͷ��ı�־
		boolean flag = true;
		
		// 4.ʹ������ѭ����ģ�ⲻ�ϵ�����
		for(;;) {
			// 1.��ʾ�û�����Ҫ���͵��������ݲ�ʹ�ñ�����¼
			System.out.println("��" + (flag? "����": "����") +"����Ҫ���͵��������ݣ�");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			// 2.�ж��û�����������Ƿ�Ϊ"bye"���������������
			if("bye".equals(str)) {
				System.out.println("���������");
				break; // ����������ǰѭ��
			}
			// 3.���������ӡ�û��������������
			//else {
				//System.out.println("���������ǣ�" + str);
			//}
			System.out.println((flag? "����˵��": "����˵��") + str + "\n\n\n");
			flag = !flag;
		}
		// ...
	}
}
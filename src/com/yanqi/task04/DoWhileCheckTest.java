/*
    ���ʹ��do whileѭ����ģ��ѧϰЧ���ļ��
 */

import java.util.Scanner; 
 
public class DoWhileCheckTest {
	
	public static void main(String[] args) throws Exception {
		
		String msg = null;  // �� 
 		do {
			System.out.println("���ڷ��ѧϰ��...");
			Thread.sleep(5000); // ģ��5����
			System.out.println("�Ƿ�ϸ񣿣�y/n��");
			Scanner sc = new Scanner(System.in);
			msg = sc.next();
		} while(!"y".equals(msg));
		
		System.out.println("��ϲ����ϸ�");
		
		System.out.println("-------------------------------------------------------------");
		// ��ʣ� ʮ��Ȼ��    ���Կ��㣺��û�зֺ�
		int i = 1;
		while(i <= 10000) {
			;  // ����䣬ɶҲ���ɣ�����������ʱ
		}
		{
			System.out.println("I Love You !");
			i++;
		}
	}
}
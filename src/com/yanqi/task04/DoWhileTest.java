/*
    ���ʵ��do whileѭ����ʹ��
 */
public class DoWhileTest {
	
	public static void main(String[] args) {
		
		// 1.ʹ��forѭ����ӡ1 ~ 10֮�����������
		// ��()��{}�������ı�����������������÷�Χ�Ǵ�������ʼһֱ���������
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("-----------------------------");
		// 2.ʹ��whileѭ����ӡ1 ~ 10֮�����������
		//int i = 1;
		int i = 11;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		
		System.out.println("-----------------------------");
		// ʹ��do whileѭ����ӡ1 ~ 10֮�����������
		//i = 1;
		i = 11;
		do {
			System.out.println("i = " + i);
			i++;
		} while(i <= 10);
		
		
	}
}
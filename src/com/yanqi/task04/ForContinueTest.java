/*
    ���ʵ��continue�ؼ��ֵ�ʹ��
 */
public class ForContinueTest {
	
	public static void main(String[] args) {
		
		// 1.ʹ��forѭ����ӡ1 ~ 20֮�����������
		for(int i = 1; i <= 20; i++) {
			// ������5�ı�������������ӡ������ת��������ӡ��һ����
			if(0 == i % 5) {
				continue; // ��ʾ��ǰ��������ѭ����������һ��ѭ����Ҳ���Ǳ�����i++
			}
			System.out.println("i = " + i);
		}
	}
}
/*
    ʹ��˫��forѭ����ӡ�žų˷���
 */
public class ForForTableTest {
	
	public static void main(String[] args) {
		
		// 1.ʹ�����forѭ�����ƴ�ӡ��������һ��9��
		outer:for(int i = 1; i <= 9; i++) {
			// 2.ʹ���ڲ�forѭ�����ƴ�ӡ�����������9�У������ǣ��뵱ǰ�����ڵ��������
			for(int j = 1; j <= i; j++) {
				// 3.ʹ������ѭ��������ƴ�ӵ�ʽ
				System.out.print(j + "*" + i + "=" + j*i + " ");
				// 4.����ӡ���6*6 = 36�����������ӡ
				if(6 == j) {
					//break; // ��Ҫ��������ѭ�������ùؼ���ֻ��������ǰ���ڵ�ѭ��
					break outer; // ��ʾ�����������forѭ��
				}
			}
			System.out.println();
		}
	}
}
/*
    ���ʹ��forѭ��ʵ��1 ~ 10000֮�������������ۼӺ�
 */
public class ForSumTest {
	
	public static void main(String[] args) {
		
		// 2.����һ�����������¼�ۼӵĽ��
		int sum = 0;
		
		// 1.ʹ��forѭ����ӡ1 ~ 10000֮�����������
		for(int i = 1; i <= 10000; i++) {
			// ��ӡ�󲻻���
			//System.out.print(i + " ");
			// ������i��ȡֵ���ۼӵ�����sum��
			sum += i; // sum = sum + i;
		}
		// ר�����ڻ���
		//System.out.println();
		
		// 3.��ӡ���յ��ۼӽ��
		System.out.println("sum = " + sum);
	}
}
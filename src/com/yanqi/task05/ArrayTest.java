/*
    ���ʵ��һά�����������ʹ��
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 1.����һ������Ϊ2Ԫ������Ϊint���͵�һά����
		// ��������[] �������� = new ��������[����ĳ���];
		//int arr1[] = new int[2];    // ���ַ�ʽ�ӽ������˵��һ���ģ����Ƽ�ʹ��
		//int num = 2;                // ����һ����ʼֵΪ2�ı��� 
		int[] arr1 = new int[2];      // �Ƽ��÷�ʽ����������������������֣�����˴���Ŀɶ���   ��̬��ʽ
		
		// 2.��ӡһά����ĳ����Լ�ÿ��Ԫ�ص���ֵ
		System.out.println("����ĳ����ǣ�" + arr1.length); // 2   �±��0 ~ 1
		System.out.println("�±�Ϊ0��Ԫ���ǣ�" + arr1[0]);  // 0  Ĭ��ֵ
		System.out.println("�±�Ϊ1��Ԫ���ǣ�" + arr1[1]); 	// 0  
        //System.out.println("�±�Ϊ2��Ԫ���ǣ�" + arr1[2]); 	// ����ok�����з���ArrayIndexOutOfBoundsException�����±�Խ���쳣

		System.out.println("------------------------------------------------");
		// 3.ʹ��forѭ����ӡ�����е�����Ԫ��
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("�±�Ϊ" + i + "��Ԫ���ǣ�" + arr1[i]); // ȫ��0
		}
		// 7.ֱ��ͨ������������ӡ�����е�����Ԫ��
		System.out.println("arr1 = " + arr1); // ��ַ��Ϣ
		
		System.out.println("------------------------------------------------");
		// 4.����һ������Ϊ5Ԫ������Ϊdouble���͵�һά����
		double[] arr2 = new double[5];
		// ��ӡ������ÿ��Ԫ��ֵ
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("�±�Ϊ" + i + "��Ԫ���ǣ�" + arr2[i]); // ȫ��0.0 
		}
		
		System.out.println("------------------------------------------------");
		// 5.���������ͬʱ�Ͷ������е�Ԫ�ؽ��г�ʼ��   ��̬��ʽ�ļ򻯰�
		char[] arr3 = {'a', 'b', 'c', 'd'};
		// ��ӡ�����е�ÿ��Ԫ��ֵ
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("�±�Ϊ" + i + "��Ԫ���ǣ�" + arr3[i]); // a b c d
		}
		
		System.out.println("------------------------------------------------");
		// 6.�����д��   ��̬��ʽ
		boolean[] arr4 = new boolean[]{true, true, false, false};
		// ��ӡ�����е�ÿ��Ԫ��ֵ
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("�±�Ϊ" + i + "��Ԫ���ǣ�" + arr4[i]); // true true false false
		}
	}
}
/*
    ���ʵ�����鹤�����ʹ��
 */

import java.util.Arrays; 
 
public class ArraysTest {
	
	public static void main(String[] args) {
		
		// 1.����һ����ʼֵΪ10��20��30��40��50��һά����
		int[] arr1 = {10, 20, 30, 40, 50};
		// 2.ʹ��ԭʼ��ʽ��ӡ�����е�����Ԫ�أ�Ҫ���ӡ��ʽΪ��[10, 20, 30, 40, 50]
		System.out.print("��һ�������е�Ԫ���У�[");
		for(int i = 0; i < arr1.length; i++) {
			// ����ӡ��Ԫ�������һ��Ԫ��ʱ����ֱ�Ӵ�ӡԪ�ر�����
			if(arr1.length-1 == i) {
				System.out.print(arr1[i]);
			} else {
				// �����ӡԪ�غ��ӡ���żӿո�
				System.out.print(arr1[i] + ", ");
			}
		}
		System.out.println("]");
		
		System.out.println("---------------------------------------------------");
		// 3.ʹ�����鹤����ʵ������������Ԫ�صĴ�ӡ
		System.out.println("��һ�������е�Ԫ���У�" + Arrays.toString(arr1));  // [10, 20, 30, 40, 50]
		
		System.out.println("---------------------------------------------------");
		// 4.����һ������Ϊ5Ԫ������Ϊint���͵�һά����
		int[] arr2 = new int[5];
		System.out.println("�ڶ��������е�Ԫ���У�" + Arrays.toString(arr2)); // [0, 0, 0, 0, 0]
		// ʹ�����鹤�����е�fill����ʵ��������Ԫ�ص���䲢��ӡ
		// ��ʾʹ��10���������arr�е�ÿ��Ԫ�أ�Ҳ���Ǹ�������ÿ��Ԫ�ظ�ֵΪ10
		Arrays.fill(arr2, 10);
		System.out.println("�ڶ��������е�Ԫ���У�" + Arrays.toString(arr2)); // [10, 10, 10, 10, 10]
		
		System.out.println("---------------------------------------------------");
		// 5.����һ������Ϊ5Ԫ������Ϊint���͵�һά���鲢��ʼ��
		int[] arr3 = new int[5];
		Arrays.fill(arr3, 10);
		System.out.println("�����������е�Ԫ���У�" + Arrays.toString(arr3)); // [10, 10, 10, 10, 10]
		// �жϸ������Ƿ�������������Ȳ���ӡ������ͬ���ӡtrue�������ӡfalse
		System.out.println(Arrays.equals(arr2, arr3)); // true
		// �޸�����3�е�Ԫ��ֵ
		arr3[4] = 20;
		System.out.println("�����������е�Ԫ���У�" + Arrays.toString(arr3)); // [10, 10, 10, 10, 20]
		System.out.println(Arrays.equals(arr2, arr3)); // false  Ҫ������Ҫ��ͬ
		arr2[3] = 20;
		System.out.println("�ڶ��������е�Ԫ���У�" + Arrays.toString(arr2)); // [10, 10, 10, 20, 10]
		System.out.println(Arrays.equals(arr2, arr3)); // false  Ҫ��˳��Ҫ��ͬ
	}
}
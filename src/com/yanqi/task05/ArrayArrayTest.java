/*
    ���ʵ�ֶ�ά�����������ʹ��
 */
public class ArrayArrayTest {
	
	public static void main(String[] args) {
		
		// 1.����һ������2��3��Ԫ������Ϊint���͵Ķ�ά����
		int[][] arr1 = new int[2][3];
		// ��ӡ�����е�ÿ��Ԫ��
		// ʹ�����forѭ�����ƴ�ӡ������
		for(int i = 0; i < arr1.length; i++) {
			// ʹ���ڲ�forѭ�����ƴ�ӡ������
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " "); // ȫ��0
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		// 2.ʵ�ֶ�ά������Ԫ�صĸ�ֵ
		int cnt = 1;
		// ʹ�����forѭ�����ƴ�ӡ������
		for(int i = 0; i < arr1.length; i++) {
			// ʹ���ڲ�forѭ�����ƴ�ӡ������
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = cnt++;
			}
		}
		// ʹ�����forѭ�����ƴ�ӡ������
		for(int i = 0; i < arr1.length; i++) {
			// ʹ���ڲ�forѭ�����ƴ�ӡ������
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " "); // 1 2 3   4 5 6
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		// 3.��ά����Ԫ�صĳ�ʼ������
		int[][] arr2 = {{11, 22, 33, 44}, {55, 66, 77, 88}};
		// ʹ�����forѭ�����ƴ�ӡ������
		for(int i = 0; i < arr2.length; i++) {
			// ʹ���ڲ�forѭ�����ƴ�ӡ������
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " "); // 11 22 33 44   55 66 77 88
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		// 4.����
		int[][] arr3 = new int[3][];
		arr3[0] = new int[3];
		arr3[1] = new int[4];
		arr3[2] = new int[5];
	}
}
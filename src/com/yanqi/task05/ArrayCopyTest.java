/*
    ���ʵ������֮��Ԫ�صĿ���
 */
public class ArrayCopyTest {
	
	public static void main(String[] args) {
		
		// 1.����һ����ʼֵΪ11��22��33��44��55��һά����
		int[] arr = {11, 22, 33, 44, 55};
		// ��ӡ�����е�����Ԫ��
		System.out.print("��һ�������е�Ԫ���У�");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 22 33 44 55
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		// 2.����һ������Ϊ3Ԫ������Ϊint���͵�һά����
		int[] brr = new int[3];
		// ��ӡ�����е�����Ԫ��
		System.out.print("�ڶ��������е�Ԫ���У�");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 0 0 0
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		// 3.����һ�������е��м�3��Ԫ�ظ�ֵ���ڶ���������
		/*
		brr[0] = arr[1];
		brr[1] = arr[2];
		brr[2] = arr[3];
		*/
		/*
		for(int i = 0; i < brr.length; i++) {
			brr[i] = arr[i+1];
		}
		*/
		// ����ֱ��ʹ��Java�ٷ��ṩ�Ŀ�������
		// ��ʾ������arr���±��1��ʼ��3��Ԫ�ؿ���������brr���±��0��ʼ��λ��
		System.arraycopy(arr, 1, brr, 0, 3);
		// ��ӡ�ڶ��������е�����Ԫ��
		System.out.print("�ڶ��������е�Ԫ���У�");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 22 33 44
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		// 4.���Կ���
		// ��ʾ������arr����ֵ��ֵ������brr�����Ǳ���brr��ԭ������ֵ
		// ������arr���ڴ�ռ��д�ŵ��������ڶ����е��ڴ��ַ��Ϣ����ֵ����brr�����д����arr��ָ��������ڴ��ַ
		// Ҳ������brr��arrָ����ͬһ������ռ䣬�б����Ͼ��Ǹı�ָ�����
		brr = arr;
		// ��ӡ�ڶ��������е�����Ԫ��
		System.out.print("�ڶ��������е�Ԫ���У�");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 22 33 44
		}
		System.out.println();	
		
	}
}
/*
    ���ʵ��һά�������ɾ�Ĳ����
*/
public class ArrayOpTest {
	
	public static void main(String[] args) {
		
		// 1.����һ������Ϊ5Ԫ������Ϊint���͵�һά����
		int[] arr = new int[5];
		// ��ӡ����������Ԫ�ص���ֵ
		System.out.print("�����е�Ԫ���У�");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // ȫ��Ĭ��ֵ0
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		// 2.������11 22 33 44���ζ�������ǰ�ĸ�Ԫ�ظ�ֵ
		/*
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		*/
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = (i+1)*11;
		}
		// ��ӡ����������Ԫ�ص���ֵ
		System.out.print("�����е�Ԫ���У�");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 22 33 44 0
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		// 3.������55���뵽�±�Ϊ0��λ�ã�ԭ��Ԫ������ƶ�
		/*
		arr[4] = arr[3];
		arr[3] = arr[2];
		arr[2] = arr[1];
		arr[1] = arr[0];
		arr[0] = 55;
		*/
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = 55;
		// ��ӡ����������Ԫ�ص���ֵ
		System.out.print("�����е�Ԫ���У�");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 55 11 22 33 44
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		// 4.������55��������ɾ����ɾ����ʽΪ����Ԫ����ǰ�ƶ������һ��λ����Ϊ0
		/*
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = arr[3];
		arr[3] = arr[4];
		*/
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[4] = 0;
		// ��ӡ����������Ԫ�ص���ֵ
		System.out.print("�����е�Ԫ���У�");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 22 33 44 0
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		// 5.�����������Ƿ���Ԫ��22���������޸�Ϊ220
		for(int i = 0; i < arr.length; i++) {
			if(22 == arr[i]) {
				arr[i] = 220;
			}
		}
		// ��ӡ����������Ԫ�ص���ֵ
		System.out.print("�����е�Ԫ���У�");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 220 33 44 0
		}
		System.out.println();
	}
}
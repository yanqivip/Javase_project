package cn.yanqi.task08;

/*
    ���ʵ��main�����Ĳ���
 */
public class MainTest {
	
	public static void main(String[] args) {
		
		System.out.println("����������Ԫ�صĸ����ǣ�" + args.length);
		System.out.println("���ݸ�main������ʵ�ʲ���Ϊ��");
		for(int i = 0; i < args.length; i++) {
			System.out.println("�±�Ϊ" + i + "���βα�����ֵΪ��" + args[i]);
		}
	}
}
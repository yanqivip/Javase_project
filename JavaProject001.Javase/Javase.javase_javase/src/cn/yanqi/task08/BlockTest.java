package cn.yanqi.task08;

/*
    ���ʵ�ֹ����;�̬������ʹ��
 */
public class BlockTest {
	
	// ����Ҫ��ִ�й��췽����֮ǰ��һЩ׼������ʱ����׼����������ش���д�ڹ�����м��ɣ����磺�Գ�Ա�������е�ͳһ��ʼ������
	{
		System.out.println("����飡"); // (2)
	}
	
	// ��̬������������ļ��ض�׼�������������ڹ����ִ��
	// ����Ҫ��ִ�д����֮ǰ������ļ�����һЩ׼������ʱ�����д���뵽��̬������У����磺�������ݿ����������
	static {
		System.out.println("#####################��̬����飡");   // (1)
	}
	
	// �Զ��幹�췽��
	public BlockTest() {
		System.out.println("====���췽���壡"); // (3)
	}
	
	public static void main(String[] args) {
		
		BlockTest bt = new BlockTest();
		
		
		BlockTest bt2 = new BlockTest();
	}
}
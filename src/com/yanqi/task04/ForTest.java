/*
    ���ʵ��forѭ����ʹ�ã�ģ������Ϸ�Ĺ���
 */
public class ForTest {
	
	public static void main(String[] args) throws Exception {
		
		for(int i = 1; i <= 10; i++) { // i = i + 1  => i += 1  => i++
			System.out.println("����Լ����󼪴��������ڽ��е�" + i + "����Ϸ...");
			Thread.sleep(5000); // ��ʾģ��˯��5���Ч��
			System.out.println("������Ϸ������\n\n\n");
		}
		
		System.out.println("����Ϣ�ˣ������������Ͼ�Ҫ�ٵ��ˣ�");
	}
}
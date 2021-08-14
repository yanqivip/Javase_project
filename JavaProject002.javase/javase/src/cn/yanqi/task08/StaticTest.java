package cn.yanqi.task08;

/*
    ���ʵ��static�ؼ��ֵ�ʹ��
 */
public class StaticTest {
	
	private int cnt = 1; // �����ڶ���㼶��Ҳ����ÿ������ӵ�ж�����һ��
	private static int snt = 2; // ��������㼶��Ҳ�������ж��󶼹���ͬһ��
	
	// �Զ���Ǿ�̬�ĳ�Ա����  ��Ҫʹ������.�ķ�ʽ����
	public void show() {
		System.out.println("cnt = " + this.cnt); // 1
		System.out.println("snt = " + this.snt); // 2  ��̬��Ա�����ж�����this�ؼ��ֿ���ʡ��
	}
	// �Զ��徲̬�ĳ�Ա���� �Ƽ�ʹ������.�ķ�ʽ����
	public static void test() {
		// StaticTest st = new StaticTest();
		//System.out.println("cnt = " + cnt); // 1   ��̬��Ա������û��this�ؼ��֣���Ϊ�ǿ���ͨ������.��ʽ���õ�
		System.out.println("snt = " + snt); // 2 
	}
	
	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		st.show();
		
		System.out.println("--------------------------------");
		StaticTest.test();
	}
}
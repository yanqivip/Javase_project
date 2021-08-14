package cn.yanqi.task08;

/*
    ���ʵ��Worker��Ĳ���
 */
public class WorkerTest {
	
	public static void main(String[] args) {
		
		// 1.ʹ���޲η�ʽ����Worker���͵Ķ��󲢴�ӡ����
		Worker w1 = new Worker();
		// ��������дshow��������������õ�����д�Ժ�İ汾
		w1.show(); // null  0
		
		System.out.println("----------------------------------");
		// 2.ʹ���вη�ʽ����Worker���͵Ķ��󲢴�ӡ����
		Worker w2 = new Worker("zhangfei", 30, 3000);
		w2.show(); // zhangfei ...
		// ���ó�Ա��������
		w2.eat("��ѿ");
		w2.play("������ҫ");
		w2.work();
	}
}
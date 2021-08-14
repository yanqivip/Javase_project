package cn.yanqi.task08;

/*
    �Զ���Worker��̳���Person��
 */
public class Worker extends Person {
	
	private int salary;
	
	public Worker() {
		super(); // ��ʾ���ø�����޲ι��췽������û�м���������Զ����
		System.out.println("Worker()");
	}
	public Worker(String name, int age, int salary) {
		super(name, age); // ��ʾ���ø�����вι��췽��
		System.out.println("Worker(String, int, int)");
		//setName(name);
		//setAge(age);
		setSalary(salary);
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary >= 2200) {
			this.salary = salary;
		} else {
			System.out.println("нˮ������Ŷ������");
		}
	}
	
	// �Զ����Ա����������������Ϊ
	public void work() {
		System.out.println("�����שͷ�е�����...");
	}
	// �Զ���show�������ǴӸ����м̳еİ汾
	@Override  // ��ע/ע�⣬����˵������ķ����ǶԸ��෽������д����û�й�����д����뱨��
	public void show() {
		super.show(); // ��ʾ���ø����show����
		System.out.println("�ҵ�нˮ�ǣ�" + getSalary());
	}
}
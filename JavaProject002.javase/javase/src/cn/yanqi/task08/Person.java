package cn.yanqi.task08;

/*
    ���ʵ��Person��ķ�װ
 */
public class Person {
	
	// 1.˽�л���Ա������ʹ��private�ؼ�������
	private String name;
	private int age;
	//private boolean gender; // �Ա�
	
	// 3.�ڹ��췽���е���set�������к���ֵ���ж�
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name, int age) {
		System.out.println("Person(String, int)");
		setName(name);
		setAge(age);
	}
	
	// 2.�ṩ���е�get��set�������ڷ������н��к���ֵ���ж�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0 && age < 150) {
			this.age = age;
		} else {
			System.out.println("���䲻����Ŷ������");
		}
	}
	
	// �Զ����Ա����ʵ�������Ĵ�ӡ
	public void show() {
		System.out.println("����" + getName() + "������" + getAge() + "���ˣ�");
	}
	// �Զ����Ա���������Է�����Ϊ
	public void eat(String food) {
		System.out.println(food + "��óԣ�");
	}
	// �Զ����Ա�����������ֵ���Ϊ
	public void play(String game) {
		System.out.println(game + "����棡");
	}
}
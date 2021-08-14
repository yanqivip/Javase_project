package cn.yanqi.task08;

/*
    ���ʵ��People��ķ�װ
 */
public class People {
	
	// 1.˽�л���Ա������ʹ��private�ؼ�������
	private String name;
	private int age;
	//private String country; // �����ڶ���㼶��Ҳ����ÿ������ӵ�ж�����һ��
	//public static String country; // ��������㼶��Ҳ����������ֻ��һ�ݲ��ұ����ж�����
	private static String country;
	
	// 3.�ڹ��췽���е���set�������к���ֵ���ж�
	public People() {}
	public People(String name, int age/*, String country*/) {
		setName(name);
		setAge(age);
		//setCountry(country);
	}
	
	// 2.�ṩ���е�get��set���������ڷ������н��к���ֵ���ж�
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
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		//this.country = country;
		People.country = country;
	}
	
	public void show() {
		System.out.println("����" + getName() + "������" + getAge() + "���ˣ�����" + getCountry());
	}
}
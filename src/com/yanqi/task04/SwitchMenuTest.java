/*
    ���ʹ��switch case��֧�ṹ��ģ��˵���Ч��
 */

import java.util.Scanner; 
 
public class SwitchMenuTest {
	
	public static void main(String[] args) {
		
		// 1.�����ַ�����
		System.out.println("         ��ӭ������������");
		System.out.println("-------------------------------------");
		System.out.print(" [1]ѧԱϵͳ     ");
		System.out.println("[2]����Աϵͳ");
		System.out.println(" [0]�˳�ϵͳ");
		System.out.println("-------------------------------------");
		System.out.println("��ѡ��Ҫ�����ϵͳ��");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		// 2.ʹ��switch case��֧�ṹ��ģ���û���ѡ�񲢸�����ʾ
		switch(choose) {
			case 1: System.out.println("���ڽ���ѧԱϵͳ..."); break;
			case 2: System.out.println("���ڽ������Աϵͳ..."); break;
			case 0: System.out.println("ллʹ�ã��´��ټ���"); break;
			default: System.out.println("�������������ѡ��");
		}
	}
}
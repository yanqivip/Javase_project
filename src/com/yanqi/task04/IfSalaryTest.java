/*
    ���ʹ��if else if else��֧�ṹ�������������˰
 */

import java.util.Scanner; 
 
public class IfSalaryTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�������˵�нˮ��ʹ�ñ�����¼
		System.out.println("����������нˮ��");
		Scanner sc = new Scanner(System.in);
		// �ֲ����������÷�Χ�Ǵ�������ʼһֱ���������
		int salary = sc.nextInt();
		
		// 2.ʹ��if else if else��֧�ṹ�ж�нˮ���ڵķ�Χ�������Ӧ�ĸ�������˰
		// ��������˰��ʽ�� ����Ӧ��˰���ö� * ��Ӧ��˰�� - ����۳���
		double salaryPrice = 0.0;
		if(salary <= 5000) {
			System.out.println("������˰��");
		}
		else if(salary <= 8000) {
			// ����������÷�Χ�Ǵ�������ʼһֱ����ǰ�������
			//double salaryPrice = (salary - 5000) * 0.03;
			//salaryPrice = (salary - 5000) * 0.03;
			salaryPrice = (salary - 5000) * 0.03 - 0;
		}
		else if(salary <= 17000) {
			//salaryPrice = (salary - 8000) * 0.1 + (8000 - 5000) * 0.03;
			salaryPrice = (salary - 5000) * 0.1 - 210;
		}
		else if(salary <= 30000) {
			//salaryPrice = (salary - 17000) * 0.2 + (17000 - 8000) * 0.1 + (8000 - 5000) * 0.03;
			salaryPrice = (salary - 5000) * 0.2 - 1410;
		}
		// ...
		
		// 3.��ӡ���յļ�����
		System.out.println("���յĸ�������˰�ǣ�" + salaryPrice);
	}
}
/*
   ���ʵ�ֱ������������
 */

// ����javaĿ¼��utilĿ¼��Scanner��
import java.util.Scanner; 
 
public class VarIOTest {
	
	public static void main(String[] args) {
		
		// 1.���������������ڼ�¼������������Ϣ
		//String name;
		//int age;
		
		// 2.��ʾ�û��Ӽ�������������������Ϣ�����뵽������   ������ʹ��������
		System.out.println("����������������������Ϣ��");
		// ����һ��ɨ������ɨ��������������  System.in�����������
		Scanner sc = new Scanner(System.in);
		// ͨ��ɨ������ȡһ���ַ������ݷ������name��
		String name = sc.next();
		// ͨ��ɨ������ȡһ���������ݷ������age��
		int age = sc.nextInt();
		
		// 3.��ӡ��������ֵ     �����ܼ����ظ��Ĵ���
		//System.out.println("name = " + name);
		//System.out.println("age = " + age);
		System.out.println("name = " + name + ", age = " + age);
	}
} 
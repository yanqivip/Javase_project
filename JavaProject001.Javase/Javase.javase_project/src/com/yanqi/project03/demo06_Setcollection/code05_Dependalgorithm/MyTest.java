package com.yanqi.project03.demo06_Setcollection.code05_Dependalgorithm;

import java.util.*;

public class MyTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>() ;
		
		//��Ȼ��ȷ1000��ֵ�����ǲ�����forѭ����
		//��Ϊһ�����ظ�ֵ�ͻ��˷�һ��ѭ����
		//���Ժ��п���ѭ����������1000
		while(al.size()<1000){
			int value = (int)(Math.random()*2000) ;//���������
			//���ʹ�õ��ж���û�е��㷨
			boolean b = true ;
			for(int v : al){//�����ѭ���������
				if(value==v){
					b = false ;
					break ;
				}
			}
			if(b){
				al.add(value) ;
			}
		}
		
		//��֤
		for(int v : al){
			System.out.print(v+"\t") ;
 		}
	}
}
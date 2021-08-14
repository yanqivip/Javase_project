package com.yanqi.project03.demo06_Setcollection.code04_Selectionsort;

import java.util.*;

public class MyTest {
	public static void main(String[] args) {
		//����1000����0��2000֮��������
		HashSet<Integer> hs = new HashSet<Integer>() ;
		
		while(hs.size()<1000){
			int value = (int)(Math.random()*2000) ;//���������
			hs.add(value) ;
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>(hs) ;
		
		//����
		ArrayList<Integer> sort = new ArrayList<Integer>() ; 
		while(al.size()>0){
			//Ѱ����Сֵ
			int minValue = 2001 ;
			for(int v : al){
				if(minValue>v){
					minValue = v ;
				}
			}
			//��ʣ�µ���Сֵ����sort
			sort.add(minValue) ;
			//��ȡ�ߵ�ֵ��al��ɾ����������al.remove�������������Σ�
			//һ���ǽ���int������ɾ��ָ���±��ֵ��һ���ǽ���Object
			//������ɾ��ָ�������������������⣬���ǵ�ֵҲ��int��
			//ֱ��ɾ��ֵ�ᱻϵͳ����Ϊ�ṩ�����±꣬���Խ�ֵ��װ�ɶ���
			al.remove(new Integer(minValue)) ;
		}
		//��֤
		for(int v : sort){
			System.out.print(v+"\t") ;
 		}
	}
}
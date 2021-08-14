package com.yanqi.project03.demo07_Binarytree;

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
		int sort[] = new int[2000] ;
		for(int v : al){
			sort[v] = v ;
 		}
		
		al.clear() ;
		for(int v : sort){
			if(v>0){
				al.add(v) ;
			}
		}
		if(al.size()<1000){
			al.add(0,0) ;
		}
		
		//���ֲ���
		int des = 876 ;
		
		int minIndex = 0;
		int maxIndex = 999;
		while(true) {
			//�����м��±�ֵ
			int midIndex = (minIndex + maxIndex)/2;
			//�ҵ���
			if(des == al.get(midIndex)) {
				System.out.println("�ҵ��ˣ���"+midIndex+"����") ;
				break ;
			}
			//�ҵ���ֵ��
			if(des <al.get(midIndex)) {
				maxIndex = midIndex - 1;
			}
			//�ҵ���ֵС
			if(des > al.get(midIndex)){
				minIndex = midIndex + 1;
			}
			//û�ҵ�
			if(minIndex>maxIndex){
				System.out.println("û�ҵ�") ;
				break ;
			}
		}
	}
}
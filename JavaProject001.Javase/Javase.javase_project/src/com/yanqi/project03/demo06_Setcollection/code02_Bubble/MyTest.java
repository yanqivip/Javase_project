package com.yanqi.project03.demo06_Setcollection.code02_Bubble;

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
		
		//ð������
		boolean change = true ;
		while(change){
			//�������Ľ���û��ִ�У�change����false��ѭ������
			change = false ;
			for(int i = 0 ; i < al.size()-1 ; i ++){
				if(al.get(i)>al.get(i+1)){
					//����
					int tmp = al.get(i) ;
					al.set(i, al.get(i+1)) ;
					al.set(i+1, tmp) ;
					//��Ϊ�н����ˣ����Ի�Ҫ��ѭ��һ��
					change = true ;
				}
			}
		}
		//��֤
		for(int v : al){
			System.out.print(v+"\t") ;
 		}
	}
}
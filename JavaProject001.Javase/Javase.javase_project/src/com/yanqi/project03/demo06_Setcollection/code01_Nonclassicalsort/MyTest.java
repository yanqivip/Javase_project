package com.yanqi.project03.demo06_Setcollection.code01_Nonclassicalsort;

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
		//ѭ�������Ľ����sort�����д�����1000���������1000��0
		for(int v : al){
			sort[v] = v ;//���������±��λ����
 		}
		
		al.clear() ;
		for(int v : sort){
			//��0�޳���������������´��al
			if(v>0){
				al.add(v) ;
			}
		}
		//��һ���ɵ��������0�����0�ᱻ��С���޳���
	//����size�Ͳ���1000�ˣ����ǽ�0�ӻ�ȥ
		if(al.size()<1000){
			al.add(0,0) ;
		}

		//��֤
		for(int v : al){
			System.out.print(v+"\t") ;
 		}
	}
}
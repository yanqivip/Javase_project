package com.yanqi.project03.demo06_Setcollection.code03_UseHashSet;

import java.util.*;

public class MyTest {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>() ;
		
		while(hs.size()<1000){
			int value = (int)(Math.random()*2000) ;//���������
			hs.add(value) ;
		}
		//ֱ��ʹ��hs������al
		ArrayList<Integer> al = new ArrayList<Integer>(hs) ;
		
		//��֤
		for(int v : al){
			System.out.print(v+"\t") ;
 		}
	}
}
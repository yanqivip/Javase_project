package com.yanqi.project03.demo05_ArrayListLinkedList;

import java.util.*;

public class MyTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList() ;
		LinkedList ll = new LinkedList() ;
		
		long time = System.currentTimeMillis() ;
		for(int i = 0 ; i < 1000000 ; i ++){
			al.add(i) ;
		}
		time = System.currentTimeMillis() - time ;
		System.out.println("ArrayList���1000000��ֵ��ʱ"+time+"����") ;
		
		time = System.currentTimeMillis() ;
		for(int i = 0 ; i < 1000000 ; i ++){
			ll.add(i) ;
		}
		time = System.currentTimeMillis() - time ;
		System.out.println("LinkedList���1000000��ֵ��ʱ"+time+"����") ;
		
		//����1000��ֵ
		time = System.currentTimeMillis() ;
		for(int i = 0 ; i < 1000 ; i ++){
			al.add(1 , i) ;
		}
		time = System.currentTimeMillis() - time ;
		System.out.println("ArrayList����1000��ֵ��ʱ"+time+"����") ;
		
		time = System.currentTimeMillis() ;
		for(int i = 0 ; i < 1000 ; i ++){
			ll.add(1 , i) ;
		}
		time = System.currentTimeMillis() - time ;
		System.out.println("LinkedList����1000��ֵ��ʱ"+time+"����") ;
	}
}
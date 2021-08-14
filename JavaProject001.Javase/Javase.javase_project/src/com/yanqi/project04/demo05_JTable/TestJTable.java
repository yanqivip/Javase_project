package com.yanqi.project04.demo05_JTable;

import java.awt.* ;
import javax.swing.* ;


public class TestJTable extends JFrame {
	TestJTable() {
		this.setSize(400 , 300) ;
	
			MyTableModel tm = new MyTableModel() ;
			//����JTable
			JTable t = new JTable(tm) ;	
			//���ӹ�������ͷ��ʾ������
			JScrollPane sp = new JScrollPane(t) ;	
			this.add(sp) ;
	}
	public static void main(String args[]){
		TestJTable w = new TestJTable() ;
		w.setVisible(true) ;
	}
}
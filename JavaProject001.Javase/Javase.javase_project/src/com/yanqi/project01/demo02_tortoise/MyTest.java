package com.yanqi.project01.demo02_tortoise;

import java.awt.* ;

public class MyTest {
	public static void main(String args[]){
		Frame w = new Frame() ;
		w.setSize(300 , 400) ;
		
		MyPanel mp = new MyPanel() ;
		w.add(mp) ;
		
		w.show() ;		
	}
}

class MyPanel extends Panel {
	@Override
    public void paint(Graphics g){
		g.drawLine(30 , 30 , 100 , 100) ;
	}
}
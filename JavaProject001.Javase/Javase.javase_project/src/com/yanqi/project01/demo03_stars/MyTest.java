package com.yanqi.project01.demo03_stars;

import java.awt.* ;

public class MyTest {
	public static void main(String[] args) {
		Frame w = new Frame() ;
	
		w.setSize(1024 , 768) ;
		w.setBackground(Color.BLACK) ;
		
		MyPanel mp = new MyPanel() ;
		w.add(mp) ;
		
		w.show() ;
	}
}
class MyPanel extends Panel {
	@Override
    public void paint(Graphics g) {
		g.setColor(Color.WHITE) ;
		for (int i = 0; i < 300; i++) {
		g.drawString("*",(int)(Math.random()*1024),	(int)(Math.random()*768)) ;
		}
	}
}
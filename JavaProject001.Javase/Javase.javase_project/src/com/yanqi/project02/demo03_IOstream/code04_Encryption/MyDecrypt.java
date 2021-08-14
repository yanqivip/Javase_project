package com.yanqi.project02.demo03_IOstream.code04_Encryption; /***************************
 * ����
 **************************/
import java.io.*;

public class MyDecrypt {
	public static void main(String args[]){
		try{
			//����Կ�ļ�
			int key[] = new int[128] ;
			File keyFile = new File("c:/work/key.key") ;
			
			FileInputStream keyFis = new FileInputStream(keyFile) ;
			
			for (int i = 0; i < 128; i++) {
				key[i] = keyFis.read() ;
			}

			//����
			File f = new File("c:/work/test1.txt") ;
			
			FileInputStream fis = new FileInputStream(f) ;
			
			int length = fis.available() ;
			for (int i = 0; i < length; i++) {
				System.out.print((char)(fis.read()-key[i%128])) ;
			}
		}catch(Exception e){}
	}
}
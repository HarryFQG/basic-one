package com.it.socket01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Socket12 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("127.0.0.1",8888 );
		OutputStream os = s.getOutputStream();
		System.out.println("22");
		InputStream is=new FileInputStream("E:\\Tomcat\\fileObject\\newFile\\txt.txt");
		int len=0;
		byte[] b=new byte[1024];
		while((len=is.read(b))!=-1){
			os.write(b, 0, len);
		}
		System.out.println("OK");
		InputStream iss = s.getInputStream();
		byte[] bu=new byte[1024];
		int read = iss.read(bu);
		System.out.println(new String(bu,0,read));
		os.close();
		is.close();
		s.close();
		
		
	}
	
	
}

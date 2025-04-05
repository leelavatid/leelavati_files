package org.tnsif.capgemini.c2tc.scanner_bufferreader;


import java.io.BufferedReader;
import java.io.FileReader;
public class BufferReaderExample {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("D:\\TNSIF\\Links.txt"));
		String data="";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();
	}

}
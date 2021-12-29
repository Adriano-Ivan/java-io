package br.com.adriano.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(
			String[] args) throws IOException {
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw=new OutputStreamWriter(fos);
//		BufferedWriter bw  = new BufferedWriter(osw);

//		BufferedWriter bw  = new BufferedWriter(new FileWriter("lorem2.txt"));
//		
//		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
//		bw.newLine();
//		bw.write("sol nascente da v�spera de nozes.");
//		
//		bw.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.write("sol nascente da v�spera de nozes.");
		bw.close();
	}
}

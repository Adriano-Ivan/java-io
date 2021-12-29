package br.com.adriano.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(
			String[] args) throws IOException {
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw=new OutputStreamWriter(fos);
//		BufferedWriter bw  = new BufferedWriter(osw);

//		BufferedWriter bw  = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		
		Long ini = System.currentTimeMillis();
		PrintWriter ps = new PrintWriter("lorem2.txt","ISO-8859-1");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("eita 238 388 rev idjkjjk");
		
		Long fim = System.currentTimeMillis();
		
		System.out
				.println("Tempo de escrita: "+(fim-ini));
		ps.close();
	}
}

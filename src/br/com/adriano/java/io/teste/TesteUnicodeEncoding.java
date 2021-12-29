package br.com.adriano.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(
			String[] args) throws UnsupportedEncodingException {
		String s = "�";
		
		System.out
				.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out
				.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out
				.println(bytes.length+", windows-1252 ");
		
		String sNovo = new String(bytes,"windows-1252");
		System.out
				.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out
				.print(bytes.length+", UTF-16, ");
		sNovo = new String(bytes,"UTF-16");
		System.out
				.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out
				.print(bytes.length+", US_ASCII, ");
		sNovo = new String(bytes,"US-ASCII");
		System.out
				.println(sNovo);
		
		Charset utf8=StandardCharsets.UTF_8;
		String ex = "13� �rg�o Oficial";
		byte[] bytes2 = ex.getBytes(utf8);
		String ex2 = new String(bytes2,utf8);
		System.out
				.println(ex2);
	}
}

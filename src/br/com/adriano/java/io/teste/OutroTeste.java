package br.com.adriano.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutroTeste {

	public static void main(
			String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")));
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out
					.println(linha);
			linha=br.readLine();
		}
		br.close();
	}
}

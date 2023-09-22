package br.com.lucielcastro.compiller.main;

import br.com.lucielcastro.compiller.exceptions.IsiLexicalException;
import br.com.lucielcastro.compiller.lexico.IsiScanner;
import br.com.lucielcastro.compiller.lexico.Token;

public class MainClass {
	public static void main(String[] args) {
	try {
		IsiScanner sc = new IsiScanner("input.isi");
	Token token = null;
	do {
	 token = sc.nextToken();
	 if (token != null) {
		System.out.println(token); 
	 }
	}while (token != null);
	}catch(IsiLexicalException ex) {
		System.out.println("Lexical error"+ex.getMessage());
	}
	catch(Exception ex){
		System.out.println("Generic error");
	}
	}
}


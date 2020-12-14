package br.com.ceostechnology.anonimizacaolgpd;

import java.util.Random;

public class Anonimizacao {
	
	public String anonimizaSegundaPalavraDiante(String input) {
		
		String output = "";
		
		String[] palavras = input.split(" "); 
		
		for(int i = 0; i < palavras.length; i++) {
			
			if(i==0) {
				
				output += palavras[0];
			} else {
				
				for(int j = 0; j < palavras[i].length(); j++){
					
					output += "*";
				}
			}
			
			if (i + 1 < palavras.length) {
				
				output += " ";
			}

		}
		
		return output;
	}
	
	public String anonimizaTudo(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			output += "*";
		}
		
		return output;
	}
	
	public String anonimizaPrimeiro(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if(i==0) {
				
				output += "*";
				
			} else {
				
				output += input.charAt(i);
			}
		}
		
		return output;
	}
	
	public String anonimizaUltimo(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if(i == input.length() - 1) {
				
				output += "*";
				
			} else {
				
				output += input.charAt(i);
			}
		}
		
		return output;
	}
	
	public String anonimizaZebraImpar(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if(!(((i+1)%2)==0)) {
				
				output += "*";
				
			} else {
				
				output += input.charAt(i);
			}
		}
		
		return output;
	}
	
	public String anonimizaZebraPar(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if(((i+1)%2)==0) {
				
				output += "*";
				
			} else {
				
				output += input.charAt(i);
			}
		}
		
		return output;
	}
	
	public String anonimizaAleatorio(String input) {
		
		Random gerador = new Random();
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if((gerador.nextInt()%2)==0) {
				
				output += "*";
				
			} else {
				
				output += input.charAt(i);
			}
		}
		
		return output;
	}
	
	public String anonimizaPrimeiraMetade(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if(i < input.length() / 2) {
				
				output += "*";
				
			} else {
				
				output += input.charAt(i);
			}
		}
		
		return output;
	}
	
	public String anonimizaSegundaMetade(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if(i > input.length() / 2) {
				
				output += "*";
				
			} else {
				
				output += input.charAt(i);
			}
		}
		
		return output;
	}
	
	public String anonimizaTudoRandomLenght(String input) {
		
		String output = "";
		
		for(int i = 0; i < Util.getRandomNumber(5, 20); i++) {
			
			output += "*";
		}
		
		return output;
	}
}
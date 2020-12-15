package br.com.ceostechnology.anonimizacaolgpd;

import java.util.Random;

public class Anonimizacao {
	
	/*
	 * Anonimiza o meio da string mantem duas caracteres
	 * em plain text nas duas extremidades
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
	public String anonimizaMeioDois(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if(i<=1 || i >= input.length() - 2) {
				
				output += input.charAt(i);
				
			} else {
				
				output += "*";
			}
		}
		
		return output;
	}
	
	/*
	 * Mantem a primeira palavra da frase em plain text
	 * e anonimiza da segunda letra em diante da segunda 
	 * palavra em diante
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
	public String anonimizaSegundaLetraSegundaPalavraDiante(String input) {
		
		String output = "";
		
		String[] palavras = input.split(" "); 
		
		for(int i = 0; i < palavras.length; i++) {
			
			if(i==0) {
				
				output += palavras[0];
				
			} else {
					
				output += anonimizaSegundaLetraDiante(palavras[i]);
			}
			
			if (i + 1 < palavras.length) {
				
				output += " ";
			}

		}
		
		return output;
	}
	
	/*
	 * Anonimiza da segunda letra em diantes
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
	public String anonimizaSegundaLetraDiante(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if(i==0) {
				
				output += input.charAt(i);
				
			} else {
				
				output += "*";
			}
		}
		
		return output;
	}
	
	/*
	 * Mantem a primeira palavra da frase em plain text
	 * e anonimiza todas as outras palavras, mantendo os espaços
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
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
	
	/*
	 * Anonimiza todos os caracteres da string
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
	public String anonimizaTudo(String input) {
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			output += "*";
		}
		
		return output;
	}
	
	/*
	 * Anonimiza o primeiro caractere da string
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
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
	
	/*
	 * Anonimiza o ultimo caractere da string
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
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
	
	/*
	 * Anonimiza todos os caracteres de index impar da string
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
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
	
	/*
	 * Anonimiza todos os caracteres de index par da string.
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
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
	
	/*
	 * Anonimiza caracteres aleatórios da string.
	 * CUIDADO: Há a possibilidade de não anonimizar nenhum
	 * caractere
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
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
	
	/*
	 * Anonimiza a metade inicial da string
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
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
	
	/*
	 * Anonimiza a metade final da string
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
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
	
	/*
	 * Gera uma nova string entre 5 e 20 caracteres completamente
	 * animizada
	 * 
	 * @param input texto a ser anonimizado
	 * @return texto anonimizado
	 */
	public String anonimizaTudoRandomLenght(String input) {
		
		String output = "";
		
		for(int i = 0; i < Util.getRandomNumber(5, 20); i++) {
			
			output += "*";
		}
		
		return output;
	}
}
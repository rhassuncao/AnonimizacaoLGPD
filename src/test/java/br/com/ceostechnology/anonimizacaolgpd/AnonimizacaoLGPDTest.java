package br.com.ceostechnology.anonimizacaolgpd;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnonimizacaoLGPDTest {

	private static Anonimizacao anonimizacao;
	
	@BeforeAll
	static void setup() {
		
		anonimizacao = new Anonimizacao();
	}
	
	@DisplayName("Teste anonimizaSegundaPalavraDiante")
	@Test
	@Disabled("Implementação futura")
	void testAnonimizaSegundaPalavraDiante() {
		
		assertEquals(this.anonimizacao.anonimizaSegundaPalavraDiante("Mario da Silva"), "Mario ** *****");
	}
	
	@DisplayName("Teste anonimizaTudo")
	@Test
	void testAnonimizaTudo() {
		
		assertEquals(this.anonimizacao.anonimizaTudo("teste"), "*****");
	}
	
	@DisplayName("Teste anonimizaPrimeiro")
	@Test
	void testAnonimizacaoPrimeiro() {
		
		assertEquals(this.anonimizacao.anonimizaPrimeiro("teste"), "*este");
	}
	
	@DisplayName("Teste anonimizaUltimo")
	@Test
	void testAnonimizacaoUltimo() {
		
		assertEquals(this.anonimizacao.anonimizaUltimo("teste"), "test*");
	}
	
	@DisplayName("Teste anonimizaZebraPar")
	@Test
	void testAnonimizaZebraPar() {
		
		assertEquals(this.anonimizacao.anonimizaZebraPar("teste"), "t*s*e");
	}
	
	@DisplayName("Teste anonimizaZebraImpar")
	@Test
	void testAnonimizaZebraImpar() {
		
		assertEquals(this.anonimizacao.anonimizaZebraImpar("teste"), "*e*t*");
	}
	
	@DisplayName("Teste anonimizaAleatorio")
	@Test
	void testAnonimizaAleatorio() {
		
		String input = "teste";
		String output = this.anonimizacao.anonimizaAleatorio("teste");
		
		boolean valido = true;
		
		if(input.length() == output.length()) {
			
			for(int i = 0; i < input.length(); i++) {
				
				if(!(input.charAt(i) == output.charAt(i))
						&& output.charAt(i) != '*') {
					
					valido = false;
				}
			}
		} else {
			
			valido = false;
		}
		
		assertEquals(valido, true);
	}
	
	@DisplayName("Teste anonimizaPrimeiraMetade")
	@Test
	void testAnonimizaPrimeiraMetade() {
		
		assertEquals(this.anonimizacao.anonimizaPrimeiraMetade(
				"teste"), "**ste");
	}
	
	@DisplayName("Teste anonimizaSegundaMetade")
	@Test
	void testAnonimizaSegundaMetade() {
		
		assertEquals(this.anonimizacao.anonimizaSegundaMetade(
				"teste"), "tes**");
	}
	
	@DisplayName("Teste anonimizaTudoRandomLenght")
	@Test
	void testAnonimizaTudoRandomLenght() {
		
		String resultado = this.anonimizacao.anonimizaTudoRandomLenght("teste");
		boolean temApenasEstrela = true;
		
		for(int i = 0; i < resultado.length(); i++) {
			
			if(resultado.charAt(i) != '*') {
				temApenasEstrela = false;
				break;
			}
		}
		
		assertEquals(temApenasEstrela 
				&& resultado.length() <= 20 
				&& resultado.length() >= 5, true);
	}
	
	
}

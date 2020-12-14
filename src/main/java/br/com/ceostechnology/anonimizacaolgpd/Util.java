package br.com.ceostechnology.anonimizacaolgpd;

final public class Util {
	
	static {

	}

	private Util() {
	};
	
	public static int getRandomNumber(int min, int max) {
		
	    return (int) ((Math.random() * (max - min)) + min);
	}

}

package br.senai.sp.jandira;

public class Tabuada {

	public String multiplicando;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	
	public String [] getTabuada () {
		int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		String tabuada []= new String[tamanho];
		int contador = 0;
		while (contador < tamanho) {
			int produto = multiplicando * minimoMultiplicador;
			//2 x 8 = 16
			String resultado = multiplicando + " x " + minimoMultiplicador + " = " + produto;
			tabuada [contador]= resultado;
			
			contador++;
			minimoMultiplicador++;
		}
		return tabuada;
	}
}

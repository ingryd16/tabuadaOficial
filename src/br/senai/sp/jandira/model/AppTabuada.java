package br.senai.sp.jandira.model;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {
	public static void main(String[] args) {
		FrameTabuada tela = new FrameTabuada ();
		tela.titulo = "TABUADA 1.0";
		tela.altura = 600;
		tela.largura = 700;
		tela.corDoBotao = new Color(120, 196, 255);
		tela.corDoTextoDoBotao = new Color(255, 255, 255);
		tela.fonteDosLabels = new Font("Arial", Font.BOLD, 20);
		tela.letras = new Color(0);
		tela.criarTela();
	}
}

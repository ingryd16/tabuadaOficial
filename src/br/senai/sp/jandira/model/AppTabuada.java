package br.senai.sp.jandira.model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.LineBorder;

import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {
	public static void main(String[] args) {
		FrameTabuada tela = new FrameTabuada ();
		tela.titulo = "TABUADA 1.0";
		tela.corDeFundoDaTela = new Color(255,255,255);
		tela.altura = 600;
		tela.largura = 500;
		tela.corDoBotao = new Color(120, 196, 0);
		tela.corDoTextoDoBotao = new Color(255, 255, 255);
		tela.corDois = new Color(255, 165, 0);
		tela.fonteDoTitulo = new Font("Arial", Font.BOLD, 20);
		tela.fonteDoSubTitulo = new Font("Arial", Font.BOLD, 15);
		tela.corLetras = new Color(0);
		tela.corBasica = new Color (128, 128, 128);
		tela.borda = new LineBorder(Color.BLUE);
		tela.corfundao = new Color(255, 242, 204);
		tela.criarTela();
	}
}

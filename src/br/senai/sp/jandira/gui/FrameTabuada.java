package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.Tabuada;

public class FrameTabuada {
	public Color corDeFundoDaTela;
	public String titulo;
	public int largura, altura;
	public Color corDoBotao;
	public Color corDoTextoDoBotao;
	public Font fonteDosLabels;
	public Color letras;

	// criar janela
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// obter a instancia do painel de controle
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);

		// criar os componentes da tela e colocar no painel (container)
		// x, y, larg, alt

		// simbolo

		// tabuada 1.0
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("TABUADA 1.0");
		labelTitulo.setBounds(100, 10, 130, 50);
		labelTitulo.setForeground(new Color(255, 0, 0));
		labelTitulo.setFont(fonteDosLabels);

		// com a tabuada seus problemas acabaram
		JLabel labelTexto = new JLabel();
		labelTexto.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!");
		labelTexto.setBounds(100, 40, 600, 30);
		labelTexto.setForeground(letras);

		// multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(100, 60, 600, 30);
		labelMultiplicando.setForeground(letras);

		// caixa multiplicando
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(100, 70, 300, 30);

		// minimo multiplicador
		JLabel labelMinMulti = new JLabel();
		labelMinMulti.setText("Mínimo Multiplicador");
		labelMinMulti.setBounds(30, 110, 100, 30);
		labelMinMulti.setForeground(letras);
		labelMinMulti.setFont(fonteDosLabels);

		// caixa minimo multiplicador
		JTextField textFieldMinMulti = new JTextField();
		textFieldMinMulti.setBounds(100, 70, 300, 30);

		// máximo multiplicador
		JLabel labelMaxMulti = new JLabel();
		labelMaxMulti.setText("Máximo Multiplicador");
		labelMaxMulti.setBounds(30, 110, 100, 30);
		labelMaxMulti.setForeground(letras);
		labelMaxMulti.setFont(fonteDosLabels);

		// caixa máximo multiplicador
		JTextField textFieldMaxMulti = new JTextField();
		textFieldMaxMulti.setBounds(100, 70, 300, 30);

		// botao calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(400, 280, 150, 30);
		buttonCalcular.setForeground(corDoTextoDoBotao);
		buttonCalcular.setBackground(corDoBotao);

		// botao limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(400, 280, 150, 30);
		buttonLimpar.setForeground(corDoTextoDoBotao);
		buttonLimpar.setBackground(corDoBotao);

		// resultado
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(30, 400, 300, 30);
		labelResultado.setForeground(letras);

		// caixa resultado
		/*
		 *JList<E> labelCursor = new JLabel();
		 * labelCursor.setText("Seu status IMC é:"); labelCursor.setBounds(30, 430, 300,
		 * 30); labelCursor.setForeground(letras);
		 */

		// eventos
		/*
		 * buttonCalcular.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { Tabuada tabuada = new
		 * Tabuada(); tabuada.multiplicando = textFieldMultiplicando.getText();
		 * tabuada.minimoMultiplicador = (int)
		 * Double.parseDouble(textFieldMínMulti.getText()); tabuada.maximoMultiplicador
		 * = Double.parseDouble(textFieldMaxMulti.getText());
		 * 
		 * labelResultado.setText(tabuada.nome + ", seu Imc é " + tabuada.getImc());
		 * labelStatus.setText("status IMC:  " + tabuada.getStatus());
		 * 
		 * } }); textFieldMultiplicando.addMouseListener(new MouseListener() {
		 * 
		 * @Override public void mouseReleased(MouseEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * }
		 * 
		 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * }
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * }
		 * 
		 * @Override public void mouseClicked(MouseEvent e) {
		 * JOptionPane.showMessageDialog(null, "nao vai digitar nada");
		 * 
		 * } });
		 */

		// add componentes ao painel (container)
		painel.add(labelTitulo);
		
		painel.add(labelTexto);
		
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		
		painel.add(labelMinMulti);
		painel.add(textFieldMinMulti);
		
		painel.add(labelMaxMulti);
		painel.add(textFieldMaxMulti);
		
		painel.add(labelMaxMulti);
		painel.add(textFieldMaxMulti);
		
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		
		painel.add(labelResultado);
		tela.setVisible(true);

	}
}
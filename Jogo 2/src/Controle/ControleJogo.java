package Controle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Modelo.Personagem;

public class ControleJogo extends JFrame {

	public static Icon imagem = new ImageIcon("src/Sprite/Jump__001.png");
	public static Icon cenario = new ImageIcon("src/Sprite/Cenario.png");
	public static JLabel cenariop = new JLabel(cenario);
	public static JLabel personagemPulo = new JLabel(imagem);
	static public JPanel painel;

	Personagem personagem;

	public ControleJogo() {
		super("Uesb Fight");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1200, 800);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setLayout(null);

		painel = new JPanel();
		painel.setLayout(null);
		this.setContentPane(painel);
		this.setContentPane(painel);

		// adicionando personagem na tela

		personagemPulo.setBounds(personagem.x, personagem.y, personagem.largura, personagem.altura);
		painel.add(personagemPulo);

		// adicionando enario na tela

		cenariop.setBounds(0, 0, 1200, 800);
		painel.add(cenariop);

		repaint();

	}

	public static void main(String[] args) {
		new ControleJogo();

	}

}

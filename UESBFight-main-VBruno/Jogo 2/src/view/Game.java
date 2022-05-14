package view;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Personagem;

public class Game extends JPanel{
	
	
	
	public Personagem personagem = new Personagem();
	
	ImageIcon walk = new ImageIcon(getClass().getResource("/img/Idle (1).png"));
	public static JLabel personagem1 = new JLabel();
	public static JLabel personagem2 = new JLabel();
	ImageIcon cenarioIcon = new ImageIcon(getClass().getResource("/img/cenarioSaopaulo.png"));
	public static JLabel cenario = new JLabel();
	
	
	public Game() {
		
		this.setVisible(true);
		this.setSize(1200,720);
		this.setLayout(null);
		
		//personagem1.setIcon(walk);
		//personagem1.setBounds(personagem.x, personagem.y, personagem.largura, personagem.altura);
		//this.add(personagem1);
		
		personagem2.setIcon(walk);
		personagem2.setBounds(1000, personagem.y, personagem.largura, personagem.altura);
		this.add(personagem2);
		
		cenario.setIcon(cenarioIcon);
		cenario.setBounds(0, 0, 1200, 720);
		this.add(cenario);
		
		repaint();
	}

}

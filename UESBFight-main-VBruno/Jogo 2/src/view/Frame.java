package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Personagem;

public class Frame extends JFrame implements Runnable{
	
	int alturaTela = 720;
	int larguraTela = 1200;
	
	ImageIcon walk = new ImageIcon(getClass().getResource("/img/Idle (1).png"));
	JLabel personagem = new JLabel();
	public Game game = new Game();
	
	public Frame() {
		super("Uesb Fight");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(larguraTela, alturaTela);
		this.setLocationRelativeTo(null);
		this.setContentPane(game);
		
		
		personagem.setIcon(walk);
		personagem.setBounds(1000, game.personagem.y, game.personagem.largura, game.personagem.altura);
		this.add(personagem);
		
		run();
		
	}
	
	public void run() {
		while(true) {
			atualiza();
			limpar();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
		
	}

	private void limpar() {
		
		game.cenario.setBounds(0, 0, 1200, 720);
		this.add(game.cenario);
		
	}

	private void atualiza() {
		
		personagem.setBounds(game.personagem.x, game.personagem.y, game.personagem.largura, game.personagem.altura);
		this.add(personagem);
		
		
	}
}

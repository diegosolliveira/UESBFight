package controle;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import interfaces.Atributos;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame implements Runnable,Atributos{
	private static final long serialVersionUID = 1L;
	int i = 0;
	static int alturaTela = 720;
	static int larguraTela = 1200;
	static int alturaPers = 200;
	static int larguraPers = 130;
	static int alturaChao = 650;
	static int gravidade = 5;
	static int velocidade = 0;
	static int posX = 20;
	static int posY =  alturaChao - alturaPers;
	Teste teste;
	static int alturaMax = 1;
	static int forca = 50;
	static int pulo;
	static int tempo = 10;
	Thread jogador1;
	Thread jogador2;
	int deley = 0;
	boolean emMovimento = true;
	static String[] sprites = {
			"img/Walk (1).png",
			"img/Walk (2).png",
			"img/Walk (3).png",
			"img/Walk (4).png",
			"img/Walk (5).png",
		};
	
	static Icon cenSaopaulo = new ImageIcon("img/cenarioSaopaulo.png");
	//static Icon walk = new ImageIcon("img/Walk (10).png");
	//public static Icon walk = new ImageIcon(sprites[0]);
	public static Icon walk = new ImageIcon("img/Walk (10).png");
	static JLabel cenario = new JLabel(cenSaopaulo);
	 public static JLabel personagem = new JLabel(walk);
	 
	 
	public Game() {
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(larguraTela, alturaTela);
		this.setSize(larguraTela, alturaTela);
		this.setLocationRelativeTo(null);
		personagem = new JLabel(walk);
		//jogador1 = new Thread(this);
		//jogador2 = new Thread(this); 
		personagem.setBounds(posX,posY,larguraPers,alturaPers);
		
		this.add(personagem);
		this.add(cenario);
		cenario.setBounds(0,0,1200,720);
		addMovimento();
		run();
		teste = new Teste();
		this.add(teste);
		//pack();
	}
	public static void main(String[] args) {
		new Game();
		
	}
	public void clear() {
		
		this.add(cenario);
		cenario.setBounds(0,0,larguraTela,alturaTela);
	}
	public void atual() {
		
		personagem.setBounds(posX,posY,larguraPers,alturaPers);
		this.add(personagem);
		
		velocidade += gravidade;
		posY += velocidade;
			
		if(posY >= alturaChao - alturaPers) {
			posY = alturaChao - alturaPers;
			velocidade = 0;
			pulo = 0;
		}
	
		if(emMovimento == true) {
			walk = new ImageIcon(sprite(idle));
			personagem.setIcon(walk);
			personagem.setBounds(posX,posY,larguraPers,alturaPers);
		}
		
		repaint();
	}
	public void addMovimento() {
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode()); 
				
				personagem.setIcon(walk);
				
				if(e.getKeyCode() == 87) 
					if(pulo < alturaMax) {
						System.out.println("teste");
						velocidade -= forca;
						pulo++;
						//tempo = 20;
						//if(e.getKeyCode() == 68) {
						//	posX += 14;
						//}
				}
				if(e.getKeyCode() == 68 && posX <= larguraTela - larguraPers) {
					posX += 20;
					walk = new ImageIcon(sprite(walkEsq));
				}
				if(e.getKeyCode() == 65 && posX >= 0) {
					posX -= 20;
					walk = new ImageIcon(sprite(walkEsq));
				}
				personagem.setBounds(posX,posY,larguraPers,alturaPers);
			}
		});
	}
	
	public void run() {
		while(true) {
			atual();
			clear();
			
			try {
				Thread.sleep(tempo);
			} catch (Exception e) {}
		}
	}
	
	public String sprite(String[] sprites){
		
		
		System.out.println("teste"+sprites[i]);
		
		
			i++;
			
		if(sprites.length == i) {
			i=0;
		}
		
		return sprites[i];
            
	}
}
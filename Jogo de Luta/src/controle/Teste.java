package controle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Teste extends JPanel{
	static String[] sprites = {
			"img/Walk (1).png",
			"img/Walk (2).png",
			"img/Walk (3).png",
			"img/Walk (4).png",
			"img/Walk (5).png",
		};
	//public Image sprite = new ImageIcon(getClass().getResource("img/Walk (10).png")).getImage();
	//public Image sp = new ImageIcon(getClass().getResource("/img/Walk (1).png")).getImage();
	public Image sprite;
	//public Icon teste = new ImageIcon("img/Walk (1).png");
	//JLabel tes = new JLabel(teste);
	
	
	public Teste() {
		this.setPreferredSize(new Dimension(1200,720));
		this.setVisible(true);
		//this.setBackground(Color.blue);
		
		
	
	}
	public static void main(String[] args) {
		new Teste();
	}
	public void paint(Graphics g2) {
		
		g2.drawRect(0, 0, 0,500);
		//g2.drawImage(sp,20, 20,this);
		g2.drawImage(new ImageIcon(getClass().getResource("per/Walk (10).png")).getImage(),0, 0,this);
	  
    }
}

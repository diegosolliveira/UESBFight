package Controle;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Personagem;
import view.Frame;

public class ControleJogo implements KeyListener{

	public Frame frame;
	//public ControlePersonagem conPer; 

	public ControleJogo() {

		frame = new Frame();
		
		//conPer = new ControlePersonagem(frame);
		
	}
	
	public static void main(String[] args) {
		new ControleJogo();

	}
	

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == 65 && frame.game.personagem.x >= 0) {
			System.out.println("teste33");
			frame.game.personagem.x += 12;
		}
		
	}
	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

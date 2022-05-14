package Controle;


import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.Frame;


import modelo.Personagem;

public class ControlePersonagem implements KeyListener{
	
	
	
	public ControlePersonagem() {
		
	}
	public ControlePersonagem(Frame frame) {
		frame.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		new ControlePersonagem();
	}
	

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		
		
	}
	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
			
	
}

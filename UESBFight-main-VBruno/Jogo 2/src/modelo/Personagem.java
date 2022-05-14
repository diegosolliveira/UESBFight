package modelo;

public class Personagem {

	public int altura = 334;
	public int largura = 250;
	public int x = 100;
	public int y = 100;
	public int gravidade = 1;
	public int velocidade = 0;

	public Personagem(int altura, int largura, int x, int y) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.x = x;
		this.y = y;
	}

	public Personagem() {
		
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

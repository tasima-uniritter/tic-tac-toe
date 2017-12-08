package main;

public class Quadro {

	private int linhas;
	private int colunas;
	private char [][] quadro;

	public Quadro(int i, int j) {
		linhas = i;
		colunas = j;
		quadro = new char[linhas][colunas];
		for(int x = 0; x < linhas; x++){
			for(int y = 0; y < colunas; y++){
				quadro[x][y] = '-';
					
			}
		}
	}

	public void desenha(int i, int j, char c) {
		quadro[i][j] = c;
	}

	public boolean estaVazio() {
		boolean vazio = true;
		for(int x = 0; x < linhas; x++){
			for(int y = 0; y < colunas; y++){
				if(quadro[x][y] != '-'){
					vazio = false;
				}
			}
		}
		return vazio;
	}
	

}

package main;

public class Quadro {

	private int linhas;
	private int colunas;
	private char[][] quadro;

	public Quadro(int i, int j) {
		linhas = i;
		colunas = j;
		quadro = new char[linhas][colunas];
		for (int x = 0; x < linhas; x++) {
			for (int y = 0; y < colunas; y++) {
				quadro[x][y] = '-';

			}
		}
	}

	public void desenha(int i, int j, char c) {
		quadro[i][j] = c;
	}

	public boolean estaVazio() {
		boolean vazio = true;
		for (int x = 0; x < linhas; x++) {
			for (int y = 0; y < colunas; y++) {
				if (quadro[x][y] != '-') {
					vazio = false;
				}
			}
		}
		return vazio;
	}

	public boolean temGanhador() {
		if (colunaPreenchida() || linhaPreenchida() || diagonalPrincipalPreenchida()) {
			return true;
		}

		return false;
	}

	public boolean colunaPreenchida() {
		int pontoX = 0;
		int pontoO = 0;
		
		for (int coluna = 0; coluna < colunas; coluna++) {
			pontoX = 0;
			pontoO = 0;
			for (int linha = 0; linha < linhas; linha++) {
				if (quadro[linha][coluna] == 'X') {
					pontoX++;
				}
				if (quadro[linha][coluna] == 'O') {
					pontoO++;
				}
			}
			if (pontoX == linhas || pontoO == linhas) {
				return true;
			}
		}
		return false;

	}
	
	public boolean linhaPreenchida() {
		int pontoX = 0;
		int pontoO = 0;
		
		for (int linha = 0; linha < linhas; linha++) {
		
			pontoX = 0;
			pontoO = 0;
			for (int coluna = 0; coluna < colunas; coluna++) {	
				if (quadro[linha][coluna] == 'X') {
					pontoX++;
				}
				if (quadro[linha][coluna] == 'O') {
					pontoO++;
				}
			}
			if (pontoX == linhas || pontoO == linhas) {
				return true;
			}
		}
		return false;

	}
	public boolean diagonalPrincipalPreenchida() {
		int pontoX = 0;
		int pontoO = 0;
		
		for (int linha = 0; linha < linhas; linha++) {				
			for (int coluna = 0; coluna < colunas; coluna++) {
				if(linha == coluna){
					if (quadro[linha][coluna] == 'X') {
						pontoX++;
					}
					if (quadro[linha][coluna] == 'O') {
						pontoO++;
					}
				}
				
			}
			if (pontoX == linhas || pontoO == linhas) {
				return true;
			}
		}
		return false;

	}

}

package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Quadro;

public class TestTicTacToe {

	@Test
	public void testLinhaPreenchida() {
		// dado que o quadro tenha uma linha prenchida e todos elementos sao iguais
		// quando eu verificar se é um vencedor
		// entao mostro o vencedor
		Quadro quadro = new Quadro(3,3);
		quadro.desenha(0,0,'X');
		quadro.desenha(0,1,'X');
		quadro.desenha(0,2,'X');
		
		assertEquals(false,quadro.estaVazio());
		
	}
	
	@Test
	public void testQuadroVazio() {
		// dado que o quadro tenha uma linha prenchida e todos elementos sao iguais
		// quando eu verificar se é um vencedor
		// entao mostro o vencedor
		Quadro quadro = new Quadro(3,3);
	
		
		assertEquals(true,quadro.estaVazio());
		
	}

}

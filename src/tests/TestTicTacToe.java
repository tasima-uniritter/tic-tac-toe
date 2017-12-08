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
		quadro.desenha(1,1,'X');
		quadro.desenha(1,2,'X');
		quadro.desenha(1,3,'X');
		
		assertEquals(true,quadro.existeGanhador());
		
	}

}

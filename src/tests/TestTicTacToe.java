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
	
	@Test
	public void testNaoTemGanhador() {
		// dado que o quadro tenha uma linha prenchida e todos elementos sao iguais
		// quando eu verificar se é um vencedor
		// entao mostro o vencedor
		Quadro quadro = new Quadro(3,3);		
		
		assertEquals(false, quadro.temGanhador());
		
		quadro.desenha(0,0,'X');
		quadro.desenha(0,1,'X');
		quadro.desenha(1,1,'X');

		assertEquals(false ,quadro.temGanhador());
	}
	
	@Test
	public void testTemGanhadorNaColuna() {
		// dado que o quadro tenha uma linha prenchida e todos elementos sao iguais
		// quando eu verificar se é um vencedor
		// entao mostro o vencedor
		Quadro quadro = new Quadro(3,3);
		quadro.desenha(0,0,'X');
		quadro.desenha(1,0,'X');
		quadro.desenha(2,0,'X');
		
		assertEquals(true, quadro.temGanhador());
		
		quadro = new Quadro(3,3);
		quadro.desenha(0,1,'X');
		quadro.desenha(1,1,'X');
		quadro.desenha(2,1,'X');
		assertEquals(true, quadro.temGanhador());
		
	}
	
	@Test
	public void testTemGanhadorNaLinha() {
		// dado que o quadro tenha uma linha prenchida e todos elementos sao iguais
		// quando eu verificar se é um vencedor
		// entao mostro o vencedor
		Quadro quadro = new Quadro(3,3);
		quadro.desenha(0,0,'X'); // x x x
		quadro.desenha(0,1,'X'); // - - -
		quadro.desenha(0,2,'X'); // - - -
		
		assertEquals(true, quadro.temGanhador());
		
		quadro = new Quadro(3,3);
		quadro.desenha(0,1,'X'); //  - x x
		quadro.desenha(0,2,'X'); //  - - -
  		quadro.desenha(2,1,'X'); //  - x -  
		assertEquals(false, quadro.temGanhador());
		
	}
	
	@Test
	public void testDiagonalPrincipal() {
		// dado que o quadro tenha uma linha prenchida e todos elementos sao iguais
		// quando eu verificar se é um vencedor
		// entao mostro o vencedor
		Quadro quadro = new Quadro(3,3);
		quadro.desenha(0,0,'X'); // x - -
		quadro.desenha(1,1,'X'); // - x -
		quadro.desenha(2,2,'X'); // - - X
		
		assertEquals(true, quadro.temGanhador());
		
		
	}


}

package Quest2Teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Quest2.ElementosPares;

/**
 * @author Tarcio Passos Freitas
 *Classe responsável pelos testes da classe ElementosPares.
 */
public class TestElementos {
	
	/**
	 * Método responsável em verificar se o valor passado como parâmetro para a classe está correto.
	 */
	@Test
	public void testValorDoArray() {
		int[] n = {1,5,3,4,2};
		int x = 2;
		ElementosPares elem = new ElementosPares(n, x);
		assertEquals(elem.getVect(), n);
		assertEquals(elem.getX(), x);
	}
	
	/**
	 * Método responsável em testar se o valor retornado, que simboliza a quantidade de elementos cujo a subtração de 2 números seja igual ao
	 * número a ser comparado.
	 */
	@Test
	public void testPares() {
		int[] n1 = {1,5,3,4,2};
		int x1 = 2;
		ElementosPares elem1 = new ElementosPares(n1, x1);
		assertEquals(elem1.pares(), 3);
		
		int[] n2 = {10,40,20,50};
		int x2 = 10;
		ElementosPares elem2 = new ElementosPares(n2, x2);
		assertEquals(elem2.pares(), 2);
	}
}

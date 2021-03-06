package Quest1Teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Quest1.CalcularMediana;

/**
 * @author Tarcio Passos Freitas
 *Classe respons?vel pelos testes da classe CalcularMediana.
 */
public class TestMediana {
	
	/**
	 * M?todo respons?vel em verificar se o valor passado como par?metro para a classe est? correto.
	 */
	@Test
	public void testValorDoArray() {
		double[] arr1 = {9,2,1,4,6};
		CalcularMediana cal1 = new CalcularMediana(arr1);
		assertEquals(arr1, cal1.getArray());
		
		double[] arr2 = {10,12,13,14,14,15,15,18,19,20};
		CalcularMediana cal2 = new CalcularMediana(arr2);
		assertEquals(arr2, cal2.getArray());
	}
	
	/**
	 * Classe respons?vel em verificar se o valor retornado corresponde ao valor correto quando temos que calcular uma mediana par.
	 */
	@Test
	public void testMedianaPar() {
		double[] arr1 = {10,12,13,14,14,15,15,18,19,20};
		CalcularMediana cal1 = new CalcularMediana(arr1);
		assertEquals(cal1.calcularMediana(), 14.5);
		
		double[] arr2 = {30,25,50,75,90,80};
		CalcularMediana cal2 = new CalcularMediana(arr2);
		assertEquals(cal2.calcularMediana(), 62.5);
	}
	
	/**
	 * Classe respons?vel em verificar se o valor retornado corresponde ao valor correto quando temos que calcular uma mediana Impar.
	 */
	@Test
	public void testMedianaImpar() {
		double[] arr1 = {9,2,1,4,6};
		CalcularMediana cal1 = new CalcularMediana(arr1);
		assertEquals(cal1.calcularMediana(), 4);
		
		double[] arr2 = {55, 60, 90, 120, 200, 300, 500, 1000, 1200};
		CalcularMediana cal2 = new CalcularMediana(arr2);
		assertEquals(cal2.calcularMediana(), 200);
	}
}

package Quest1;

import java.util.Arrays;

/**
 * @author Tarcio Passos Freitas
 * Classe respons?vel por receber array com n?meros e deve encontrar a mediana
 *
 */
public class CalcularMediana {
	private double[] array;

	/**
	 * @param arrayNumeros array com valores vem como refer?ncia.
	 * O array j? recebe o vetor ordenado para no m?todo achar a mediana.
	 */
	public CalcularMediana(double[] arrayNumeros) {
		Arrays.sort(arrayNumeros); // ordenando o array
		array = arrayNumeros;
	}

	/**
	 * @return retorna o array
	 */
	public double[] getArray() {
		return array;
	}

	/**
	 * @param array fazer altera??o no array
	 */
	public void setArray(double[] array) {
		this.array = array;
	}
	
	
	/**
	 * @return retorna o valor da mediana.
	 * M?todo respons?vel por calcular a mediana do array.
	 */
	public double calcularMediana() {
		double mediana = 0;

		if ((array.length % 2) == 0) {
			mediana = (array[(array.length / 2) - 1] + array[array.length / 2]) / 2;
			return mediana;
		} else {
			mediana = array[(array.length / 2)];
			return mediana;
		}
	}
}

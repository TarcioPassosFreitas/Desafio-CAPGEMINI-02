package Quest2;

import java.util.Arrays;

/**
 * @author Tarcio Passos Freitas
 * Essa classe ? respons?vel por receber um vetor de n?meros e um n?mero para compara??o.
 * cada n?mero do vetor, subtraido com outro n?mero do vetor tem que ter o mesmo valor do n?mero de compara??o x.
 */
public class ElementosPares {
	private int[] vect;
	private int x;
	
	/**
	 * @param vect array de n?meros desejados.
	 * @param x n?mero para compara??o.
	 */
	public ElementosPares(int[] vect, int x) {
		this.vect = vect;
		this.x = x;
	}

	/**
	 * @return vetor com os n?meros.
	 */
	public int[] getVect() {
		return vect;
	}

	/**
	 * @param vect altera??o no vetor.
	 */
	public void setVect(int[] vect) {
		this.vect = vect;
	}

	/**
	 * @return n?mero para compara??o.
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x altera??o do n?mero para compara??o.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @return contador com o n?mero de pares cujo a diferen?a ? igual ao n?mero de compara??o.
	 * M?todo respons?vel por verificar se a diferen?a dos valores do array ? igual ao valor de compra??o.
	 */
	public int pares() {
		int cont = 0;
		Arrays.sort(vect);
		for(int i = 0; i < vect.length; i++) {
			for(int j = 0; j < vect.length; j++) {
				if(vect[i] - vect[j] == x) {
					cont++;
					
				}
			}
		}
		
		return cont;
	}
	
	
}

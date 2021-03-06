package Quest3;

/**
 * @author Tarcio Passos Freitas
 *Essa classe ? respons?vel por receber uma mensagem e fazer a criptografia dessa mensagem.
 */
public class Criptografia {
	private String mensagem;
	
	/**
	 * @param mensagem Recebe uma mensagem que deseja ser criptografada.
	 */
	public Criptografia(String mensagem) {
		this.mensagem = mensagem;
	}

	/**
	 * @return Pega o valor da mensagem.
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * @param mensagem pode fazer altera??o do valor da mensagem.
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	/**
	 * @return ser? retornado a mensagem j? encriptada.
	 * M?todo respons?vel por encriptar.
	 * Vai retirar os espa?os da mensagem.
	 * Criar uma matriz levando em considera??o uma aproxima??o para cima da ra?z quadrada do tamanho da String sem espa?os.
	 * Pegar os valores de cada coluna e colocar na string que vai conter a mensagem j? encriptada.
	 */
	public String encriptando() {
		String mensagemUnida = mensagem.replaceAll("\\s+", ""); // retirando espa?os da mensagem
		int tamanho = mensagemUnida.length();
		int linhaxColuna = (int) Math.round(Math.sqrt(tamanho)); // espa?o do vetor, levando em conta uma aproxima??o para cima
		char[][] mensagemEncriptada = new char[linhaxColuna][linhaxColuna]; //matriz para pegar cada letra e colocar na posi??o pedida
		int aux = 0; //simboliza o ?ndice que vamos pegar da String
		for(int i = 0; i < linhaxColuna; i++) {
			for(int j = 0; j < linhaxColuna; j++) {
				if(aux >= tamanho) { //verifica se o valor da posi??o da string est? dentro do intervalo, para n?o dar erro
					break;
				}
				mensagemEncriptada[i][j] = mensagemUnida.charAt(aux);
				aux++;
			}
		}
		
		String fraseEncriptada = ""; 
		for(int i = 0; i < linhaxColuna; i++) {
			for(int j = 0; j < linhaxColuna; j++) {
				if((j + 1) == linhaxColuna && (i + 1) == linhaxColuna) {
					break;
				}else if(mensagemEncriptada[j][i] == '\u0000') {
					fraseEncriptada += " ";
				}
				else {
					fraseEncriptada += mensagemEncriptada[j][i]; //pegar a frase encriptada
				}
				if((j + 1) == linhaxColuna) { // Verifica se ? o ?ltimo loop desse for
					if(mensagemEncriptada[j][i] != '\u0000') { //verifica se a posi??o do char est? vazio ou se tem algo, para dar o espa?amento certo
						fraseEncriptada += " ";
					}
				}
			}
		}
		
		
		
		return fraseEncriptada;
	}
}

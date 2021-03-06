package Quest3Teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Quest3.Criptografia;

/**
 * @author Tarcio Passos Freitas
 *Classe respons?vel pelos testes da classe Criptografia.
 */
public class TestCriptografia {
	
	/**
	 *  M?todo respons?vel em verificar se o valor passado como par?metro para a classe est? correto.
	 */
	@Test
	public void testValorDaMensagem() {
		String s = "tenha um bom dia";
		Criptografia cript = new Criptografia(s);
		assertEquals(cript.getMensagem(), s);
	}
	
	/**
	 * M?todo respons?vel em verificar se a frase criptografada que ? retornada, realmente est? criptografada de forma correta.
	 */
	@Test
	public void testMensagemCriptografada() {
		String s1 = "tenha um bom dia";
		Criptografia cript1 = new Criptografia(s1);
		assertEquals(cript1.encriptando(), "taoa eum nmd hbi");
		
		String s2 = "ola mundo";
		Criptografia cript2 = new Criptografia(s2);
		assertEquals(cript2.encriptando(), "omd luo an");
	}
}

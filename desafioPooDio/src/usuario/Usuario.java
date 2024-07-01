package usuario;

import iphone.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Exemplo Musica");
		iphone.exibirPagina("Exemplo URL");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.ligar("Exemplo numero");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		
	}
}

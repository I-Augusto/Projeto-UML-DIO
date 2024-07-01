package iphone;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.navegadorNaInternet.NavegadorNaInternet;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{
	public void tocar() {
		System.out.println("MÚSICA TOCANDO");
	}	
	public void pausar() {
		System.out.println("MÚSICA PAUSADA");
	}
	public void selecionarMusica(String musica) {
		System.out.println("MÚSICA SELECIONADA");
	}
	public void exibirPagina(String url) {
		System.out.println("PÁGINA EXIBIDA");
	}
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA");
	}
	public void atualizarPagina() {
		System.out.println("PÁGINA ATUALIZADA");
	}
	public void ligar(String numero) {
		System.out.println("IPHONE LIGANDO...");
	}
	public void atender() {
		System.out.println("IPHONE ATENDIDO");
	}
	public void iniciarCorreioVoz() {
		System.out.println("CORREIO DE VOZ INICIADO");
	}
	
}

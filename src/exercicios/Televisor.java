package exercicios;

public class Televisor {
	private int volume=0;
	private String canal_atual = "History";
	private String[] canais = {"History","Discovery","Home&Health"};
	
	public void mudar_canal(int numero) {
		if (numero < canais.length) {
			this.canal_atual = this.canais[numero];
		}
	}
	
	public void alterar_volume(int quantidade) {
		this.volume += quantidade;
		if (this.volume > 100) {
			this.volume = 100;
		}
		if (this.volume < 0) {
			this.volume = 0;
		}
	}
	
	public String imagem_televisor() {
		StringBuilder imagem = new StringBuilder();
		imagem.append(" _______________\r\n");
		imagem.append("|,----------.  |\\\r\n");
		imagem.append("||           |=| |\r\n");
		imagem.append("||          || | |\r\n");
		imagem.append("||       . _o| | | __\r\n");
		imagem.append("|`-----------' |/ /~/\r\n");
		imagem.append(" ~~~~~~~~~~~~~~~ / /\r\n");
		imagem.append("                 ~~");
		return imagem.toString();
	}
	
	public int getVolume() {
		return volume;
	}
	public String getCanal_atual() {
		return canal_atual;
	}

}

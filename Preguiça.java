package Exercicío2;

public class Preguiça extends Animal{
	private String Escalar,emitirSom;

	public String getEscalar() {
		return Escalar;
	}

	public void setEscalar(String escalar) {
		Escalar = escalar;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	public String getNome()
	{
		return "Preguiça: "+super.getNome()+" - Escalar"+this.getEscalar()+"Emitir som: "+this.getEmitirSom();
	}

}

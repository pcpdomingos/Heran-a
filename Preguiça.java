package Exercic�o2;

public class Pregui�a extends Animal{
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
		return "Pregui�a: "+super.getNome()+" - Escalar"+this.getEscalar()+"Emitir som: "+this.getEmitirSom();
	}

}

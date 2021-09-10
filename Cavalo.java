package Exercicío2;

public class Cavalo extends Animal{
	private String Correr,emitirSom;
	
	public String getCorrer() {
		return Correr;
	}



	public void setCorrer(String correr) {
		Correr = correr;
	}



	public String getEmitirSom() {
		return emitirSom;
	}



	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}



	public String getNome()
	{
		return "Cavalo: "+super.getNome()+" - Correr"+this.getCorrer()+"Emitir som: "+this.getEmitirSom();
	}

}

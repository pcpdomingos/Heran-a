package Exercicío2;

public class ExibirAnimais {

	public static void main(String[] args) {
		
		Cavalo cavalo = new Cavalo();
		cavalo.setEmitirSom("himmm himmm");
		Preguiça preguiça = new Preguiça();
		preguiça.setEmitirSom("An-An");
		Cachorro cachorro = new Cachorro();
		cachorro.setEmitirSom("Holf-Holf");
		
		System.out.println("\nCavalo: "+cavalo.getEmitirSom());
		System.out.println("\nPreguiça: "+preguiça.getEmitirSom());
		System.out.println("\nCachorro: "+cachorro.getEmitirSom());

	}

}

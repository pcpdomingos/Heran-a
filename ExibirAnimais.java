package Exercic�o2;

public class ExibirAnimais {

	public static void main(String[] args) {
		
		Cavalo cavalo = new Cavalo();
		cavalo.setEmitirSom("himmm himmm");
		Pregui�a pregui�a = new Pregui�a();
		pregui�a.setEmitirSom("An-An");
		Cachorro cachorro = new Cachorro();
		cachorro.setEmitirSom("Holf-Holf");
		
		System.out.println("\nCavalo: "+cavalo.getEmitirSom());
		System.out.println("\nPregui�a: "+pregui�a.getEmitirSom());
		System.out.println("\nCachorro: "+cachorro.getEmitirSom());

	}

}

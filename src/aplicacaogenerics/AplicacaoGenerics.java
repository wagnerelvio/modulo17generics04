package aplicacaogenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wagne
 *
 */
public class AplicacaoGenerics {

	public static void main(String args[]) {

		System.out.println(" ********* Lista de Carros *********\n ");

		// =========================================
		List<Carro> carro02 = new ArrayList<>();

		carro02.add(new Audi());
		carro02.add(new Civic());
		carro02.add(new Honda());
		carro02.add(new Fusca());
		imprimirCarros2(carro02);
		// ---------

	}

	public static void imprimirCarros2(List<? extends Carro> lista) {
		for (Carro carro02 : lista) {
			System.out.println(carro02);
		}

		// --------------------------------------------------------------------------------
		System.out.println(" \n  ****** Modelo, preço, cor e ano do carro Audi ******* \n ");
		Audi audi = new Audi();
		audi.setModelo("e-Tron");
		audi.setPreco(130000.00);
		audi.setCor("Amarela");
		audi.setAno(2023);
		imprimir(audi);

		System.out.println(" \n ****** Modelo, preço, cor e ano do carro  Civic ******* \n ");
		Civic civic = new Civic();
		civic.setModelo("Honda City");
		civic.setPreco(110000.00);
		civic.setCor("Azul");
		civic.setAno(2023);
		imprimir(civic);

		System.out.println(" \n ****** Modelo, preço, cor e ano do carro Honda ******* \n ");
		Honda honda = new Honda();
		honda.setModelo("Sport");
		honda.setPreco(125000.00);
		honda.setCor("Cinza");
		honda.setAno(2023);
		imprimir(honda);

		System.out.println(" \n ****** Modelo, preço, cor e ano do carro Fusca ******* \n ");
		Fusca fusca = new Fusca();
		fusca.setModelo("Volkswagen Fusca");
		fusca.setPreco(135000.00);
		fusca.setCor("Branca");
		fusca.setAno(2022);
		imprimir(fusca);

	}

	/**
	 * @param honda
	 */

	private static void imprimir(Honda honda) {
		// TODO Auto-generated method stub
		System.out.println("Carro Honda modelo  " + honda.getModelo());
		System.out.println("Carro Honda preço R$ " + honda.getPreco());
		System.out.println("Carro Honda na cor  " + honda.getCor());
		System.out.println("Carro Honda do ano de " + honda.getAno());

	}

	/**
	 * @param audi
	 */
	private static void imprimir(Audi audi) {
		// TODO Auto-generated method stub
		System.out.println("Carro  modelo  " + audi.getModelo());
		System.out.println("Carro com o preço de R$  " + audi.getPreco());
		System.out.println("Carro na cor  " + audi.getCor());
		System.out.println("Carro do ano  de " + audi.getAno());

	}

	/**
	 * @param civic
	 */

	private static void imprimir(Civic civic) {
		// TODO Auto-generated method stub
		System.out.println("Carro  modelo  " + civic.getModelo());
		System.out.println("Carro com o preço de R$  " + civic.getPreco());
		System.out.println("Carro na cor  " + civic.getCor());
		System.out.println("Carro do  ano de " + civic.getAno());

	}

	/**
	 * @param fusca
	 */

	private static void imprimir(Fusca fusca) {
		// TODO Auto-generated method stub
		System.out.println("Carro  modelo  " + fusca.getModelo());
		System.out.println("Carro com o preço de R$  " + fusca.getPreco());
		System.out.println("Carro na cor  " + fusca.getCor());
		System.out.println("Carro do  ano de " + fusca.getAno());

	}

}
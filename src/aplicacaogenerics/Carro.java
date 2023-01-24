/**
 * 
 */
package aplicacaogenerics;

/**
 * @author wagne
 *
 */
public abstract class Carro {

	private String modelo;
	private String cor;
	private int ano;
	private double preco;

	//
	public abstract String modelo();

	public void imprimirModelo() {
		System.out.println("O modelo é o " + this.modelo);
	}

	//
	public abstract double preco();

	public void imprimirPreco() {
		System.out.println("O preço é  " + this.preco);
	}

	
	public abstract int ano();

	public void imprimirAno() {
		System.out.println("O ano é  " + this.ano);
	}
	
	
	
	
	
	//
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	//

}
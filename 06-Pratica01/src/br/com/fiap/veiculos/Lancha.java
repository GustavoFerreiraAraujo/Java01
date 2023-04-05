package br.com.fiap.veiculos;

public class Lancha {

	String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadedeLugares() {
		return quantidadedeLugares;
	}

	public void setQuantidadedeLugares(int quantidadedeLugares) {
		this.quantidadedeLugares = quantidadedeLugares;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getQuantidadedeMotores() {
		return quantidadedeMotores;
	}

	public void setQuantidadedeMotores(int quantidadedeMotores) {
		this.quantidadedeMotores = quantidadedeMotores;
	}

	int quantidadedeLugares, anoFabricacao, quantidadedeMotores;

}

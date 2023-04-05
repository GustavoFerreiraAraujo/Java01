package br.com.fiap.veiculos;

public class Aviao {
	String modelo, prefixo;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
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
	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}
	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}
	public double getComprimeto() {
		return comprimeto;
	}
	public void setComprimeto(double comprimeto) {
		this.comprimeto = comprimeto;
	}
	
	int quantidadedeLugares,anoFabricacao, quantidadeTurbinas;
	double comprimeto ;

}

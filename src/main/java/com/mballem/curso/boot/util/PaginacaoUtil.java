package com.mballem.curso.boot.util;

import java.util.List;

public class PaginacaoUtil<T> {
	
	private Integer tamanho;
	
	private Integer pagina;
	
	private Long totalPaginas;
	
	private String direcao;
	
	private List<T> registros;
	
	
	public PaginacaoUtil(Integer tamanho, Integer pagina, Long totalPaginas, String direcao, List<T> registros) {
		super();
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalPaginas = totalPaginas;
		this.registros = registros;
		this.direcao = direcao;
	}
	

	public String getDirecao() {
		return direcao;
	}


	public Integer getTamanho() {
		return tamanho;
	}

	public Integer getPagina() {
		return pagina;
	}
	
	public Long getTotalPaginas() {
		return totalPaginas;
	}
	
	public List<T> getRegistros() {
		return registros;		       
	}

}

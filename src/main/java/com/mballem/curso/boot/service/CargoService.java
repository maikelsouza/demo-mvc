package com.mballem.curso.boot.service;

import java.util.List;

import com.mballem.curso.boot.domain.Cargo;
import com.mballem.curso.boot.util.PaginacaoUtil;

public interface CargoService {
	
	public void salvar(Cargo cargo);
	
	public void editar(Cargo cargo);
	
	public void excluir(Long id);
	
	public Cargo buscarPorId(Long id);
	
	public List<Cargo> buscarTodos();
	
	public PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);
	
	public boolean cargoTemFuncionarios(Long id);

}

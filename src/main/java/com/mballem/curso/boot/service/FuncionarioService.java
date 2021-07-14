package com.mballem.curso.boot.service;

import java.time.LocalDate;
import java.util.List;

import com.mballem.curso.boot.domain.Funcionario;

public interface FuncionarioService {
	
	
	public void salvar(Funcionario funcionario);
	
	public void editar(Funcionario funcionario);
	
	public void excluir(Long id);
	
	public Funcionario buscarPorId(Long id);
	
	public List<Funcionario> buscarTodos();
	
	public List<Funcionario> buscarPorNome(String nome);

	public List<Funcionario> buscarPorCargo(Long id);

	public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida);

}

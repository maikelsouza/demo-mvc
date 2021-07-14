package com.mballem.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

	@Override
	public List<Funcionario> findByNome(String nome) {
		return createQuery("select f from Funcionario f where f.nome like concat('%', ?1, '%')", nome);
	}
	
	@Override
	public List<Funcionario> findByCargoId(Long id) {
		return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
	}

	@Override
	public List<Funcionario> findByDataEntradaEDataSaida(LocalDate entrada, LocalDate saida) {
		return createQuery(
				"select f from Funcionario f where dataEntrada >= ?1 and dataSaida <= ?2 order by f.dataEntrada",
				entrada, saida);
	}

	@Override
	public List<Funcionario> findByDataEntrada(LocalDate entrada) {
		return createQuery(
				"select f from Funcionario f where dataEntrada = ?1 order by f.dataEntrada",
				entrada);
	}

	@Override
	public List<Funcionario> findByDataSaida(LocalDate saida) {
		return createQuery(
				"select f from Funcionario f where dataSaida = ?1 order by f.dataEntrada",
				saida);
	}

	
}

package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Cargo;
import com.mballem.curso.boot.util.PaginacaoUtil;


public interface CargoDao {
	
	public void save(Cargo cargo);
	
	public void update(Cargo cargo);
	
	public void delete(Long id);
	
	public Cargo findById(Long id); 
	
	public List<Cargo> findAll();
	
	public PaginacaoUtil<Cargo> buscaPaginada(int pagina,  String direcao);
	
	public long count();

}

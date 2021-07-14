package com.mballem.curso.boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.Cargo;
import com.mballem.curso.boot.util.PaginacaoUtil;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{
	
	public PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao){
		
		int tamanho = 3;
		int inicio =  (pagina - 1) * tamanho; // 0*5=0, 1*5=5, 2*5=10  -- Exemplo de cálculo  
		
		List<Cargo> cargos = getEntityManager().createQuery("select c from Cargo c order by c.nome " + direcao, Cargo.class)
					.setFirstResult(inicio)
					.setMaxResults(tamanho)
					.getResultList();
		
		long totalRegistros = count();
		long totalPaginas = (totalRegistros + (tamanho - 1)) / tamanho; 
		return new PaginacaoUtil<Cargo>(tamanho, pagina, totalPaginas, direcao, cargos);
	}
	
	public long count() {
		return getEntityManager()
				.createQuery("select count(*) from Cargo", Long.class)
				.getSingleResult();
	}


}

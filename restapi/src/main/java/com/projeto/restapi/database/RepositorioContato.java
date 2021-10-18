package com.projeto.restapi.database;

import com.projeto.restapi.entidade.Contato;

import org.springframework.data.jpa.repository.JpaRepository;



public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}

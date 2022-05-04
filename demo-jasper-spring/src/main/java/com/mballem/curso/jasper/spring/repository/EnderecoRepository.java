package com.mballem.curso.jasper.spring.repository;

import com.mballem.curso.jasper.spring.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    @Query("select distinct e.uf from Endereco e order by e.uf asc")
    List<String> findUfs();
}

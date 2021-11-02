package br.com.treswx.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treswx.os.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}

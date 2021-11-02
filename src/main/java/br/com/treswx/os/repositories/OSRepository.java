package br.com.treswx.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treswx.os.domain.OS;

public interface OSRepository extends JpaRepository<OS, Integer>{

}

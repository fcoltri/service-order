package br.com.treswx.os.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "cliente")
	List<OS> list = new ArrayList<>();

	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	public List<OS> getList() {
		return list;
	}

	public void setList(List<OS> list) {
		this.list = list;
	}
	
	
	

}

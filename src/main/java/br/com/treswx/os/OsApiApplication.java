package br.com.treswx.os;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.treswx.os.domain.Cliente;
import br.com.treswx.os.domain.OS;
import br.com.treswx.os.domain.Tecnico;
import br.com.treswx.os.domain.enuns.Prioridade;
import br.com.treswx.os.domain.enuns.Status;
import br.com.treswx.os.repositories.ClienteRepository;
import br.com.treswx.os.repositories.OSRepository;
import br.com.treswx.os.repositories.TecnicoRepository;

@SpringBootApplication
public class OsApiApplication implements CommandLineRunner {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	TecnicoRepository tecnicoRepository;
	
	@Autowired
	OSRepository osRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(OsApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Tecnico t1 = new Tecnico(null, "Fernando Coltri", "421.554.810-12", "11 98754-1276");	
		Cliente c1 = new Cliente(null, "Julio Cesar", "400.262.920-17", "87 95432-1234");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste Create OS", Status.ANDAMENTO, t1, c1);
		
		t1.getList().add(os1);
		c1.getList().add(os1);
		
		clienteRepository.saveAll(Arrays.asList(c1));
		tecnicoRepository.saveAll(Arrays.asList(t1));
		osRepository.saveAll(Arrays.asList(os1));
		
	}

}

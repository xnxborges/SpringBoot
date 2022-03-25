package packageSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import packageSpringBoot.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}

	@GetMapping("/{id}")
	public Cliente obterClienteporId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	
	@GetMapping
	public Cliente obterClienteporId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Augusto", "111.222.333.44");
	}
}

package br.edu.senaisp.spring.Escola.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.spring.Escola.model.Aluno;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
	
	@GetMapping
	public String buscarTodos() {
		return "Olá";
	}
	
	@GetMapping("/{id}")
	public Aluno buscarId(@PathVariable Long id) {
		Aluno a = new Aluno();
		a.setId(id);
		a.setNome("Pedro");
		a.setCpf("497.108.977-04");
		return a;
	}
	
	@PostMapping
	public Aluno insereAluno(@RequestBody Aluno a) {
		return a;
	}
	
	@PutMapping
	public void alteraAluno(String nome) {
		System.out.println("Altera: " + nome);
	}
	
	@DeleteMapping
	public void deleteAluno(String nome) {
		System.out.println("Delete: " + nome);
	}
	
}

package br.edu.senaisp.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.senaisp.colegio.model.Turma;
import br.edu.senaisp.colegio.repository.TurmaRepository;

@Service
public class TurmaService {
	
	@Autowired
	TurmaRepository repo;
	
	public List<Turma> bucarTodos() {
		return repo.findAll();
	}
	
	public Turma buscarPorId(Long id) {
	    Optional<Turma> op = repo.findById(id);
	    return op.orElse(null);
	}
	
	public Turma gravarTurma(Turma t) {
		return repo.save(t);
		
	}

	public Turma excluirPorId(Long id) {
		try {
			Turma t = buscarPorId(id);
			if (t != null) {
				repo.deleteById(id);
				return t;
			}			
			
		}catch (Exception e) {
			throw new RuntimeException("Error: " + e.getMessage());
		}
		return null;
	}

	public Turma alterarPorId(Long id, Turma turma) {
		//Optional<Turma> op = repo.findById(id);
		//Turma tmp = op.orElse(null);
		
		//tmp.setNome(turma.getNome());
		
		return repo.save(turma);
	}
	
}

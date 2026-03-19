
package com.example.service;

import com.example.entity.Projeto;
import com.example.repository.ProjetoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public Projeto save(Projeto obj) {
        return repository.save(obj);
    }

    public List<Projeto> findAll() {
        return repository.findAll();
    }

    public Optional<Projeto> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

package com.example.demo.service;

import com.example.demo.model.Trabalho;
import com.example.demo.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    public Trabalho createTask(Trabalho trabalho) {
        return trabalhoRepository.save(trabalho);
    }

    public List<Trabalho> getAllTasks() {
        return trabalhoRepository.findAll();
    }

    public Optional<Trabalho> getTrabalhoById(Long id) {
        return trabalhoRepository.findById(id);
    }

        public Trabalho updateTrabalho(Long id, Trabalho trabalhoDetails) {
        Trabalho trabalho = trabalhoRepository.findById(id).orElseThrow();
        return trabalhoRepository.save(trabalho);
    }

    public void deleteTrabalho(Long id) {
        trabalhoRepository.deleteById(id);
    }
    
    public Trabalho moveTask(Long id) {
        Trabalho trabalho = trabalhoRepository.findById(id).orElseThrow();
        return trabalhoRepository.save(trabalho);
    }

    public void setTrabalhoRepository(TrabalhoRepository trabalhoRepository) {
        this.trabalhoRepository = trabalhoRepository;
    }
}

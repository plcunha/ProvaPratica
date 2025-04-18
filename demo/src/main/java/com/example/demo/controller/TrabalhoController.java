package com.example.demo.controller;

import com.example.demo.model.Trabalho;
import com.example.demo.service.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {

    @Autowired
    private final TrabalhoService trabalhoService;

    public TrabalhoController(TrabalhoService trabalhoService) {
        this.trabalhoService = trabalhoService;
    }

    @PostMapping
    public Trabalho createTask(@RequestBody Trabalho trabalho) {
        return trabalhoService.createTask(trabalho);
    }

    @GetMapping
    public List<Trabalho> getAllTasks() {
        return trabalhoService.getAllTasks();
    }

    @PutMapping("/{id}/move")
    public Trabalho moveTask(@PathVariable Long id) {
        return trabalhoService.moveTask(id);
    }

    @PutMapping("/{id}")
    public Trabalho updateTask(@PathVariable Long id, @RequestBody Trabalho trabalhoDetails) {
        return trabalhoService.updateTrabalho(id, trabalhoDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        trabalhoService.deleteTrabalho(id);
    }
}

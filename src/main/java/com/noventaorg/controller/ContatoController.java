package com.noventaorg.controller;

import com.noventaorg.dto.ContatoDTO;
import com.noventaorg.service.ContatoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contato")
@CrossOrigin(origins = "*", allowedHeaders = "*") // Permite acesso de qualquer origem para desenvolvimento
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @PostMapping
    public ResponseEntity<Contato> criarContato(@RequestBody @Valid ContatoDTO contatoDTO) {
        Contato contatoSalvo = contatoService.salvar(contatoDTO);
        return new ResponseEntity<>(contatoSalvo, HttpStatus.CREATED);
    }

}

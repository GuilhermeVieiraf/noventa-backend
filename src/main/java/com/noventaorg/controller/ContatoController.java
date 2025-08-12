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
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContatoController {
    @Autowired
    private ContatoService contatoService;
    @PostMapping
    public ResponseEntity<String> receberContato(@RequestBody @Valid ContatoDTO contatoDTO) {
        try {
            contatoService.processarContato(contatoDTO);
            return ResponseEntity.ok("Mensagem enviada com sucesso!");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao enviar o email. Por favor, tente novamente mais tarde.");
        }
    }
}
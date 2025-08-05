package com.noventaorg.service;

import com.noventaorg.dto.ContatoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private EmailService emailService;

    public void processarContato(ContatoDTO contatoDTO) {
        emailService.enviarEmailContato(contatoDTO);
    }
}
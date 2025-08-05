package com.noventaorg.service;

import com.noventaorg.dto.ContatoDTO;
import com.noventaorg.model.Contato;
import com.noventaorg.repository.ContatoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    @Transactional
    public Contato salvar(ContatoDTO contatoDTO) {
        Contato contatoEntity = new Contato();
        contatoEntity.setNome(contatoDTO.getNome());
        contatoEntity.setEmail(contatoDTO.getEmail());
        contatoEntity.setAssunto(contatoDTO.getAssunto());
        contatoEntity.setMensagem(contatoDTO.getMensagem());

        return contatoRepository.save(contatoEntity);
    }
}

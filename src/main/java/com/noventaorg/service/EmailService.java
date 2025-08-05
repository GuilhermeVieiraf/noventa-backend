package com.noventaorg.service;

import com.noventaorg.dto.ContatoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${mail.destino.contato}")
    private String emailDestino;

    @Value("${spring.mail.username}")
    private String emailRemetente;

    public void enviarEmailContato(ContatoDTO contatoDTO) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailRemetente);
        message.setTo(emailDestino);
        message.setSubject("Novo Contato do Site: " + contatoDTO.getAssunto());
        message.setText(
                "Você recebeu uma nova mensagem de contato:\n\n" +
                        "Nome: " + contatoDTO.getNome() + "\n" +
                        "Email do Remetente: " + contatoDTO.getEmail() + "\n\n" +
                        "Mensagem:\n" + contatoDTO.getMensagem()
        );

        mailSender.send(message);
    }
}

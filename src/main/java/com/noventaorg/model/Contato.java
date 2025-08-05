package com.noventaorg.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "O nome não pode estar em branco.")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
    @Column(length = 100)
    private String nome;

    @NotBlank(message = "O email não pode estar em branco.")
    @Email(message = "O formato do email é inválido.")
    @Column(length = 150)
    private String email;

    @NotBlank(message = "O assunto não pode estar em branco.")
    @Size(min = 5, max = 200, message = "O assunto deve ter entre 200 caracteres.")
    @Column(length = 200)
    private String assunto;

    @NotBlank(message = "A mensagem não pode estar em branco.")
    @Size(min = 10, max = 2000, message = "A mensagem deve ter entre 10 e 2000 caracteres.")
    @Column(length = 2000)
    private String mensagem;

}

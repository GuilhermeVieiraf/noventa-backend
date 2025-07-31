package com.noventaorg.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ContatoDTO {

    @NotBlank(message = "O nome não pode estar em branco.")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
    private String nome;

    @NotBlank(message = "O email não pode estar em branco.")
    @Email(message = "O formato do email é inválido.")
    private String email;

    @NotBlank(message = "O assunto não pode estar em branco.")
    @Size(min = 5, max = 200, message = "O assunto deve ter entre 5 e 200 caracteres.")
    private String assunto;

    @NotBlank(message = "A mensagem não pode estar em branco.")
    @Size(min = 10, max = 2000, message = "A mensagem deve ter entre 10 e 2000 caracteres.")
    private String mensagem;
}

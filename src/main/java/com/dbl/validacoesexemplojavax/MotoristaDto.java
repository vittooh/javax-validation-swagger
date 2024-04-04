package com.dbl.validacoesexemplojavax;

import jakarta.validation.constraints.*;

import java.util.List;

public class MotoristaDto {

    @NotBlank(message = "Nome do motorista não pode vazio")
    public String nome;

    @Min(value = 21, message = "Motorista tem que ser maior que 21 anos")
    @Max(value = 75, message = "Motorista tem que ter idade menor do que 75 anos")
    public Long idade;

    @Size(min = 0, max = 20)
    public List<String> filhos;

    @NotBlank(message = "Placa do caminhão naõ pode ser vazia")
    public String placaCaminhao;

    @Override
    public String toString() {
        return "MotoristaDto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", filhos=" + filhos +
                ", placaCaminhao='" + placaCaminhao + '\'' +
                '}';
    }
}

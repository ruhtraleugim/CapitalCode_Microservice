package com.CaptalCode.BlueSpectre.Aluno.Infra.Persistence.Comum;

import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

@Embeddable
public record PessoaEntity(
                            String nome,
                            String email,
                            String cfp,
                            String celular,
                            LocalDateTime dataDeNacimento
                            ){}

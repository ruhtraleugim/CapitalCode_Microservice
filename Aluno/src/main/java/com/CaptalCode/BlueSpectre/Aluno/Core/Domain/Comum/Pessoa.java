package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.Comum;

import java.time.LocalDateTime;

public record Pessoa(
                    String nome,
                    String email,
                    String cfp,
                    String celular,
                    LocalDateTime dataDeNacimento
                    ) {
                        //bom dia
                        }
package com.CaptalCode.BlueSpectre.Aluno.Infra.DTO;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.Comum.Pessoa;

import java.util.UUID;

public record AlunoDTO (
                        Pessoa pessoa,
                        UUID alunoid
                        ){}
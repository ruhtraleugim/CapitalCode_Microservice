package com.CaptalCode.BlueSpectre.Aluno.Core.Domain;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.Comum.Pessoa;

import java.util.UUID;

public record ResponsavelDomain(
                        Pessoa pessoa,
                        UUID responsavelID,
                        String ligacaoComAluno
                        ) {}
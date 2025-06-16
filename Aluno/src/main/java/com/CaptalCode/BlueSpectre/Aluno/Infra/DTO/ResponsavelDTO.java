package com.CaptalCode.BlueSpectre.Aluno.Infra.DTO;

import com.CaptalCode.BlueSpectre.Aluno.Infra.Persistence.Comum.PessoaEntity;

import java.util.UUID;

public record ResponsavelDTO(
                            PessoaEntity pessoa,
                            UUID responsavelID,
                            String ligacaoComAluno
                            ) {}
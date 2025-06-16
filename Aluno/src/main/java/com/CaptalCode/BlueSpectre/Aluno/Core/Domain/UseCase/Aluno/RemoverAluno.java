package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;

import java.util.UUID;

public class RemoverAluno {
    private final IAlunoGateway alunoGateway;

    public RemoverAluno(IAlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    public void deletarAluno(UUID alunoid){
        alunoGateway.deletarAluno(alunoid);
    };
}
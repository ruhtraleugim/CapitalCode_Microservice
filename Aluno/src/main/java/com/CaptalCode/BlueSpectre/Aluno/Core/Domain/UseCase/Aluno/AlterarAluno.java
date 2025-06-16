package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;

import java.util.UUID;

public class AlterarAluno{

    private final IAlunoGateway alunoGateway;

    public AlterarAluno(IAlunoGateway alunoGateway){
        this.alunoGateway = alunoGateway;
    }
    public AlunoDomain alterarAluno(AlunoDomain aluno, UUID ID){
        return alunoGateway.alterarAluno(aluno,ID);
    };
}
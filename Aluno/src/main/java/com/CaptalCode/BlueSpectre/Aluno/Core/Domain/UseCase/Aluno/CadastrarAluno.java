package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;

public class CadastrarAluno {
    private final IAlunoGateway alunoGateway;

    public CadastrarAluno(IAlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    public AlunoDomain cadastrarAluno(AlunoDomain alunoDomain){
        return alunoGateway.cadastrarAluno(alunoDomain);
    };
}
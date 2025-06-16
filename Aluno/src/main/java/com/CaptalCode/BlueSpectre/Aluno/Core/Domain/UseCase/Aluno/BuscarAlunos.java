package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;

import java.util.List;

public class BuscarAlunos {
    private final IAlunoGateway alunoGateway;

    public BuscarAlunos(IAlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    public List<AlunoDomain> buscarAlunos  (){
        return alunoGateway.buscarTodosAlunos();
    };
}
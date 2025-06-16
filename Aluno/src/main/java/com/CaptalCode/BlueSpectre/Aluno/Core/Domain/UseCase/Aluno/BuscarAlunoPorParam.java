package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;

import java.util.Optional;

public class BuscarAlunoPorParam<T> {
    private final IAlunoGateway alunoGateway;

    public BuscarAlunoPorParam(IAlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    public Optional<AlunoDomain> execute(T t){
        return alunoGateway.bucarPorParam(t);
    }
}
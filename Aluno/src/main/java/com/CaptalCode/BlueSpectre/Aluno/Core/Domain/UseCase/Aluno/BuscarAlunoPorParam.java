package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;

import java.util.Optional;

public class BuscarAlunoPorParam {
    private final IAlunoGateway alunoGateway;

    public BuscarAlunoPorParam(IAlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    public Optional<AlunoDomain> execute(String t, Object e) {
        return alunoGateway.bucarPorParam(t, e);
    }
}
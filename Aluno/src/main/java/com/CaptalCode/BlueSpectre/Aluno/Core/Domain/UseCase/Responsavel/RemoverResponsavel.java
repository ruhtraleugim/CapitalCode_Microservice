package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Responsavel;

import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IResponsavelGateway;

import java.util.UUID;

public class RemoverResponsavel {
    private final IResponsavelGateway responsavelGateway;

    public RemoverResponsavel(IResponsavelGateway responsavelGateway) {
        this.responsavelGateway = responsavelGateway;
    }

    void removerResponsavel(UUID responsavelID){
        responsavelGateway.removerResponsavel(responsavelID);
    };
}
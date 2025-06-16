package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Responsavel;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.ResponsavelDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IResponsavelGateway;

import java.util.UUID;

public class AlterarResponsavel {

    private final IResponsavelGateway responsavelGateway;

    public AlterarResponsavel(IResponsavelGateway responsavelGateway) {
        this.responsavelGateway = responsavelGateway;
    }

    public ResponsavelDomain alterarResponsavel(ResponsavelDomain responsavelDomain, UUID responsavelID){
        return responsavelGateway.atualizarResponsavel(responsavelDomain,responsavelID);
    }
}
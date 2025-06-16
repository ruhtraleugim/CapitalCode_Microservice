package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Responsavel;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.ResponsavelDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IResponsavelGateway;

public class CadastrarResponsavel {
    private final IResponsavelGateway responsavelGateway;

    public CadastrarResponsavel(IResponsavelGateway responsavelGateway) {
        this.responsavelGateway = responsavelGateway;
    }

    ResponsavelDomain cadastrarResponsavel(ResponsavelDomain responsavelDomain){
        return responsavelGateway.cadastrarResponsavel(responsavelDomain);
    };
}
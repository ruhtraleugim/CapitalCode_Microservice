package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Responsavel;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.ResponsavelDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IResponsavelGateway;

import java.util.List;

public class BuscarResponsaveis {
    private final IResponsavelGateway responsavelGateway;

    public BuscarResponsaveis(IResponsavelGateway responsavelGateway) {
        this.responsavelGateway = responsavelGateway;
    }

    List<ResponsavelDomain> buscarResponsaveis(){
        return responsavelGateway.buscarResponsaveis();
    }
}
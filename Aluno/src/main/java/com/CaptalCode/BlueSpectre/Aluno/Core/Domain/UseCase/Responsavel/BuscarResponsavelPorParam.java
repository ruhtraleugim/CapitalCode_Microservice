package com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Responsavel;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.ResponsavelDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IResponsavelGateway;

import java.util.Optional;

public class BuscarResponsavelPorParam<T> {
    private final IResponsavelGateway responsavelGateway;

    public BuscarResponsavelPorParam(IResponsavelGateway responsavelGateway) {
        this.responsavelGateway = responsavelGateway;
    }

    Optional<ResponsavelDomain> buscarResponsavelPorParam(T t){
        return responsavelGateway.buscarResponsavelPorParam(t);
    };
}
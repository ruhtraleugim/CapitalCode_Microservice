package com.CaptalCode.BlueSpectre.Aluno.Core.Gateway;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.ResponsavelDomain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IResponsavelGateway {
    ResponsavelDomain atualizarResponsavel(ResponsavelDomain responsavelDomain, UUID resposavelID);

    List<ResponsavelDomain> buscarResponsaveis();

    Optional<ResponsavelDomain> buscarResponsavelPorParam(Object T);

    ResponsavelDomain cadastrarResponsavel(ResponsavelDomain responsavelDomain);

    void removerResponsavel(UUID responsavelID);
}
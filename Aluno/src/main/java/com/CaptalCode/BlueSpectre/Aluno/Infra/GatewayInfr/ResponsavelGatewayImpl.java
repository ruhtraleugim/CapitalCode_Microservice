package com.CaptalCode.BlueSpectre.Aluno.Infra.GatewayInfr;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.ResponsavelDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IResponsavelGateway;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ResponsavelGatewayImpl implements IResponsavelGateway {
    /**
     * @param responsavelDomain
     * @param resposavelID
     * @return
     */
    @Override
    public ResponsavelDomain atualizarResponsavel(ResponsavelDomain responsavelDomain, UUID resposavelID) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<ResponsavelDomain> buscarResponsaveis() {
        return List.of();
    }

    /**
     * @param T
     * @return
     */
    @Override
    public Optional<ResponsavelDomain> buscarResponsavelPorParam(Object T) {
        return Optional.empty();
    }

    /**
     * @param responsavelDomain
     * @return
     */
    @Override
    public ResponsavelDomain cadastrarResponsavel(ResponsavelDomain responsavelDomain) {
        return null;
    }

    /**
     * @param responsavelID
     */
    @Override
    public void removerResponsavel(UUID responsavelID) {

    }
}
package com.CaptalCode.BlueSpectre.Aluno.Infra.Beans;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Responsavel.*;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IResponsavelGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanResponsavelGatewayConfig {

    @Bean
    public AlterarResponsavel alterarResponsavel(IResponsavelGateway responsavelGateway){
        return new AlterarResponsavel(responsavelGateway);
    }
    @Bean
    public BuscarResponsaveis buscarResponsaveis(IResponsavelGateway responsavelGateway){
        return new BuscarResponsaveis(responsavelGateway);
    }
    @Bean
    public BuscarResponsavelPorParam<Object> buscarResponsavelPorParam(IResponsavelGateway responsavelGateway){
        return new BuscarResponsavelPorParam<Object>(responsavelGateway);
    }
    @Bean
    public CadastrarResponsavel cadastrarResponsavel(IResponsavelGateway responsavelGateway){
        return new CadastrarResponsavel(responsavelGateway);
    }
    @Bean
    public RemoverResponsavel responsavel(IResponsavelGateway responsavelGateway){
        return new RemoverResponsavel(responsavelGateway);
    }
}
package com.CaptalCode.BlueSpectre.Aluno.Infra.Beans;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.*;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAlunoGatewayConfig {
    @Bean
    public AlterarAluno alterarAluno(IAlunoGateway alunoGateway){
        return new AlterarAluno(alunoGateway);
    };
    @Bean
    public BuscarAlunos buscarAlunos(IAlunoGateway alunoGateway){
        return new BuscarAlunos(alunoGateway);
    }
    @Bean
    public BuscarAlunoPorParam<Object> buscarAlunoPorParam(IAlunoGateway alunoGateway){
        return new BuscarAlunoPorParam<Object>(alunoGateway);
    }
    @Bean
    public CadastrarAluno cadastrarAluno(IAlunoGateway alunoGateway){
        return new CadastrarAluno(alunoGateway);
    }
    @Bean
    public RemoverAluno removerAluno(IAlunoGateway alunoGateway){
        return new RemoverAluno(alunoGateway);
    }
}
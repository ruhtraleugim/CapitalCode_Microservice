package com.CaptalCode.BlueSpectre.Aluno.Infra.GatewayInfr;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class AlunoGatewayImpl implements IAlunoGateway {

    /**
     * @param alunoDomain
     * @param alunoID
     * @return
     */
    @Override
    public AlunoDomain alterarAluno(AlunoDomain alunoDomain, UUID alunoID) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<AlunoDomain> buscarTodosAlunos() {
        return List.of();
    }

    /**
     * @param t
     * @param e
     * @return
     */
    @Override
    public Optional<AlunoDomain> bucarPorParam(String t, Object e) {
        return Optional.empty();
    }


    /**
     * @param alunoDomain
     * @return
     */
    @Override
    public AlunoDomain cadastrarAluno(AlunoDomain alunoDomain) {
        return null;
    }

    /**
     * @param alunoID
     */
    @Override
    public void deletarAluno(UUID alunoID) {

    }
}

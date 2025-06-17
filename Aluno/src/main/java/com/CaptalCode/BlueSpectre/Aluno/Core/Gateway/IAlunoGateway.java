package com.CaptalCode.BlueSpectre.Aluno.Core.Gateway;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IAlunoGateway {

    AlunoDomain alterarAluno(AlunoDomain alunoDomain, UUID alunoID);

    List<AlunoDomain> buscarTodosAlunos();

    Optional<AlunoDomain> bucarPorParam(String t, Object e);

    AlunoDomain cadastrarAluno(AlunoDomain alunoDomain);

    void  deletarAluno(UUID alunoID);

}
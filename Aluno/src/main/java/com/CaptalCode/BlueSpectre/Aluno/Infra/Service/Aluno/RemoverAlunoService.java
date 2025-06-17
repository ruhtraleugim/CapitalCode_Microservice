package com.CaptalCode.BlueSpectre.Aluno.Infra.Service.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.BuscarAlunoPorParam;
import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.RemoverAluno;

import java.util.UUID;

public class RemoverAlunoService {
    private final BuscarAlunoPorParam buscarAlunosUsecase;
    private final RemoverAluno removerAluno;

    public RemoverAlunoService(BuscarAlunoPorParam buscarAlunosUsecase, RemoverAluno removerAluno) {
        this.buscarAlunosUsecase = buscarAlunosUsecase;
        this.removerAluno = removerAluno;
    }

    public void removeraluno(String UUId, UUID alunoID ){
        //Verificar o nivel de acesso do usuario
        if (buscarAlunosUsecase.execute(UUId, alunoID).isEmpty()){
            throw new RuntimeException("aluno com id " + alunoID + " não encontrado");
        }else removerAluno.deletarAluno(alunoID);
    }
}
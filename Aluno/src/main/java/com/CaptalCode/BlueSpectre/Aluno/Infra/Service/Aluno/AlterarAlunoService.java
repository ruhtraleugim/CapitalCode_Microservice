package com.CaptalCode.BlueSpectre.Aluno.Infra.Service.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.BuscarAlunoPorParam;
import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.CadastrarAluno;
import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.RemoverAluno;
import com.CaptalCode.BlueSpectre.Aluno.Infra.DTO.AlunoDTO;
import com.CaptalCode.BlueSpectre.Aluno.Infra.Mapper.AlunoMapper;

import java.util.Optional;
import java.util.UUID;

public class AlterarAlunoService {
    private final BuscarAlunoPorParam buscarAlunoPorParam;
    private final AlunoMapper alunoMapper;
    private final CadastrarAluno cadastrarAluno;
    private final RemoverAluno removerAluno;

    public AlterarAlunoService(BuscarAlunoPorParam buscarAlunoPorParam, AlunoMapper alunoMapper, CadastrarAluno cadastrarAluno, RemoverAluno removerAluno) {
        this.buscarAlunoPorParam = buscarAlunoPorParam;
        this.alunoMapper = alunoMapper;
        this.cadastrarAluno = cadastrarAluno;
        this.removerAluno = removerAluno;
    }

    public void alterarAluno(AlunoDTO alunoDTO, UUID alunoID){
        Optional<AlunoDomain> alunod = buscarAlunoPorParam.execute("UUID", alunoID);
        if (alunod.isEmpty()){
            throw new RuntimeException("Aluno não encontrado");
        }else {
            removerAluno.deletarAluno(alunoID);
            cadastrarAluno.cadastrarAluno(alunoMapper.toDomain(alunoDTO));
        }
    }

}
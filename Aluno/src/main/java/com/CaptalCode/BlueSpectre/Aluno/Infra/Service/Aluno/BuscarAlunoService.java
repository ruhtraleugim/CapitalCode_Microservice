package com.CaptalCode.BlueSpectre.Aluno.Infra.Service.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.BuscarAlunos;
import com.CaptalCode.BlueSpectre.Aluno.Infra.DTO.AlunoDTO;
import com.CaptalCode.BlueSpectre.Aluno.Infra.Mapper.AlunoMapper;

import java.util.List;

public class BuscarAlunoService {
    private final BuscarAlunos buscarAlunos;
    private final AlunoMapper alunoMapper;

    public BuscarAlunoService(BuscarAlunos buscarAlunos, AlunoMapper alunoMapper) {
        this.buscarAlunos = buscarAlunos;
        this.alunoMapper = alunoMapper;
    }

    public List<AlunoDTO> buscarAlunos(AlunoDTO alunoDTO){
        List<AlunoDomain> alunoDomain = buscarAlunos.buscarAlunos();
        return alunoDomain.stream().map(alunoMapper::toDTO).toList();
    }
}

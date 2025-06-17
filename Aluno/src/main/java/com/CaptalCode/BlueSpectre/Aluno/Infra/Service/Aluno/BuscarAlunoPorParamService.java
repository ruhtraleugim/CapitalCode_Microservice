package com.CaptalCode.BlueSpectre.Aluno.Infra.Service.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.BuscarAlunoPorParam;
import com.CaptalCode.BlueSpectre.Aluno.Infra.DTO.AlunoDTO;
import com.CaptalCode.BlueSpectre.Aluno.Infra.Mapper.AlunoMapper;

import java.util.Optional;

public class BuscarAlunoPorParamService {
    private final BuscarAlunoPorParam buscarAlunoPorParam;
    private final AlunoMapper alunoMapper;

    public BuscarAlunoPorParamService(BuscarAlunoPorParam buscarAlunoPorParam, AlunoMapper alunoMapper) {
        this.buscarAlunoPorParam = buscarAlunoPorParam;
        this.alunoMapper = alunoMapper;
    }

    public Optional<AlunoDTO> buscarPorParam(String campo, Object valor){
        return buscarAlunoPorParam.execute(campo,valor).map(alunoMapper::toDTO);
    }
}

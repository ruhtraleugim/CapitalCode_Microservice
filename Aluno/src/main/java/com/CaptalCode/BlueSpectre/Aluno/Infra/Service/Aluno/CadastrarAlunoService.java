package com.CaptalCode.BlueSpectre.Aluno.Infra.Service.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.BuscarAlunoPorParam;
import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.UseCase.Aluno.CadastrarAluno;
import com.CaptalCode.BlueSpectre.Aluno.Infra.DTO.AlunoDTO;
import com.CaptalCode.BlueSpectre.Aluno.Infra.Mapper.AlunoMapper;
import org.springframework.stereotype.Service;


@Service
public class CadastrarAlunoService  {

    private final CadastrarAluno cadastrarAlunoUsecase;
    private final BuscarAlunoPorParam buscarAlunoPorParam;
    private final AlunoMapper alunoMapper;

    public CadastrarAlunoService(CadastrarAluno cadastrarAlunoUsecase, BuscarAlunoPorParam buscarAlunoPorParam, AlunoMapper alunoMapper) {
        this.cadastrarAlunoUsecase = cadastrarAlunoUsecase;
        this.buscarAlunoPorParam = buscarAlunoPorParam;
        this.alunoMapper = alunoMapper;
    }

    public AlunoDTO cadastrarAluno(AlunoDTO alunoDTO){
        var alunoExiste = buscarAlunoPorParam.execute("CPF", alunoDTO.pessoa().cfp() );

        if (VerificarNecessidadeResponsavelAlunoService.verificarIdade(alunoDTO)){
            if (alunoExiste.isEmpty()){
                throw new RuntimeException();
            }else cadastrarAlunoUsecase.cadastrarAluno(alunoMapper.toDomain(alunoDTO));
        }else throw new RuntimeException("O aluno não possui idade o suficiente para ser cadastrado sozinho");

        return  alunoDTO;
    }
}
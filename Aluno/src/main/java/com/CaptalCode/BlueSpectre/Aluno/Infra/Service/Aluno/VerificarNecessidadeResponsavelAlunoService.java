package com.CaptalCode.BlueSpectre.Aluno.Infra.Service.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Infra.DTO.AlunoDTO;

import java.time.LocalDateTime;

public class VerificarNecessidadeResponsavelAlunoService {

    public static Boolean verificarIdade(AlunoDTO alunoDTO){
        LocalDateTime idadeAluno = alunoDTO.pessoa().dataDeNacimento();
        return idadeAluno.getDayOfYear() - LocalDateTime.now().getDayOfYear() >= 18;
    }
}
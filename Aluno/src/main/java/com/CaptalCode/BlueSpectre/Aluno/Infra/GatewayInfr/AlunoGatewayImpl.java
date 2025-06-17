package com.CaptalCode.BlueSpectre.Aluno.Infra.GatewayInfr;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Core.Gateway.IAlunoGateway;
import com.CaptalCode.BlueSpectre.Aluno.Infra.Mapper.AlunoMapper;
import com.CaptalCode.BlueSpectre.Aluno.Infra.Service.Aluno.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class AlunoGatewayImpl implements IAlunoGateway {

    private final AlterarAlunoService alterarAlunoService;
    private final BuscarAlunosService buscarAlunoService;
    private final BuscarAlunoPorParamService buscarAlunoPorParamService;
    private final CadastrarAlunoService cadastrarAlunoService;
    private final RemoverAlunoService removerAlunoService;
    private final AlunoMapper alunoMapper;


    public AlunoGatewayImpl(AlterarAlunoService alterarAlunoService, BuscarAlunosService buscarAlunoService, BuscarAlunoPorParamService buscarAlunoPorParamService, CadastrarAlunoService cadastrarAlunoService, RemoverAlunoService removerAlunoService, AlunoMapper alunoMapper) {
        this.alterarAlunoService = alterarAlunoService;
        this.buscarAlunoService = buscarAlunoService;
        this.buscarAlunoPorParamService = buscarAlunoPorParamService;
        this.cadastrarAlunoService = cadastrarAlunoService;
        this.removerAlunoService = removerAlunoService;
        this.alunoMapper = alunoMapper;
    }

    /**
     * @param alunoDomain
     * @param alunoID
     * @return
     */
    @Override
    public AlunoDomain alterarAluno(AlunoDomain alunoDomain, UUID alunoID) {
        alterarAlunoService.alterarAluno(alunoMapper.toDTO(alunoDomain),alunoID);
        return alunoDomain;
    }

    /**
     * @return
     */
    @Override
    public List<AlunoDomain> buscarTodosAlunos() {
        return buscarAlunoService.buscarAlunos().stream().map(alunoMapper::toDomain).toList();
    }

    /**
     * @param t
     * @param e
     * @return
     */
    @Override
    public Optional<AlunoDomain> bucarPorParam(String t, Object e) {
        return buscarAlunoPorParamService.buscarPorParam(t,e).map(alunoMapper::toDomain);
    }


    /**
     * @param alunoDomain
     * @return
     */
    @Override
    public AlunoDomain cadastrarAluno(AlunoDomain alunoDomain) {
        cadastrarAlunoService.cadastrarAluno(alunoMapper.toDTO(alunoDomain));
        return alunoDomain;
    }

    /**
     * @param alunoID
     */
    @Override
    public void deletarAluno(UUID alunoID) {
        removerAlunoService.removeraluno("UUID",alunoID);
    }
}

package com.CaptalCode.BlueSpectre.Aluno.Infra.Persistence.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, UUID> {
}
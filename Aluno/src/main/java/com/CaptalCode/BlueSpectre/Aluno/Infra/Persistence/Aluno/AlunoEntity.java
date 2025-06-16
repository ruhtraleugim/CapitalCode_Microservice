package com.CaptalCode.BlueSpectre.Aluno.Infra.Persistence.Aluno;

import com.CaptalCode.BlueSpectre.Aluno.Infra.Persistence.Comum.PessoaEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "ALUNO")
@Table(name = "ALUNO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AlunoEntity {
    @Embedded
    private PessoaEntity pessoa;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID alunoID;
}
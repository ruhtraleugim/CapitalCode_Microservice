package com.CaptalCode.BlueSpectre.Aluno.Infra.Persistence.Responsavel;


import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.Comum.Pessoa;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "RESPONSAVEL")
@Table(name = "RESPONSAVEL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponsavelEntity  {
    @Embedded
    private Pessoa pessoa;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID responsavelID;

    private String ligacaoComAluno;
}
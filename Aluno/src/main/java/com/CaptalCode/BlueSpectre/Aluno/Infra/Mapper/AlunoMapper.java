package com.CaptalCode.BlueSpectre.Aluno.Infra.Mapper;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.AlunoDomain;
import com.CaptalCode.BlueSpectre.Aluno.Infra.DTO.AlunoDTO;
import com.CaptalCode.BlueSpectre.Aluno.Infra.Persistence.Aluno.AlunoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

    AlunoDomain toDomain(AlunoEntity entity);

    AlunoEntity toEntity(AlunoDomain domain);

    AlunoDTO toDTO(AlunoDomain domain);

    AlunoDomain toDomain(AlunoDTO dto);
}

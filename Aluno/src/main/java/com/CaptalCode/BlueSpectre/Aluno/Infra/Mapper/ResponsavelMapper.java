package com.CaptalCode.BlueSpectre.Aluno.Infra.Mapper;

import com.CaptalCode.BlueSpectre.Aluno.Core.Domain.ResponsavelDomain;
import com.CaptalCode.BlueSpectre.Aluno.Infra.DTO.ResponsavelDTO;
import com.CaptalCode.BlueSpectre.Aluno.Infra.Persistence.Responsavel.ResponsavelEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponsavelMapper {

    ResponsavelDomain toDomain(ResponsavelEntity entity);

    ResponsavelEntity toEntity(ResponsavelDomain domain);

    ResponsavelDTO toDTO(ResponsavelDomain domain);

    ResponsavelDomain toDomain(ResponsavelDTO dto);
}

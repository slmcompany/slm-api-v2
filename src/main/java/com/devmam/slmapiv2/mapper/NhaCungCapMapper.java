package com.devmam.slmapiv2.mapper;

import com.devmam.slmapiv2.dto.response.entities.NhaCungCapDto;
import com.devmam.slmapiv2.entities.NhaCungCap;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NhaCungCapMapper {
    NhaCungCapDto toDto(NhaCungCap nhaCungCap);
    List<NhaCungCapDto> toDtoList(List<NhaCungCap> nhaCungCapList);
}

package com.devmam.slmapiv2.mapper;

import com.devmam.slmapiv2.dto.response.entities.VatTuDTO;
import com.devmam.slmapiv2.dto.response.entities.VatTuDTO;
import com.devmam.slmapiv2.entities.VatTu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VatTuMapper {

    VatTuMapper INSTANCE = Mappers.getMapper(VatTuMapper.class);

    VatTuDTO toDto(VatTu vatTu);

    List<VatTuDTO> toDtoList(List<VatTu> vatTuList);

    default Page<VatTuDTO> toDtoPage(Page<VatTu> vatTuPage){
        if(vatTuPage == null){
            return Page.empty();
        }
        return vatTuPage.map(this::toDto);
    }
}

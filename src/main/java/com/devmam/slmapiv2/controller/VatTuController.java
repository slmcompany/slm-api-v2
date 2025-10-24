package com.devmam.slmapiv2.controller;

import com.devmam.slmapiv2.dto.request.BaseFilterRequest;
import com.devmam.slmapiv2.dto.response.ResponseData;
import com.devmam.slmapiv2.dto.response.entities.VatTuDTO;
import com.devmam.slmapiv2.entities.VatTu;
import com.devmam.slmapiv2.exception.customize.CommonException;
import com.devmam.slmapiv2.mapper.VatTuMapper;
import com.devmam.slmapiv2.services.impl.enities.VatTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/vat-tu")
public class VatTuController {

    @Autowired
    private VatTuService vatTuService;

    @GetMapping("/{id}")
    public ResponseEntity<ResponseData<VatTuDTO>> getById(Integer id) {

        Optional<VatTu> vatTu = vatTuService.getOne(id);

        if(vatTu.isEmpty()){
            throw new CommonException("Vat tu not found for id: " + id);
        }

        return ResponseEntity.ok(
                ResponseData.<VatTuDTO>builder()
                        .status(200)
                        .error(null)
                        .message("Success")
                        .data(VatTuMapper.INSTANCE.toDto(vatTu.get()))
                        .build()
        );
    }

    @PostMapping("/filter")
    public ResponseEntity<ResponseData<Page<VatTuDTO>>> filter(@RequestBody BaseFilterRequest filter) {
        return ResponseEntity.ok(
          ResponseData.<Page<VatTuDTO>>builder()
                  .status(200)
                  .error(null)
                  .message("Success")
                  .data(VatTuMapper.INSTANCE.toDtoPage(vatTuService.filter(filter)))
                  .build()
        );
    }
}

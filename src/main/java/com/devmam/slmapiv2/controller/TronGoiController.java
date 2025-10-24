package com.devmam.slmapiv2.controller;

import com.devmam.slmapiv2.dto.request.BaseFilterRequest;
import com.devmam.slmapiv2.dto.response.ResponseData;
import com.devmam.slmapiv2.dto.response.entities.TronGoiDto;
import com.devmam.slmapiv2.entities.TronGoi;
import com.devmam.slmapiv2.exception.customize.CommonException;
import com.devmam.slmapiv2.mapper.TronGoiMapper;
import com.devmam.slmapiv2.services.impl.enities.TronGoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tron-goi")
public class TronGoiController {

    @Autowired
    private TronGoiService tronGoiService;

    @GetMapping("/{id}")
    public ResponseEntity<ResponseData<TronGoiDto>> getById(Integer id) {
        Optional<TronGoi> tronGoi = tronGoiService.getOne(id);

        if(tronGoi.isEmpty()){
            throw new CommonException("Vat tu not found for id: " + id);
        }

        return ResponseEntity.ok(
                ResponseData.<TronGoiDto>builder()
                        .status(200)
                        .error(null)
                        .message("Success")
                        .data(TronGoiMapper.INSTANCE.toDto(tronGoi.get()))
                        .build()
        );
    }

    @PostMapping("/filter")
    public ResponseEntity<ResponseData<Page<TronGoiDto>>> filter(@RequestBody BaseFilterRequest filter) {
        return ResponseEntity.ok(
                ResponseData.<Page<TronGoiDto>>builder()
                        .status(200)
                        .error(null)
                        .message("Success")
                        .data(TronGoiMapper.INSTANCE.toDtoPage(tronGoiService.filter(filter)))
                        .build()
        );
    }

}

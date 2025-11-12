package com.devmam.slmapiv2.controller;

import com.devmam.slmapiv2.dto.response.ResponseData;
import com.devmam.slmapiv2.dto.response.entities.NhaCungCapDto;
import com.devmam.slmapiv2.mapper.NhaCungCapMapper;
import com.devmam.slmapiv2.services.impl.enities.NhaCungCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basic-api/nha-cung-cap")
public class NhaCungCapController {

    @Autowired
    private NhaCungCapService nhaCungCapService;
    @Autowired
    private NhaCungCapMapper nhaCungCapMapper;

    @GetMapping("/all")
    public ResponseEntity<ResponseData<List<NhaCungCapDto>>> getAll() {
        return ResponseEntity.ok(
                ResponseData.<List<NhaCungCapDto>>builder()
                        .status(200)
                        .error(null)
                        .message("Success")
                        .data(nhaCungCapMapper.toDtoList(nhaCungCapService.getAll()))
                        .build()
        );
    }
}

package com.devmam.slmapiv2.dto.response.entities;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.devmam.slmapiv2.entities.VatTuTronGoi}
 */
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class VatTuTronGoiDto implements Serializable {
    private final Integer id;
    private final VatTuDTO vatTu;
    @Size(max = 500)
    private final String moTa;
    private final Integer soLuong;
    private final Double gia;
    private final Double gm;
    private final Instant taoLuc;
    private final Integer thoiGianBaoHanh;
    private final Boolean duocBaoHanh;
    private final Integer trangThai;
}
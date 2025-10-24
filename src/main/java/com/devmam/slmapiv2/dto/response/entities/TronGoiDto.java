package com.devmam.slmapiv2.dto.response.entities;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

/**
 * DTO for {@link com.devmam.slmapiv2.entities.TronGoi}
 */
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class TronGoiDto implements Serializable {
    private final Integer id;
    private final NganhHangDto nghanhHang;
    @Size(max = 400)
    private final String ten;
    @Size(max = 50)
    private final String loaiHeThong;
    @Size(max = 50)
    private final String loaiPha;
    private final Double sanLuongToiThieu;
    private final Double sanLuongToiDa;
    private final String moTa;
    private final Instant taoLuc;
    private final Double tongGia;
    private final Boolean banChay;
    private final Integer trangThai;
    private final Set<VatTuTronGoiDto> vatTuTronGois;

    /**
     * DTO for {@link com.devmam.slmapiv2.entities.NganhHang}
     */
    @AllArgsConstructor
    @Getter
    @EqualsAndHashCode
    public static class NganhHangDto implements Serializable {
        private final Integer id;
        @Size(max = 50)
        private final String ma;
        @Size(max = 100)
        private final String ten;
        @Size(max = 20)
        private final String sdtSale;
        @Size(max = 20)
        private final String sdtTech;
        @Size(max = 1000)
        private final String anhNgang;
        @Size(max = 1000)
        private final String anhVuong;
        private final Integer trangThai;
    }
}
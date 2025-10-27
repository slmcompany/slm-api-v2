package com.devmam.slmapiv2.dto.request.entities;

import com.devmam.slmapiv2.entities.VatTu;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class VatTuCreatingDto {
    Integer nhomVatTuId;
    Integer thuongHieuId;
    Integer nhaCungCapId;
    @Size(max = 400)
    String ten;
    @Size(max = 1000)
    String sheetLink;
    @Size(max = 20)
    String donVi;
    String moTaBaoGia;
    String moTaHopDong;
    Map<String, Object> duLieuRieng;
    Instant taoLuc;
    Integer trangThai;

    public static VatTu toEntity(VatTuCreatingDto dto) {
        return VatTu.builder()
                .ten(dto.getTen())
                .sheetLink(dto.getSheetLink())
                .donVi(dto.getDonVi())
                .moTaBaoGia(dto.getMoTaBaoGia())
                .moTaHopDong(dto.getMoTaHopDong())
                .duLieuRieng(dto.getDuLieuRieng())
                .taoLuc(dto.getTaoLuc())
                .trangThai(dto.getTrangThai())
                .build();
    }
}

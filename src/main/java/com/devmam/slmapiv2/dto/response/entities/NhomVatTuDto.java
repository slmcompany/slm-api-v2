package com.devmam.slmapiv2.dto.response.entities;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Map;

/**
 * DTO for {@link com.devmam.slmapiv2.entities.NhomVatTu}
 */
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@EqualsAndHashCode(of = {"id"})
public class NhomVatTuDto implements Serializable {
    Integer id;
    String ma;
    NganhHangDto nghanhHang;
    @Size(max = 400)
    String ten;
    Map<String, Object> thuocTinhRieng;
    Double gm;
    Boolean vatTuChinh;
    Integer trangThai;
}
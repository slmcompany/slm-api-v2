package com.devmam.slmapiv2.dto.response.entities;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * DTO for {@link com.devmam.slmapiv2.entities.NhaCungCap}
 */
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@EqualsAndHashCode(of = {"id"})
public class NhaCungCapDto implements Serializable {
    Integer id;
    @Size(max = 200)
    String tenQuocTe;
    @Size(max = 200)
    String ten;
    @Size(max = 200)
    String quocGia;
    @Size(max = 20)
    String sdt;
    @Size(max = 100)
    String email;
    @Size(max = 400)
    String moTa;
    @Size(max = 1000)
    String anh;
    Integer trangThai;
}
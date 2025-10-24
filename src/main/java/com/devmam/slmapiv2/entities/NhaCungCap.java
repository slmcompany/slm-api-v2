package com.devmam.slmapiv2.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nha_cung_cap")
public class NhaCungCap implements Serializable {
    private static final long serialVersionUID = -6724269779830304769L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 200)
    @Column(name = "ten_quoc_te", length = 200)
    private String tenQuocTe;

    @Size(max = 200)
    @Column(name = "ten", length = 200)
    private String ten;

    @Size(max = 200)
    @Column(name = "quoc_gia", length = 200)
    private String quocGia;

    @Size(max = 20)
    @Column(name = "sdt", length = 20)
    private String sdt;

    @Size(max = 100)
    @Column(name = "email", length = 100)
    private String email;

    @Size(max = 400)
    @Column(name = "mo_ta", length = 400)
    private String moTa;

    @Size(max = 1000)
    @Column(name = "anh", length = 1000)
    private String anh;

    @ColumnDefault("0")
    @Column(name = "trang_thai")
    private Integer trangThai;

}
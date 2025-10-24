package com.devmam.slmapiv2.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nhom_vat_tu")
public class NhomVatTu implements Serializable {
    private static final long serialVersionUID = -6981409597414038825L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nghanh_hang_id")
    private NganhHang nghanhHang;

    @Size(max = 400)
    @Column(name = "ten", length = 400)
    private String ten;

    @Column(name = "thuoc_tinh_rieng")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> thuocTinhRieng;

    @ColumnDefault("0")
    @Column(name = "gm")
    private Double gm;

    @ColumnDefault("false")
    @Column(name = "vat_tu_chinh")
    private Boolean vatTuChinh;

    @ColumnDefault("0")
    @Column(name = "trang_thai")
    private Integer trangThai;

}
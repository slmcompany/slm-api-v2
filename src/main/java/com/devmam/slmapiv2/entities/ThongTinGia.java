package com.devmam.slmapiv2.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "thong_tin_gia")
public class ThongTinGia implements Serializable {
    private static final long serialVersionUID = 3377672358845410057L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vat_tu_id")
    private VatTu vatTu;

    @Column(name = "gia_nhap")
    private Double giaNhap;

    @Column(name = "vat")
    private Double vat;

    @Column(name = "gia_nhap_vat")
    private Double giaNhapVat;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "tao_luc")
    private Instant taoLuc;

    @ColumnDefault("0")
    @Column(name = "trang_thai")
    private Integer trangThai;

}
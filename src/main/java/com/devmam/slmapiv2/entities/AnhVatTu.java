package com.devmam.slmapiv2.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "anh_vat_tu")
public class AnhVatTu implements Serializable {
    private static final long serialVersionUID = -1020174206751831847L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vat_tu_id")
    private VatTu vatTu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tep_tin_id")
    private TepTin tepTin;

    @ColumnDefault("false")
    @Column(name = "anh_chinh")
    private Boolean anhChinh;

    @ColumnDefault("0")
    @Column(name = "trang_thai")
    private Integer trangThai;

}
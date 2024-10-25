package org.example.websitebanhang.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDonHang;

    private LocalDateTime ngayMua;
    private int soLuong;

    @ManyToOne
    @JoinColumn(name = "ma_sp")
    private SanPham sanPham;


    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public LocalDateTime getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(LocalDateTime ngayMua) {
        this.ngayMua = ngayMua;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
}

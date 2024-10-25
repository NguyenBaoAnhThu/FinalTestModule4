package org.example.websitebanhang.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSp;

    private String tenSp;
    private double giaSp;
    private String tinhTrangSp;

    @ManyToOne
    @JoinColumn(name = "ma_loai_sp")
    private LoaiSanPham loaiSanPham;

    @OneToMany(mappedBy = "sanPham")
    private List<DonHang> donHangs;

    // Getters and Setters
    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public String getTinhTrangSp() {
        return tinhTrangSp;
    }

    public void setTinhTrangSp(String tinhTrangSp) {
        this.tinhTrangSp = tinhTrangSp;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public List<DonHang> getDonHangs() {
        return donHangs;
    }

    public void setDonHangs(List<DonHang> donHangs) {
        this.donHangs = donHangs;
    }
}

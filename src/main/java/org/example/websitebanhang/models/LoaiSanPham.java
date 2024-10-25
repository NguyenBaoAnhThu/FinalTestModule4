package org.example.websitebanhang.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class LoaiSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLoaiSp;

    private String tenLoaiSp;

    @OneToMany(mappedBy = "loaiSanPham", cascade = CascadeType.ALL)
    private List<SanPham> sanPhams;


    public int getMaLoaiSp() {
        return maLoaiSp;
    }

    public void setMaLoaiSp(int maLoaiSp) {
        this.maLoaiSp = maLoaiSp;
    }

    public String getTenLoaiSp() {
        return tenLoaiSp;
    }

    public void setTenLoaiSp(String tenLoaiSp) {
        this.tenLoaiSp = tenLoaiSp;
    }

    public List<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(List<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }
}

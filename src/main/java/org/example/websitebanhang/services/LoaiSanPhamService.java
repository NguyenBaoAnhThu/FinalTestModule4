package org.example.websitebanhang.services;

import org.example.websitebanhang.models.LoaiSanPham;
import org.example.websitebanhang.repositories.LoaiSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSanPhamService {

    @Autowired
    private LoaiSanPhamRepository loaiSanPhamRepository;

    public List<LoaiSanPham> getAllLoaiSanPham() {
        return loaiSanPhamRepository.findAll();
    }
}

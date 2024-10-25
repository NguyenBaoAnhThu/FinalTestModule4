package org.example.websitebanhang.repositories;

import org.example.websitebanhang.models.DonHang;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
    List<DonHang> findByNgayMuaBetween(LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);
    @Query("SELECT dh FROM DonHang dh ORDER BY dh.soLuong * dh.sanPham.giaSp DESC")
    List<DonHang> findTopDonHang(Pageable pageable);
}

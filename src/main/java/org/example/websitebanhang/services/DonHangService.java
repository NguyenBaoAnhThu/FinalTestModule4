package org.example.websitebanhang.services;

import org.example.websitebanhang.models.DonHang;
import org.example.websitebanhang.repositories.DonHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DonHangService {

    @Autowired
    private DonHangRepository donHangRepository;

    public List<DonHang> getDonHangWithPagination(int page, int pageSize) {
        return donHangRepository.findAll(PageRequest.of(page, pageSize)).getContent();
    }

    public long getTotalPages(int pageSize) {
        long totalItems = donHangRepository.count();
        return (long) Math.ceil((double) totalItems / pageSize);
    }

    public List<DonHang> getDonHangByDateRange(LocalDateTime startDate, LocalDateTime endDate, int limit) {
        return donHangRepository.findByNgayMuaBetween(startDate, endDate, PageRequest.of(0, limit));
    }

    public List<DonHang> getTopDonHang(int limit) {
        return donHangRepository.findTopDonHang(PageRequest.of(0, limit));
    }
}

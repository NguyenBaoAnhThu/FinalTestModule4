package org.example.websitebanhang.controllers;

import org.example.websitebanhang.models.DonHang;
import org.example.websitebanhang.services.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class DonHangController {

    @Autowired
    private DonHangService donHangService;

    @GetMapping("/donhang")
    public String listDonHang(Model model, @RequestParam(defaultValue = "0") int page) {
        int pageSize = 5;
        List<DonHang> donHangList = donHangService.getDonHangWithPagination(page, pageSize);
        long totalPages = donHangService.getTotalPages(pageSize);

        model.addAttribute("donHangList", donHangList);
        model.addAttribute("page", page);
        model.addAttribute("totalPages", totalPages);
        return "donhang";
    }

    @GetMapping("/donhang/filter")
    public String filterDonHang(Model model,
                                @RequestParam("startDate") String startDate,
                                @RequestParam("endDate") String endDate,
                                @RequestParam("orderLimit") int orderLimit) {

        LocalDateTime start = LocalDateTime.parse(startDate);
        LocalDateTime end = LocalDateTime.parse(endDate);

        List<DonHang> donHangList = donHangService.getDonHangByDateRange(start, end, orderLimit);
        model.addAttribute("donHangList", donHangList);
        return "donhang";
    }

    @GetMapping("/donhang/top")
    public String topDonHang(Model model,
                             @RequestParam("topOrders") int topOrders) {
        List<DonHang> donHangList = donHangService.getTopDonHang(topOrders);
        model.addAttribute("donHangList", donHangList);
        return "donhang";
    }
}

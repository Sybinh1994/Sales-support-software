package com.binh.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.binh.model.BanAn;
import com.binh.model.HoaDon;
import com.binh.model.NhanVien;
import com.binh.service.HoaDonService;

@Controller
public class HoaDonController {

	@Autowired
    private HoaDonService hoaDonService;

    // display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
    	
    	
        model.addAttribute("listHoaDons", hoaDonService.layDanhSachHoaDon());
        
        ArrayList<HoaDon> listHoaDon = (ArrayList<HoaDon>) hoaDonService.layDanhSachHoaDon();
        
        ArrayList<NhanVien> listNhanVien = new ArrayList<NhanVien>();
        
        ArrayList<BanAn> listBanAn = new ArrayList<BanAn>();
        
        for (HoaDon hd : listHoaDon) {
        	
        	listNhanVien.add(hd.getNhanVIEN());
        	
        	listBanAn.add(hd.getBanAN());
        	
        }  
        
        model.addAttribute("listNhanVien", listNhanVien);
        
        model.addAttribute("listBanAn", listBanAn);
        
        
        return "index";
    }
	
}

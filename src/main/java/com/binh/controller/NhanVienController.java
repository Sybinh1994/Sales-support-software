package com.binh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.binh.service.NhanVienService;

@Controller
public class NhanVienController {
	
	/*
	 	@Autowired
	    private NhanVienService nhanVienService;

	    // display list of employees
	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        model.addAttribute("listNhanViens", nhanVienService.layDanhSachNhanVien());
	        return "index";
	    }*/

}

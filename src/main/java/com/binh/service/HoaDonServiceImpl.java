package com.binh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binh.model.HoaDon;
import com.binh.repository.HoaDonRepository;

@Service
public class HoaDonServiceImpl implements HoaDonService {
	
	@Autowired
	private HoaDonRepository hoaDonRepository;

	@Override
	public List<HoaDon> layDanhSachHoaDon() {
		// TODO Auto-generated method stub
		return hoaDonRepository.findAll();
	}

	@Override
	public HoaDon layHoaDonTheoMAHD(String maHD) {
		Optional < HoaDon > optional = hoaDonRepository.findById(maHD);
        HoaDon hoadon = null;
        if (optional.isPresent()) {
            hoadon = optional.get();
        } else {
            throw new RuntimeException(" Hoa Don not found for maHD :: " + maHD);
        }
        return hoadon;
	}
	
	

}

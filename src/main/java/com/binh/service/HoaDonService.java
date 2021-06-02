package com.binh.service;

import java.util.List;

import com.binh.model.HoaDon;

public interface HoaDonService {
	
	List<HoaDon> layDanhSachHoaDon();
	
	public HoaDon layHoaDonTheoMAHD(String maHD);

}

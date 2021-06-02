package com.binh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binh.model.NhanVien;
import com.binh.repository.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	
	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	@Override
	public List<NhanVien> layDanhSachNhanVien() {
		// TODO Auto-generated method stub
		return nhanVienRepository.findAll();
	}
	
	
}

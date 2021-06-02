package com.binh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.binh.model.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

}

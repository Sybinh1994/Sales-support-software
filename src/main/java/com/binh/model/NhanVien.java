package com.binh.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	
	@Id 
	@Column(name = "ma_NV", nullable=false, length=20)
	private String maNV;
	
	@Column(name = "ten_NV", nullable=false, length=20)
	private String tenNV;
	
	@Column(name = "vi_TRINV", nullable=false, length=20)
	private String viTRINV;

	public NhanVien() {
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getViTRINV() {
		return viTRINV;
	}

	public void setViTRINV(String viTRINV) {
		this.viTRINV = viTRINV;
	}
	
	

}

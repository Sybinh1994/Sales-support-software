package com.binh.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hoadon")
public class HoaDon {
	
	@Id 
	@Column(name = "ma_HD", nullable=false, length=10)
	private String maHD;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ma_NV", nullable = false)
	private NhanVien nhanVIEN;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ma_BANAN", nullable = false)
	private BanAn banAN;
	
	@Column(name = "ten_KH", nullable=false, length=20)
	private String tenKH;
	
	@Column(name = "dia_CHIKH", nullable=false, length=40)
	private String diaCHIKH;
	
	@Column(name = "so_DIENTHOAI", nullable=false, length=10)
	private String soDIENTHOAI;
	
	@Column(name = "thoi_GIAN", nullable=false)
	private Date thoiGIAN;
	
	@Column(name = "tong_TIEN", nullable=false)
	private int tongTIEN;

	public HoaDon() {
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public NhanVien getNhanVIEN() {
		return nhanVIEN;
	}

	public void setNhanVIEN(NhanVien nhanVIEN) {
		this.nhanVIEN = nhanVIEN;
	}

	public BanAn getBanAN() {
		return banAN;
	}

	public void setBanAN(BanAn banAN) {
		this.banAN = banAN;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getDiaCHIKH() {
		return diaCHIKH;
	}

	public void setDiaCHIKH(String diaCHIKH) {
		this.diaCHIKH = diaCHIKH;
	}

	public String getSoDIENTHOAI() {
		return soDIENTHOAI;
	}

	public void setSoDIENTHOAI(String soDIENTHOAI) {
		this.soDIENTHOAI = soDIENTHOAI;
	}

	public Date getThoiGIAN() {
		return thoiGIAN;
	}

	public void setThoiGIAN(Date thoiGIAN) {
		this.thoiGIAN = thoiGIAN;
	}

	public int getTongTIEN() {
		return tongTIEN;
	}

	public void setTongTIEN(int tongTIEN) {
		this.tongTIEN = tongTIEN;
	}
	
	
	
}

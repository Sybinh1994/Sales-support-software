package com.binh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banan")
public class BanAn {
	
	@Id
	@Column(name = "ma_BANAN")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maBANAN;
	
	@Column(name = "tinh_TRANG")
	private boolean tinhTRANG;

	public BanAn() {
	}

	public long getMaBANAN() {
		return maBANAN;
	}

	public void setMaBANAN(long maBANAN) {
		this.maBANAN = maBANAN;
	}

	public boolean isTinhTRANG() {
		return tinhTRANG;
	}

	public void setTinhTRANG(boolean tinhTRANG) {
		this.tinhTRANG = tinhTRANG;
	}
	
	
	

}

package org.example.case_module3.model;

import java.util.Date;

public class PhieuThu {
    private String ma_phieu;
    private String ma_nha;
    private String ma_nv;
    private String ma_kh;
    private Date ngay_thu;
    private double so_tien_thu;

    public PhieuThu() {
    }

    public PhieuThu(String ma_nha, String ma_nv, String ma_kh, Date ngay_thu, double so_tien_thu) {
        this.ma_nha = ma_nha;
        this.ma_nv = ma_nv;
        this.ma_kh = ma_kh;
        this.ngay_thu = ngay_thu;
        this.so_tien_thu = so_tien_thu;
    }

    public PhieuThu(String ma_phieu, String ma_nha, String ma_nv, String ma_kh, Date ngay_thu, double so_tien_thu) {
        this.ma_phieu = ma_phieu;
        this.ma_nha = ma_nha;
        this.ma_nv = ma_nv;
        this.ma_kh = ma_kh;
        this.ngay_thu = ngay_thu;
        this.so_tien_thu = so_tien_thu;
    }

    public String getMa_phieu() {
        return ma_phieu;
    }

    public void setMa_phieu(String ma_phieu) {
        this.ma_phieu = ma_phieu;
    }

    public String getMa_nha() {
        return ma_nha;
    }

    public void setMa_nha(String ma_nha) {
        this.ma_nha = ma_nha;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getMa_kh() {
        return ma_kh;
    }

    public void setMa_kh(String ma_kh) {
        this.ma_kh = ma_kh;
    }

    public Date getNgay_thu() {
        return ngay_thu;
    }

    public void setNgay_thu(Date ngay_thu) {
        this.ngay_thu = ngay_thu;
    }

    public double getSo_tien_thu() {
        return so_tien_thu;
    }

    public void setSo_tien_thu(double so_tien_thu) {
        this.so_tien_thu = so_tien_thu;
    }
}

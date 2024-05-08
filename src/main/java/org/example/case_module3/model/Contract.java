package org.example.case_module3.model;

import java.util.Date;

public class HopDong {
    private String ma_hd;
    private String ma_nha;
    private String ma_kh;
    private String ma_nv;
    private Date ngay_hd;
    private double gia_thue;
    private double tien_dat_coc;
    private String dieu_khoan;

    public HopDong() {
    }

    public HopDong(String ma_nha, String ma_kh, String ma_nv, Date ngay_hd, double gia_thue, double tien_dat_coc, String dieu_khoan) {
        this.ma_nha = ma_nha;
        this.ma_kh = ma_kh;
        this.ma_nv = ma_nv;
        this.ngay_hd = ngay_hd;
        this.gia_thue = gia_thue;
        this.tien_dat_coc = tien_dat_coc;
        this.dieu_khoan = dieu_khoan;
    }

    public HopDong(String ma_hd, String ma_nha, String ma_kh, String ma_nv, Date ngay_hd, double gia_thue, double tien_dat_coc, String dieu_khoan) {
        this.ma_hd = ma_hd;
        this.ma_nha = ma_nha;
        this.ma_kh = ma_kh;
        this.ma_nv = ma_nv;
        this.ngay_hd = ngay_hd;
        this.gia_thue = gia_thue;
        this.tien_dat_coc = tien_dat_coc;
        this.dieu_khoan = dieu_khoan;
    }

    public String getMa_hd() {
        return ma_hd;
    }

    public void setMa_hd(String ma_hd) {
        this.ma_hd = ma_hd;
    }

    public String getMa_nha() {
        return ma_nha;
    }

    public void setMa_nha(String ma_nha) {
        this.ma_nha = ma_nha;
    }

    public String getMa_kh() {
        return ma_kh;
    }

    public void setMa_kh(String ma_kh) {
        this.ma_kh = ma_kh;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public Date getNgay_hd() {
        return ngay_hd;
    }

    public void setNgay_hd(Date ngay_hd) {
        this.ngay_hd = ngay_hd;
    }

    public double getGia_thue() {
        return gia_thue;
    }

    public void setGia_thue(double gia_thue) {
        this.gia_thue = gia_thue;
    }

    public double getTien_dat_coc() {
        return tien_dat_coc;
    }

    public void setTien_dat_coc(double tien_dat_coc) {
        this.tien_dat_coc = tien_dat_coc;
    }

    public String getDieu_khoan() {
        return dieu_khoan;
    }

    public void setDieu_khoan(String dieu_khoan) {
        this.dieu_khoan = dieu_khoan;
    }
}

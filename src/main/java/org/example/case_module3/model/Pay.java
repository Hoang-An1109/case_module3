package org.example.case_module3.model;

import java.util.Date;

public class Thanh_Toan {
    private String ma_hd_tt;
    private String ma_kh;
    private String ma_nv;
    private Date ngay_tt;
    private String ly_do;
    private String ho_so_kem;
    private double tien_thanh_toan;

    public Thanh_Toan() {
    }

    public Thanh_Toan(String ma_kh, String ma_nv, Date ngay_tt, String ly_do, String ho_so_kem, double tien_thanh_toan) {
        this.ma_kh = ma_kh;
        this.ma_nv = ma_nv;
        this.ngay_tt = ngay_tt;
        this.ly_do = ly_do;
        this.ho_so_kem = ho_so_kem;
        this.tien_thanh_toan = tien_thanh_toan;
    }

    public Thanh_Toan(String ma_hd_tt, String ma_kh, String ma_nv, Date ngay_tt, String ly_do, String ho_so_kem, double tien_thanh_toan) {
        this.ma_hd_tt = ma_hd_tt;
        this.ma_kh = ma_kh;
        this.ma_nv = ma_nv;
        this.ngay_tt = ngay_tt;
        this.ly_do = ly_do;
        this.ho_so_kem = ho_so_kem;
        this.tien_thanh_toan = tien_thanh_toan;
    }

    public String getMa_hd_tt() {
        return ma_hd_tt;
    }

    public void setMa_hd_tt(String ma_hd_tt) {
        this.ma_hd_tt = ma_hd_tt;
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

    public Date getNgay_tt() {
        return ngay_tt;
    }

    public void setNgay_tt(Date ngay_tt) {
        this.ngay_tt = ngay_tt;
    }

    public String getLy_do() {
        return ly_do;
    }

    public void setLy_do(String ly_do) {
        this.ly_do = ly_do;
    }

    public String getHo_so_kem() {
        return ho_so_kem;
    }

    public void setHo_so_kem(String ho_so_kem) {
        this.ho_so_kem = ho_so_kem;
    }

    public double getTien_thanh_toan() {
        return tien_thanh_toan;
    }

    public void setTien_thanh_toan(double tien_thanh_toan) {
        this.tien_thanh_toan = tien_thanh_toan;
    }
}

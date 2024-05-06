package org.example.case_module3.model;

import java.util.Date;

public class BienBanSuCo {
    private String ma_bb_sc;
    private String ma_nha;
    private String ma_kh;
    private String ma_nv;
    private String ten_sc;
    private Date ngay_bb;
    private String noi_dung_sc;
    private double tien_phat;

    public BienBanSuCo() {
    }

    public BienBanSuCo(String ma_nha, String ma_kh, String ma_nv, String ten_sc, Date ngay_bb, String noi_dung_sc, double tien_phat) {
        this.ma_nha = ma_nha;
        this.ma_kh = ma_kh;
        this.ma_nv = ma_nv;
        this.ten_sc = ten_sc;
        this.ngay_bb = ngay_bb;
        this.noi_dung_sc = noi_dung_sc;
        this.tien_phat = tien_phat;
    }

    public BienBanSuCo(String ma_bb_sc, String ma_nha, String ma_kh, String ma_nv, String ten_sc, Date ngay_bb, String noi_dung_sc, double tien_phat) {
        this.ma_bb_sc = ma_bb_sc;
        this.ma_nha = ma_nha;
        this.ma_kh = ma_kh;
        this.ma_nv = ma_nv;
        this.ten_sc = ten_sc;
        this.ngay_bb = ngay_bb;
        this.noi_dung_sc = noi_dung_sc;
        this.tien_phat = tien_phat;
    }

    public String getMa_bb_sc() {
        return ma_bb_sc;
    }

    public void setMa_bb_sc(String ma_bb_sc) {
        this.ma_bb_sc = ma_bb_sc;
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

    public String getTen_sc() {
        return ten_sc;
    }

    public void setTen_sc(String ten_sc) {
        this.ten_sc = ten_sc;
    }

    public Date getNgay_bb() {
        return ngay_bb;
    }

    public void setNgay_bb(Date ngay_bb) {
        this.ngay_bb = ngay_bb;
    }

    public String getNoi_dung_sc() {
        return noi_dung_sc;
    }

    public void setNoi_dung_sc(String noi_dung_sc) {
        this.noi_dung_sc = noi_dung_sc;
    }

    public double getTien_phat() {
        return tien_phat;
    }

    public void setTien_phat(double tien_phat) {
        this.tien_phat = tien_phat;
    }
}

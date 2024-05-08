package org.example.case_module3.model;

public class KhachHang {
    private String ma_kh;
    private String ten_kh;
    private int cmt_kh;
    private int dien_thoai_kh;
    private String dia_chi_lh;

    public KhachHang() {
    }

    public KhachHang(String ten_kh, int cmt_kh, int dien_thoai_kh, String dia_chi_lh) {
        this.ten_kh = ten_kh;
        this.cmt_kh = cmt_kh;
        this.dien_thoai_kh = dien_thoai_kh;
        this.dia_chi_lh = dia_chi_lh;
    }

    public KhachHang(String ma_kh, String ten_kh, int cmt_kh, int dien_thoai_kh, String dia_chi_lh) {
        this.ma_kh = ma_kh;
        this.ten_kh = ten_kh;
        this.cmt_kh = cmt_kh;
        this.dien_thoai_kh = dien_thoai_kh;
        this.dia_chi_lh = dia_chi_lh;
    }

    public String getMa_kh() {
        return ma_kh;
    }

    public void setMa_kh(String ma_kh) {
        this.ma_kh = ma_kh;
    }

    public String getTen_kh() {
        return ten_kh;
    }

    public void setTen_kh(String ten_kh) {
        this.ten_kh = ten_kh;
    }

    public int getCmt_kh() {
        return cmt_kh;
    }

    public void setCmt_kh(int cmt_kh) {
        this.cmt_kh = cmt_kh;
    }

    public int getDien_thoai_kh() {
        return dien_thoai_kh;
    }

    public void setDien_thoai_kh(int dien_thoai_kh) {
        this.dien_thoai_kh = dien_thoai_kh;
    }

    public String getDia_chi_lh() {
        return dia_chi_lh;
    }

    public void setDia_chi_lh(String dia_chi_lh) {
        this.dia_chi_lh = dia_chi_lh;
    }
}

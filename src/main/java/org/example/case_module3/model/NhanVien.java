package org.example.case_module3.model;

public class NhanVien {
    private String ma_nv;
    private String ten_nv;
    private String vai_tro;
    private int cmt_nv;
    private int dien_thoai_nv;

    public NhanVien() {
    }

    public NhanVien(String ten_nv, String vai_tro, int cmt_nv, int dien_thoai_nv) {
        this.ten_nv = ten_nv;
        this.vai_tro = vai_tro;
        this.cmt_nv = cmt_nv;
        this.dien_thoai_nv = dien_thoai_nv;
    }

    public NhanVien(String ma_nv, String ten_nv, String vai_tro, int cmt_nv, int dien_thoai_nv) {
        this.ma_nv = ma_nv;
        this.ten_nv = ten_nv;
        this.vai_tro = vai_tro;
        this.cmt_nv = cmt_nv;
        this.dien_thoai_nv = dien_thoai_nv;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getTen_nv() {
        return ten_nv;
    }

    public void setTen_nv(String ten_nv) {
        this.ten_nv = ten_nv;
    }

    public String getVai_tro() {
        return vai_tro;
    }

    public void setVai_tro(String vai_tro) {
        this.vai_tro = vai_tro;
    }

    public int getCmt_nv() {
        return cmt_nv;
    }

    public void setCmt_nv(int cmt_nv) {
        this.cmt_nv = cmt_nv;
    }

    public int getDien_thoai_nv() {
        return dien_thoai_nv;
    }

    public void setDien_thoai_nv(int dien_thoai_nv) {
        this.dien_thoai_nv = dien_thoai_nv;
    }
}

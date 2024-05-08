package org.example.case_module3.model;

public class Motel {
    private String ma_nha;
    private String dia_chi;
    private double dien_tich;
    private double don_gia;
    private String trang_thai;

    public Motel() {
    }

    public Motel(String dia_chi, double dien_tich, double don_gia, String trang_thai) {
        this.dia_chi = dia_chi;
        this.dien_tich = dien_tich;
        this.don_gia = don_gia;
        this.trang_thai = trang_thai;
    }

    public Motel(String ma_nha, String dia_chi, double dien_tich, double don_gia, String trang_thai) {
        this.ma_nha = ma_nha;
        this.dia_chi = dia_chi;
        this.dien_tich = dien_tich;
        this.don_gia = don_gia;
        this.trang_thai = trang_thai;
    }

    public String getMa_nha() {
        return ma_nha;
    }

    public void setMa_nha(String ma_nha) {
        this.ma_nha = ma_nha;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public double getDien_tich() {
        return dien_tich;
    }

    public void setDien_tich(double dien_tich) {
        this.dien_tich = dien_tich;
    }

    public double getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(double don_gia) {
        this.don_gia = don_gia;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
    }
}

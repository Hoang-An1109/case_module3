create database quanlynhachothue;

use quanlynhachothue;

create table nhachothue(
ma_nha varchar(10) primary key,
dia_chi varchar(50) not null,
dien_tich double not null,
don_gia double not null,
trang_thai varchar(10) not null
);

create table nhanvien(
ma_nv varchar(10) primary key,
ten_nv varchar(30) not null,
vai_tro varchar(50) not null,
cmt_nv int,
dien_thoai_nv int
);

create table khachhang(
ma_kh varchar(10) primary key,
ten_kh varchar(30) not null,
cmt_kh int,
dien_thoai_kh int,
dia_chi_lh varchar(50)
);

create table hopdong(
ma_hop_dong varchar(10) primary key,
ma_nha varchar(10) not null,
ma_kh varchar(10) not null,
ma_nv varchar(10) not null,
ngay_hd date not null,
gia_thue double not null,
tien_dat_coc double,
dieu_khoan varchar(255),
foreign key(ma_nha) references nhachothue(ma_nha),
foreign key(ma_kh) references khachhang(ma_kh),
foreign key(ma_nv) references nhanvien(ma_nv) 
);

create table phieuthu(
ma_phieu varchar(10) primary key,
ma_nha varchar(10) not null,
ma_nv varchar(10) not null,
ma_kh varchar(10) not null,
ngay_thu date not null,
so_tien double not null,
foreign key(ma_nha) references nhachothue(ma_nha),
foreign key(ma_kh) references khachhang(ma_kh),
foreign key(ma_nv) references nhanvien(ma_nv) 
);

create table thanhtoan(
ma_hd_tt varchar(10) primary key,
ma_kh varchar(10) not null,
ma_nv varchar(10) not null,
ngay_tt date,
ly_do varchar(30),
ho_so_kem varchar(30),
tien_tt double,
foreign key(ma_kh) references khachhang(ma_kh),
foreign key(ma_nv) references nhanvien(ma_nv)
);

create table bienbansuco(
ma_bb_sc varchar(10) primary key,
ma_nha varchar(10) not null,
ma_kh varchar(10) not null,
ma_nv varchar(10) not null,
ten_sc varchar(30),
ngay_bb date,
noi_dung_sc varchar(255),
tien_phat double,
foreign key(ma_nha) references nhachothue(ma_nha),
foreign key(ma_kh) references khachhang(ma_kh),
foreign key(ma_nv) references nhanvien(ma_nv) 
);









































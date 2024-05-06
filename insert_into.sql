use quanlynhachothue;

-- Thêm dữ liệu vào bảng nhachothue
INSERT INTO nhachothue (ma_nha, dia_chi, dien_tich, don_gia, trang_thai) VALUES
('NT001', '123 Đường ABC', 100, 2000000, 'Trống'),
('NT002', '456 Đường XYZ', 150, 2500000, 'Đã Thuê'),
('NT003', '789 Đường DEF', 120, 1800000, 'Trống'),
('NT004', '101 Đường GHI', 90, 1500000, 'Trống'),
('NT005', '202 Đường JKL', 200, 3000000, 'Đã Thuê'),
('NT006', '303 Đường MNO', 80, 1200000, 'Trống'),
('NT007', '404 Đường PQR', 110, 1600000, 'Trống'),
('NT008', '505 Đường STU', 130, 2200000, 'Đã Thuê'),
('NT009', '606 Đường VWX', 180, 2700000, 'Trống'),
('NT010', '707 Đường YZA', 95, 1400000, 'Trống');

-- Thêm dữ liệu vào bảng nhanvien
INSERT INTO nhanvien (ma_nv, ten_nv, vai_tro, cmt_nv, dien_thoai_nv) VALUES
('NV001', 'Nguyễn Văn A', 'Quản lý', 123456789, 987654321),
('NV002', 'Trần Thị B', 'Nhân viên', 456789123, 789456123),
('NV003', 'Lê Văn C', 'Nhân viên', 789123456, 654123789),
('NV004', 'Phạm Thị D', 'Nhân viên', 321654987, 987321654),
('NV005', 'Hoàng Văn E', 'Nhân viên', 654987321, 321654987);

-- Thêm dữ liệu vào bảng khachhang
INSERT INTO khachhang (ma_kh, ten_kh, cmt_kh, dien_thoai_kh, dia_chi_lh) VALUES
('KH001', 'Nguyễn Thị X', 123456789, 987654321, '123 Đường ABC'),
('KH002', 'Trần Văn Y', 456789123, 789456123, '456 Đường XYZ'),
('KH003', 'Lê Thị Z', 789123456, 654123789, '789 Đường DEF'),
('KH004', 'Phạm Văn K', 321654987, 987321654, '101 Đường GHI'),
('KH005', 'Hoàng Thị L', 654987321, 321654987, '202 Đường JKL'),
('KH006', 'Trương Văn M', 789456123, 654789321, '303 Đường MNO'),
('KH007', 'Mai Thị N', 456123789, 321987654, '404 Đường PQR'),
('KH008', 'Đặng Văn P', 789654123, 987321456, '505 Đường STU');

-- Thêm dữ liệu vào bảng hopdong
INSERT INTO hopdong (ma_hop_dong, ma_nha, ma_kh, ma_nv, ngay_hd, gia_thue, tien_dat_coc, dieu_khoan) VALUES
('HD001', 'NT001', 'KH001', 'NV001', '2024-05-06', 2500000, 3000000, 'Điều khoản 1'),
('HD002', 'NT002', 'KH002', 'NV002', '2024-05-07', 2800000, 3200000, 'Điều khoản 2'),
('HD003', 'NT003', 'KH003', 'NV003', '2024-05-08', 2200000, 2700000, 'Điều khoản 3'),
('HD004', 'NT004', 'KH004', 'NV004', '2024-05-09', 2000000, 2500000, 'Điều khoản 4'),
('HD005', 'NT005', 'KH005', 'NV005', '2024-05-10', 3000000, 3500000, 'Điều khoản 5'),
('HD006', 'NT006', 'KH006', 'NV001', '2024-05-11', 1800000, 2300000, 'Điều khoản 6'),
('HD007', 'NT007', 'KH007', 'NV002', '2024-05-12', 2100000, 2600000, 'Điều khoản 7'),
('HD008', 'NT008', 'KH008', 'NV003', '2024-05-13', 2400000, 2900000, 'Điều khoản 8'),
('HD009', 'NT009', 'KH001', 'NV004', '2024-05-14', 2700000, 3200000, 'Điều khoản 9'),
('HD010', 'NT010', 'KH002', 'NV005', '2024-05-15', 1900000, 2400000, 'Điều khoản 10');

-- Thêm dữ liệu vào bảng phieuthu
INSERT INTO phieuthu (ma_phieu, ma_nha, ma_nv, ma_kh, ngay_thu, so_tien) VALUES
('PT001', 'NT001', 'NV001', 'KH001', '2024-05-06', 2500000),
('PT002', 'NT002', 'NV002', 'KH002', '2024-05-07', 2800000),
('PT003', 'NT003', 'NV003', 'KH003', '2024-05-08', 2200000),
('PT004', 'NT004', 'NV004', 'KH004', '2024-05-09', 2000000),
('PT005', 'NT005', 'NV005', 'KH005', '2024-05-10', 3000000),
('PT006', 'NT006', 'NV001', 'KH006', '2024-05-11', 1800000),
('PT007', 'NT007', 'NV002', 'KH007', '2024-05-12', 2100000),
('PT008', 'NT008', 'NV003', 'KH008', '2024-05-13', 2400000),
('PT009', 'NT009', 'NV004', 'KH001', '2024-05-14', 2700000),
('PT010', 'NT010', 'NV005', 'KH002', '2024-05-15', 1900000),
('PT011', 'NT001', 'NV001', 'KH003', '2024-05-16', 2200000),
('PT012', 'NT002', 'NV002', 'KH004', '2024-05-17', 2600000),
('PT013', 'NT003', 'NV003', 'KH005', '2024-05-18', 1800000),
('PT014', 'NT004', 'NV004', 'KH006', '2024-05-19', 2100000),
('PT015', 'NT005', 'NV005', 'KH007', '2024-05-20', 2400000);

-- Thêm dữ liệu vào bảng thanhtoan
INSERT INTO thanhtoan (ma_hd_tt, ma_kh, ma_nv, ngay_tt, ly_do, ho_so_kem, tien_tt) VALUES
('TT001', 'KH001', 'NV001', '2024-05-06', 'Thanh toán đúng hạn', 'File 1', 2500000),
('TT002', 'KH002', 'NV002', '2024-05-07', 'Thanh toán đúng hạn', 'File 2', 2800000),
('TT003', 'KH003', 'NV003', '2024-05-08', 'Thanh toán đúng hạn', 'File 3', 2200000),
('TT004', 'KH004', 'NV004', '2024-05-09', 'Thanh toán đúng hạn', 'File 4', 2000000),
('TT005', 'KH005', 'NV005', '2024-05-10', 'Thanh toán đúng hạn', 'File 5', 3000000),
('TT006', 'KH001', 'NV001', '2024-05-11', 'Thanh toán đúng hạn', 'File 6', 1800000),
('TT007', 'KH002', 'NV002', '2024-05-12', 'Thanh toán đúng hạn', 'File 7', 2100000),
('TT008', 'KH003', 'NV003', '2024-05-13', 'Thanh toán đúng hạn', 'File 8', 2400000),
('TT009', 'KH004', 'NV004', '2024-05-14', 'Thanh toán đúng hạn', 'File 9', 2700000),
('TT010', 'KH005', 'NV005', '2024-05-15', 'Thanh toán đúng hạn', 'File 10', 1900000),
('TT011', 'KH001', 'NV001', '2024-05-16', 'Thanh toán đúng hạn', 'File 11', 2200000),
('TT012', 'KH002', 'NV002', '2024-05-17', 'Thanh toán đúng hạn', 'File 12', 2600000),
('TT013', 'KH003', 'NV003', '2024-05-18', 'Thanh toán đúng hạn', 'File 13', 1800000),
('TT014', 'KH004', 'NV004', '2024-05-19', 'Thanh toán đúng hạn', 'File 14', 2100000),
('TT015', 'KH005', 'NV005', '2024-05-20', 'Thanh toán đúng hạn', 'File 15', 2400000);

-- Thêm dữ liệu vào bảng bienbansuco
INSERT INTO bienbansuco (ma_bb_sc, ma_nha, ma_kh, ma_nv, ten_sc, ngay_bb, noi_dung_sc, tien_phat) VALUES
('BB001', 'NT001', 'KH001', 'NV001', 'Lỗi sửa chữa', '2024-05-06', 'Bị hỏng cửa', 100000),
('BB002', 'NT002', 'KH002', 'NV002', 'Lỗi sửa chữa', '2024-05-07', 'Hỏng ống nước', 150000),
('BB003', 'NT003', 'KH003', 'NV003', 'Lỗi sửa chữa', '2024-05-08', 'Hỏng ổ cắm điện', 120000),
('BB004', 'NT004', 'KH004', 'NV004', 'Lỗi sửa chữa', '2024-05-09', 'Thiếu cửa sổ', 80000),
('BB005', 'NT005', 'KH005', 'NV005', 'Lỗi sửa chữa', '2024-05-10', 'Hỏng máy lạnh', 200000);
package org.example.case_module3.service.khachHangService;

import org.example.case_module3.model.Client;

import java.sql.SQLException;
import java.util.List;

public class KhachHangDAO implements IKhachHangDAO {
    private String jdbcURL ="jdbc:mysql://localhost:3306/quanlynhachothue";
    private String jdbcUsername = "root";
    private String jdbcPassword = "hoangan1109";

    private static final String INSERT_INTO_KHACHHANG= "INSERT INTO khachhang(ma_nha, dia_chi, dien_tich, don_gia, trang_thai) VALUES (?, ?, ?, ?, ?);";

    public KhachHangDAO() {
    }

    @Override
    public void insert(Client client) throws SQLException {

    }

    @Override
    public Client selectByMa(String ma) {
        return null;
    }

    @Override
    public List<Client> selectAll() {
        return null;
    }

    @Override
    public boolean deleteByMa(String ma) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Client client) throws SQLException {
        return false;
    }
}

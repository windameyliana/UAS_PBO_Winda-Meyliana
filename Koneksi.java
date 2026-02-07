package ds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // URL koneksi ke database perpustakaan
                String url = "jdbc:mysql://localhost:3306/perpustakaan";
                String user = "root";
                String pass = ""; // default XAMPP

                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e) {
                System.out.println("Koneksi Gagal");
                e.printStackTrace();
            }
        }
        return koneksi;
    }

    // untuk test koneksi
    public static void main(String[] args) {
        getConnection();
    }
}

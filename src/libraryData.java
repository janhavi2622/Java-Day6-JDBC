package day6;
import java.sql.*;

public class libraryData {
    static final String DB_URL = "jdbc:mysql://localhost:3306/library";
    static final String USER = "root";
    static final String PASS = "Janu@2002";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            // 1. INSERT
            String insertBook = "INSERT INTO books (title, author, year) VALUES ('The Alchemist', 'Paulo Coelho', 1988)";
            stmt.executeUpdate(insertBook);
            System.out.println("Inserted book.");

            // 2. SELECT
            String selectBooks = "SELECT * FROM books";
            ResultSet rs = stmt.executeQuery(selectBooks);
            System.out.println("\nBook Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + ", " +
                        rs.getString("title") + ", " +
                        rs.getString("author") + ", " +
                        rs.getInt("year")
                );
            }

            // 3. UPDATE
            String updateBook = "UPDATE books SET year = 1993 WHERE title = 'The Alchemist'";
            stmt.executeUpdate(updateBook);
            System.out.println("\nUpdated book year.");

            // 4. DELETE
            String deleteBook = "DELETE FROM books WHERE title = 'The Alchemist'";
            stmt.executeUpdate(deleteBook);
            System.out.println("Deleted book.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewStudents {
    public void viewAllStudents() {
        String sql = "SELECT * FROM studentInfo";

        try (Connection con = DBConnection.getConnection();
             Statement stat = con.createStatement();
             ResultSet rs = stat.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddStudent {
    public void addStudent(int id, String name, int age) {
        String sql = "INSERT INTO studentInfo (id, name, age) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student added successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

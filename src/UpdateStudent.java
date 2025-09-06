import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStudent {
    public void updateStudent(int id, String newName, int newAge) {
        String sql = "UPDATE studentInfo SET name = ?, age = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setInt(2, newAge);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("No student found with ID " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

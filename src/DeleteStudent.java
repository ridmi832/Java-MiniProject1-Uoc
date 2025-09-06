import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {
    public void deleteStudent(int id) {
        String sql = "DELETE FROM studentInfo WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("No student found with ID " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

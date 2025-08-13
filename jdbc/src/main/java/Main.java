import javax.xml.transform.Result;
import java.sql.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/phiro_multi";
        String dbUser = "postgres";
        String dbPass = "postgres";
        Connection conn;
        try {
            //start connection to db
            Properties props = new Properties();
            props.setProperty("user", dbUser);
            props.setProperty("password", dbPass);
            props.setProperty("currentSchema", "phirakasinergi");
            conn = DriverManager.getConnection(dbUrl, props);


            String query = "SELECT * FROM app_workflows WHERE is_deleted = 0";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            


            System.out.println("connection success");
            while (rs.next()) {
                System.out.println(rs.getString("workflow_name"));
            }

            conn.close();

        } catch (SQLException e) { //with oop we can catch different exception type
            System.out.println("DB Connection Error");
        }


    }
}

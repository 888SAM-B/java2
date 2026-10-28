import java.sql.*;
public class ex9 {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/col?sslMode=disable","root","");
            System.out.println("DB connected Successfully");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM EMP");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + rs.getString("name")
                );
            }

        }catch(Exception e){
        System.out.println(e);
        }
    }
}

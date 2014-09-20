package hospital;


import java.sql.*;
public class Database {
    Connection con;
    Statement stmt;
    PreparedStatement ps;
    ResultSet r;

    Database() {
        con=null;
        stmt=null;
        ps=null;
    }
    public void getConnection() {
       try {
	String driverName="oracle.jdbc.OracleDriver";
	Class.forName(driverName);
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","pramiti123");
	stmt=con.createStatement();
       }
       catch(Exception e) {}
    }
    public void closeAll() {
        try {
            if(stmt!=null) {
                stmt.close();
            }
            if(ps!=null) {
                ps.close();
            }
            if(con!=null) {
                con.close();
            }
        }
        catch(Exception e){}
    }
}

package conexion;

import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.Connection;
//import java.sql.PreparedStatement;

public class BaseConexion {
    protected Connection conexion;
    
    protected void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_estudiantes?useSSL=false&serverTimeZone=UTC&useUnicode=True&characterEncoding=utf-8", "root", "root");
            
        } catch (Exception e) {
            System.out.println("error: Conectar"  + e);
        }
                
    }
    
    protected void desconectar(){
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("error: Desconectar"  + e);
        }
    }
}

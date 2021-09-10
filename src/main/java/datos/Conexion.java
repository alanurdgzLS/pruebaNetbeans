
package datos;

import java.sql.*;

/**
 *
 * @author uriel
 */
public class Conexion {
    //GENERAR LAS CONSTANTES DE CREDENCIALES PARA LA BD
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/prueba?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin123";
    
   public static Connection getConnection(){
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD );
    }///
    
}

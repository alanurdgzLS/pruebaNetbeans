
package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author uriel
 */
public class test {
    public static void main (String[] args){
    //EMPEZAR LA CONEXION A MYSQL
    String url = "jdbc:mysql://localhost:3306/prueba?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //WEB INTERFACE PARA PODER CONECTARNOS POR MEDIO DE UN NOMBRE GENERICO AL DRIVER DE MYSQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "admin123");
            Statement intruccion = conexion.createStatement();
            String sql = " SELECT id_persona, nombre, apellido, email, telefono FROM prueba.persona ";
            ResultSet resultado = intruccion.executeQuery(sql);//EJECUTA LA CONSULTA DE INSTRUCCION
            //PARA RECORRER LOS ELEMENTOS QUE HAY EN LA CONSULTA
            while(resultado.next()){
                System.out.println("Id Persona:"+resultado.getString("id_persona"));
                System.out.println("Nombre:"+resultado.getString("nombre"));
                System.out.println("Apellidos:"+resultado.getString("apellido"));
                System.out.println("Email:"+resultado.getString("email"));
                System.out.println("telefono:"+resultado.getString("telefono"));
                System.out.println("\n");
            }
            //CERRAR SESION
            resultado.close();
            intruccion.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace( System.out );
        } catch (SQLException ex) {
            ex.printStackTrace( System.out );
        }
}
            
           
            
    
}

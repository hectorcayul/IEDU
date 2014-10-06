package Modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexionBD {

    private  Connection conexion=null;
    private String servidor="db.inf.uct.cl";
    private String database="hcayul2011"; 
    private String usuario="hcayul2011";
    private String password="hcayul2011";
    private String url="";
    
    
    public conexionBD(){
        try {

            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+servidor+"/"+database;
            	conexion=DriverManager.getConnection(url, usuario, password);
        

        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public Connection getConexion(){
        return conexion;
    }

    public void close(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conexion=null;
    }
}
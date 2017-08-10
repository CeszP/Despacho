package backend;

/**
 *
 * @author Cesz
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Hola!!
public class ControlBD {
    /*::::DEFINICIÓN DE VARIABLES::::*/
    /*VARIABLES MySQL*/
    private static Connection conn;
    public static ResultSet rs;
    public static ResultSetMetaData rsmd;
    private static Statement st;
    
    /*VARIABLES GENÉRICAS*/
    public static String estado = null;
    public static String tabla = null;
    private static String sql = null;
    
    /*VARIABLES PARÁMETROS TABLAS*/
    private static int columna;
    private static String fila[];
    
    /*CONSTANTES INICIALIZADAS*/
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pswrd = "";
    private static final String url = "jdbc:mysql://localhost:3306/libreria";
    
       
   public Connection conectar(){
       conn = null;
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pswrd);
            estado = "conectado";
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            estado = "desconectado";
        }       
        return conn;
    }
   
   public DefaultTableModel tablaPrueba() throws SQLException{
       /*Pasamos el nombre de la tabla que deseamos utilizar en mysql para crear
       la conexión necesaria y obtener los registros requeridos.*/
       tabla = "prueba2" ;
        /**
        *-(st)Se crea una sentencia con el valor retornado por la conexión a sql.
        * -(sql) Se asigna valor a una String, para que ésta sea utilizada como
        * consulta.
        * (rs) A un resultset se le pasa la consulta para obtener el resultado 
        * mediante excecuteQuery, utilizando como parámetro la String sql.
        * -(rsmd) A un ResultSetMetaData se asigna el resultset anterior, para
        * obtener cada renglón del resultado de la consulta en sql.
        * -*/
       st = conn.createStatement();
       sql = "select * from "+tabla;
       rs = st.executeQuery(sql);
       rsmd = rs.getMetaData();
       /*A la variable entera "columna" se le pasa el conteo de columnas obteni-
       das como cabeceras del ResultSetMetaData anteriormente utilizado.*/
       columna = rsmd.getColumnCount();
       /*Creación de un nuevo modelo de tabla DefaultTableModel llamado modelo*/
       DefaultTableModel modelo = new DefaultTableModel();
       /**Ciclo para obtener las etiquetas de columna contenidas en el ResultSet-
        * MetaData*/
       for(int i=1;i<=columna;i++){
           modelo.addColumn(rsmd.getColumnLabel(i));
       }
       /**Mientras existan registros en la consulta, se insertarán renglones
        mediante el ciclo para ser agregados al modelo de tabla.*/
       while (rs.next()){
            fila = new String[columna];
            for(int j=0; j < columna;j++){
                fila[j] =rs.getString(j+1);
            }
            modelo.addRow(fila);
        }
       /*El método retorna un modelo aplicable a cualquier jTable*/
       return modelo;
   }
      
}

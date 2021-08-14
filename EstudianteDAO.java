 package modeloVO;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import conexion.BaseConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO extends BaseConexion implements IEstudianteDAO{
    //New Methods
    //1. Insertar estudiante:
    @Override
    public boolean insertarEstudiante(modeloVO estudiante) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("insert into estudiantes (Nombres, Apellidos, Nacimiento, CorreoInst, CorreoPers, Celular, Fijo, Carrera) values(?,?,?,?,?,?,?,?)");
            sentencia.setString(1, estudiante.getNombres());
            sentencia.setString(2, estudiante.getApellidos());
            sentencia.setString(3, estudiante.getNacimiento());
            sentencia.setString(4, estudiante.getCorreoInst());
            sentencia.setString(5, estudiante.getCorreoPers());
            sentencia.setLong(6, estudiante.getCelular());
            sentencia.setLong(7, estudiante.getFijo());
            sentencia.setString(8, estudiante.getCarrera());
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("Error InsertarEstudiante." + e);
            return false;
        }
    }

    //2. Actualizar estudiante:
    @Override
    public boolean actualizarEstudiante(modeloVO estudiante) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("update estudiantes set Nombres=?, Apellidos=?, Nacimiento=?, where CorreoInst=?, CorreoPers=?, Celular=?, Fijo=?, Carrera=?");
            sentencia.setString(1, estudiante.getNombres());
            sentencia.setString(2, estudiante.getApellidos());
            sentencia.setString(3, estudiante.getNacimiento());
            sentencia.setString(4, estudiante.getCorreoInst());
            sentencia.setString(5, estudiante.getCorreoPers());
            sentencia.setLong(6, estudiante.getCelular());
            sentencia.setLong(7, estudiante.getFijo());
            sentencia.setString(8, estudiante.getCarrera());
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("Error actualizarEstudiante" + e);
            return false;
        }
    }
    
    //3. Eliminar estudiante:
    @Override
    public boolean eliminarEstudiante(String CorreoInst) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("delete from estudiantes where CorreoInst=?");
            sentencia.setString(1, CorreoInst);
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("Error eliminarEstudiante" + e);
            return false;
        }
    }
    //4. Consultar todos:
    @Override
    public List<modeloVO> consultarTodos() {
        try {
            List<modeloVO> estudiantes = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from estudiantes");
            ResultSet datos = sentencia.executeQuery();
            while(datos.next()){
                modeloVO estudiante = new modeloVO();
                estudiante.setNombres(datos.getString("Nombres"));
                estudiante.setApellidos(datos.getString("Apellidos"));
                estudiante.setNacimiento(datos.getString("Nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPers(datos.getString("CorreoPers"));
                estudiante.setCelular(datos.getLong("Celular"));
                estudiante.setFijo(datos.getLong("Fijo"));
                estudiante.setCarrera(datos.getString("Carrera"));
                estudiantes.add(estudiante);
            }
            desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error consultarTodos" + e);
            return null;
        }
    }
    //5. Consultar por correo:
    @Override
    public modeloVO consultarPorCorreo(String CorreoInst) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from estudiantes where CorreoInst=?");
            sentencia.setString(1, CorreoInst);
            ResultSet datos = sentencia.executeQuery();
            if(datos.next()){
                modeloVO estudiante = new modeloVO();
                estudiante.setNombres(datos.getString("Nombres"));
                estudiante.setApellidos(datos.getString("Apellidos"));
                estudiante.setNacimiento(datos.getString("Nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPers(datos.getString("CorreoPers"));
                estudiante.setCelular(datos.getLong("Celular"));
                estudiante.setFijo(datos.getLong("Fijo"));
                estudiante.setCarrera(datos.getString("Carrera"));
                desconectar();
                return estudiante;
            }else{
                desconectar();
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error consultarPorCorreo" + e);
            return null;
        }
    }
    //6. Consultar por apellido:
    @Override
    public List<modeloVO> consultarPorApellido(String Apellidos) {
        try {
            List<modeloVO> estudiantes = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from estudiantes where Apellidos=?");
            sentencia.setString(1, Apellidos);
            ResultSet datos = sentencia.executeQuery();
            while(datos.next()){
                modeloVO estudiante = new modeloVO();
                estudiante.setNombres(datos.getString("Nombres"));
                estudiante.setApellidos(datos.getString("Apellidos"));
                estudiante.setNacimiento(datos.getString("Nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPers(datos.getString("CorreoPers"));
                estudiante.setCelular(datos.getLong("Celular"));
                estudiante.setFijo(datos.getLong("Fijo"));
                estudiante.setCarrera(datos.getString("Carrera"));
                estudiantes.add(estudiante);
            }
            desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error consultar" + e);
            return null;
        }
    }
    //7. Consultar por programa:
    @Override
    public List<modeloVO> consultarPorPrograma(String Carrera) {
        try {
            List<modeloVO> estudiantes = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select Nombres, Apellidos from estudiantes where Carrera=?");
            sentencia.setString(1, Carrera);
            ResultSet datos = sentencia.executeQuery();
            while(datos.next()){
                modeloVO estudiante = new modeloVO();
                estudiante.setNombres(datos.getString("Nombres"));
                estudiante.setApellidos(datos.getString("Apellidos"));
                estudiantes.add(estudiante);
            }
            desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error consultarPorPrograma" + e);
            return null;
        }
    }
    //8. Consultar cantidad de estudiantes:
    @Override
    public int consultarCantidadEstudiantes(String Carrera) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select count(Nombres) from estudiantes where Carrera=?");
            sentencia.setString(1, Carrera);
            ResultSet datos = sentencia.executeQuery();
            if (datos.next()){
                int resultado = datos.getInt(1);
                desconectar();
                return resultado;
            }else{
                desconectar();
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Error consultarCantidadEstudiantes" + e);
            return -1;
        }
    }
    //9. Consultar por fecha de nacimiento:
    @Override
    public List<modeloVO> consultarPorFechaNacimiento(String Nacimiento) {
        try {
            List<modeloVO> estudiantes = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from estudiantes where Nacimiento=?");
            sentencia.setString(1, Nacimiento);
            ResultSet datos = sentencia.executeQuery();
            while(datos.next()){
                modeloVO estudiante = new modeloVO();
                estudiante.setNombres(datos.getString("Nombres"));
                estudiante.setApellidos(datos.getString("Apellidos"));
                estudiante.setNacimiento(datos.getString("Nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPers(datos.getString("CorreoPers"));
                estudiante.setCelular(datos.getLong("Celular"));
                estudiante.setFijo(datos.getLong("Fijo"));
                estudiante.setCarrera(datos.getString("Carrera"));
                estudiantes.add(estudiante);
            }desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error consultaPorFechaNacimiento" + e);
            return null;
        }
    }
    //10. Consultar por celular:
    @Override
    public modeloVO consultarPorCelular(Long Celular) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from estudiantes where Celular=?");
            sentencia.setLong(1, Celular);
            ResultSet datos = sentencia.executeQuery();
            if(datos.next()){
                modeloVO estudiante = new modeloVO();
                estudiante.setNombres(datos.getString("Nombres"));
                estudiante.setApellidos(datos.getString("Apellidos"));
                estudiante.setNacimiento(datos.getString("Nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPers(datos.getString("CorreoPers"));
                estudiante.setCelular(datos.getLong("Celular"));
                estudiante.setFijo(datos.getLong("Fijo"));
                estudiante.setCarrera(datos.getString("Carrera"));
                desconectar();
                return estudiante;
            }else{
                desconectar();
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error consultarPorCelular" + e);
            return null;
        }
    }
}

/*
    @Override
    public void guardarEstudiantes(List<modeloVO> estudiantes) {
        try {
            //Creación de la ruta.
            ObjectOutputStream objsalida = new ObjectOutputStream(new FileOutputStream("datos_estudiantes.dat"));
            //Recorrer.
            int i = 0;
            while(i < estudiantes.size()){
                objsalida.writeObject(estudiantes.get(i));
                i++;
            }
            objsalida.close();
            
        } catch (Exception e) {
            System.out.println("Error guardando. " + e);
        }
    }
    
    @Override
    public List<modeloVO> cargarEstudiante() {
        try {
            //Creación de una lista donde se van a guardar la información de la deserialización.
            List<modeloVO> estudiantes = new ArrayList();
            //Funciones para leer los datos. Traerlos.
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream objentrada = null;
            if(fis.available()>0){//Mientras el archivo fis tenga información.
                objentrada = new ObjectInputStream(fis);
            }
            //Recorrer.
            while(fis.available()>0){
                modeloVO estudiantevo = (modeloVO) objentrada.readObject();
                estudiantes.add(estudiantevo);
            }
            fis.close();
            return estudiantes;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error cargando: " + e);
            return null;
        }
    

    @Override
    public List<modeloVO> cargarEstudiante(ArrayList arrayList) {
        try {
            //Creación de una lista donde se van a guardar la información de la deserialización.
            List<modeloVO> estudiantes = new ArrayList();
            //Funciones para leer los datos. Traerlos.
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream objentrada = null;
            if(fis.available()>0){//Mientras el archivo fis tenga información.
                objentrada = new ObjectInputStream(fis);
            }
            //Recorrer.
            while(fis.available()>0){
                modeloVO estudiantevo = (modeloVO) objentrada.readObject();
                estudiantes.add(estudiantevo);
            }
            fis.close();
            return estudiantes;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error cargando: " + e);
            return null;
        }
    }
    */
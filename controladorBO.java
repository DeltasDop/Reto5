package controladorBO;

//import java.util.ArrayList;
import java.util.List;
import modeloVO.EstudianteDAO;
import modeloVO.IEstudianteDAO;
import modeloVO.modeloVO;

public class controladorBO {
    
    private IEstudianteDAO edao;
    
    public controladorBO(){
        edao = new EstudianteDAO();
    }
    //1
    public boolean insertarEstudiante(modeloVO estudiante){
        return edao.insertarEstudiante(estudiante);
    }
    //2
    public List<modeloVO> obtenerEstudiantes(){
        return edao.consultarTodos();
    }
    //3
    public modeloVO obtenerEstudiante(String CorreoInst){
        return edao.consultarPorCorreo(CorreoInst);
    }
    //4
    public boolean actualizarEstudiante(modeloVO estudiante){
        return edao.actualizarEstudiante(estudiante);
    }
    //5
    public boolean eliminarEstudiante(modeloVO estudiante){
        return edao.eliminarEstudiante(estudiante.getCorreoInst());
    }
    //New Methods.
    //6
    public List<modeloVO> consultarPorApellido(String Apellidos){
        edao.consultarPorApellido(Apellidos);
        return null;
    }
    //7
    public modeloVO consultarPorCorreo(String CorreoInst){
        return edao.consultarPorCorreo(CorreoInst);
    }
    //8
    public List<modeloVO> consultarPorPrograma(String Carrera){
        return edao.consultarPorPrograma(Carrera);
    }
    //9
    public int consultarCantidadEstudiantes(String Carrera){
        return edao.consultarCantidadEstudiantes(Carrera);
    }
    //10
    public List<modeloVO> consultarPorFechaNacimiento(String Nacimiento){
        return edao.consultarPorFechaNacimiento(Nacimiento);
    }
    //11
    public List<modeloVO> consultarPorCelular(Long Celular){
        edao.consultarPorCelular(Celular);
        return null;
    }
    /*
    //Crear la lista para el directorio.
    List<modeloVO> directorio; 
    private IEstudianteDAO edao;
    
    //Llenar el arreglo. 
    public controladorBO(){
        edao = new EstudianteDAO();
        directorio = new ArrayList<>();
    }
    //1. Ingresar estudiantes.
    public void ingresarEstudiante(modeloVO estudiante){
        directorio.add(estudiante);
        edao.insertarEstudiante(estudiante); //Directorio -> estudiante. 
    }
    //2. Buscar estudiante.
    public modeloVO buscarEstudiante(String CorreoInst){
        for(modeloVO estudiante : directorio){
            if(estudiante.getCorreoInst().equals(CorreoInst)){
                return estudiante;
            }
        }
        return  null;
    }
    //3. Modificar estudiante.
    public void modificarEstudiante(modeloVO estudiante){
        int i = 0;
        while(i < directorio.size()){
            
            if(directorio.get(i).getCorreoInst().equals(estudiante.getCorreoInst())){
                directorio.set(i, estudiante);
            }
            i++;
        }
        edao.guardarEstudiantes(directorio);
    }
    //4. Elimiar estudiante.
    public void eliminarEstudiante(modeloVO estudiante){
        directorio.remove(estudiante);
        edao.guardarEstudiantes(directorio);
    }
    //5. Ver directorio de estudiantes.
    public List<modeloVO> mostrarDirectorio(){
        return directorio;
    }
    */
}

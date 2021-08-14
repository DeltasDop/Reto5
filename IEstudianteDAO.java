package modeloVO;

//import java.util.ArrayList;
import java.util.List;

public interface IEstudianteDAO {

    /*Old Methods*/
    //public void guardarEstudiantes(List<modeloVO> estudiantes);
    //public List<modeloVO> cargarEstudiante(ArrayList arrayList);
    
    //New Methods:
    public boolean insertarEstudiante(modeloVO estudiante);
    public boolean actualizarEstudiante(modeloVO estudiante);
    public boolean eliminarEstudiante(String CorreoInst);
    public List<modeloVO> consultarTodos();
    public modeloVO consultarPorCorreo(String CorreoInst);
    public List<modeloVO> consultarPorApellido(String Apellidos);
    public List<modeloVO> consultarPorPrograma(String Carrera);
    public int consultarCantidadEstudiantes(String Carrera);
    public List<modeloVO> consultarPorFechaNacimiento(String Nacimiento);
    public modeloVO consultarPorCelular(Long Celular);
    
}

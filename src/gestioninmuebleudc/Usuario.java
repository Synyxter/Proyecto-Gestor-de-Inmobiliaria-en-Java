package gestioninmuebleudc;
import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String cedula;
    private int edad;
    private String sexo;
    private String foto;
    private String contraseña;
    private int estrato;
    private float dinero;
    
    //este atributo static es para que haya un tiempo "global" y no que cada objeto tenga su propio tiempo
    //para que no tengamos en una cuenta que estamos en el año x del mes x en el dia x, y al salir e iniciar con otra cuenta
    //aparezca que estamos de nuevo en la fecha 0
    public static LocalDate time = LocalDate.parse("2000-01-01");

    public Usuario(String nombre, String cedula, int edad, String sexo, String foto, String contraseña, int estrato,float dinero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
        this.foto = foto;
        this.contraseña = contraseña;
        this.estrato = estrato;
        this.dinero = dinero;
    }
// GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFoto() {
        return foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEstrato() {
        return estrato;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero += dinero;
    }
    
    
}

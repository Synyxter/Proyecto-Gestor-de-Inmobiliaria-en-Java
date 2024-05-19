package gestioninmuebleudc;
public class Usuario {
    private String nombre;
    private String cedula;
    private int edad;
    private String sexo;
    private String foto;

    public Usuario(String nombre, String cedula, int edad, String sexo, String foto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
        this.foto = foto;
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
    
    
}

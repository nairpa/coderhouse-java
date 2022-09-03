import java.util.Objects;
//Clase Persona que posee como atributos nombre y apellido, y sus correspondientes getters y setters
public class Persona {
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @Description Sobreescribe el método toString() heredado por uno que devuelva
     * los valores de los atributos nombre y apellido.
     * */
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre) && apellido.equals(persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}

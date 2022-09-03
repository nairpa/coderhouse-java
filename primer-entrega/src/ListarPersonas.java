import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListarPersonas {
    public static void main(String[] args) {
        /**
         * Sea crean seis instancias de la clase Persona pasando
         * al constructor los valores de los atributos nombre y apellido
         * */
        Persona primerPersona = new Persona("Franco", "Raspo");
        Persona segundaPersona = new Persona("Pablo", "Raspo");
        Persona tercerPersona = new Persona("Matias", "Maini");
        Persona cuartaPersona = new Persona("Julio", "Martinez");
        Persona quintaPersona = new Persona("Nicolas", "Fabucci");
        Persona sextaPersona = new Persona("Leandro", "Rivarola");

        /**
         * Se crea una lista para almacenar valores de tipo clase Persona y a continuación
         * se añaden a la lista las seis instancias de la clase Persona anteriormente creadas
         * */
        List<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(primerPersona);
        listaPersonas.add(segundaPersona);
        listaPersonas.add(tercerPersona);
        listaPersonas.add(cuartaPersona);
        listaPersonas.add(quintaPersona);
        listaPersonas.add(sextaPersona);

        /**
         * Imprime en consola la lista de personas.
         * */
        System.out.println("Listar personas " + listaPersonas);

        /**
         * Imprime en consola la lista de personas ordenadas alfabéticamente por nombre.
         * */
        System.out.println("Listar personas por nombre " + listaPersonas
                .stream()
                .sorted((a, b) -> a.getNombre().compareTo(b.getNombre()))
                .collect(Collectors.toList())
        );

        /**
         * Imprime en consola la lista de personas ordenada alfabéticamente por apellido.
         * */
        System.out.println("Listar por apellido " + listaPersonas
                .stream()
                .sorted((a, b) -> a.getApellido().compareTo(b.getApellido()))
                .collect(Collectors.toList())
        );

        /**
         * Imprime en consola la lista de personas ordenada inversamente por apellido.
         * */
        System.out.println("Listar por apellido invertido " + listaPersonas
                .stream()
                .sorted((a, b) -> b.getApellido().compareTo(a.getApellido()))
                .collect(Collectors.toList())
        );
    }
}

import java.util.Iterator;
import java.util.HashMap;

/**
 * Esta clase proporciona funcionalidades básicas para administrar una agenda telefónica, 
 * agregar nuevos contactos, buscar números de teléfono por nombre de contacto, 
 * y agregar fechas de cumpleaños.
 * @author Mauro Gutierrez Tormo
 * @version 1.0
 */
public class AgendaTelefonica {
    private HashMap<String, Contacto> contactos;

    /**
     * Constructor para objetos de clase AgendaTelefonica.
     */
    public AgendaTelefonica() {
        contactos = new HashMap<>();
    }

    /**
     * Permite almacenar un nuevo contacto en la agenda indicando el nombre del contacto
     * y su número de teléfono asociado.
     * @param name Nombre del contacto.
     * @param number Número de teléfono asociado al nombre.
     */
    public void enterNumber(String name, String number) {
        Contacto contacto = new Contacto(name, number);
        contactos.put(name, contacto);
    } 

    /**
     * Devuelve el número de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     * @param name Nombre del contacto para buscar su número de teléfono.
     * @return Número de teléfono asociado al nombre o null si no existe.
     */
    public String lookupNumber(String name) {
        Contacto contacto = contactos.get(name);
        return (contacto != null) ? contacto.getNumero() : null;
    }

    /**
     * Imprime todos los nombres de los contactos registrados en la agenda en una sola línea.
     */
    public void printAllNames() {
        System.out.println(contactos.keySet());
    }

    /**
     * Imprime todos los nombres de los contactos registrados en la agenda, uno por línea.
     */
    public void printAllNamesOneMultiline() {
        for (String name : contactos.keySet()) {
            System.out.println(name);
        }
    }

    /**
     * Agrega una fecha de cumpleaños al contacto asociado al número dado.
     * @param number Número de teléfono del contacto.
     * @param cumple Fecha de cumpleaños del contacto.
     */
    public void addBirthDay(String Nombre, String numero) {
        boolean encontrado = false;
        Iterator<Contacto> iterator = contactos.values().iterator();
        while (iterator.hasNext() && !encontrado) {
            Contacto contacto = iterator.next();
            if (contacto.getNumero().equals(Nombre)) {
                contacto.setFechaNacimiento(numero);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado con el número: " + Nombre);
        }
    }

    /**
     * Imprime todos los datos de los contactos registrados en la agenda.
     */
    public void printAllData() {
        for (Contacto contacto : contactos.values()) {
            System.out.println(contacto);
        }
    }
}
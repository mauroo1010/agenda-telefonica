import java.util.HashMap;

public class AgendaTelefonica
{
    private HashMap<String, String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number) {
        agenda.put(name, number);
    } 
    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
     public String lookupNumber(String name) {
        return agenda.get(name);
    }
}

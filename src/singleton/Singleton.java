package singleton;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Singleton {

    public static void main(String[] args) {
            ClaseSingleton pepe=ClaseSingleton.getSingletonInstance();
            pepe.setNombre("Pepe");
            pepe.setApellido("Perez");
            pepe.setEdad(53);
            JOptionPane.showMessageDialog(null,pepe);
            ClaseSingleton julian=ClaseSingleton.getSingletonInstance();
            julian.setNombre("Julian");
            julian.setApellido("Hulio");
            julian.setEdad(23);
            JOptionPane.showMessageDialog(null,julian);
    }
    
}

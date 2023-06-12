
import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) 
    {
        boolean salir = false;
        Pila miPila = new Pila();

        JOptionPane.showMessageDialog(null, "¡Bienvenido al servicio de limpieza de trastes!");

        while (!salir) 
        {
            JOptionPane.showMessageDialog(null, "   ----- Menú -----\n" + "1. Añadir trastes\n" + "2. Mostrar trastes\n" + "3. Salir");

            try 
            {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar: "));

                switch (opcion) 
                {
                    case 1:

                        JOptionPane.showMessageDialog(null, "1. Añadir plato\n" + "2. Añadir vaso");

                        int opcionTrastes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el traste que desea ingresar: "));

                        switch (opcionTrastes) 
                        {
                            case 1:

                                String plato = "Plato";

                                int cubiertosPlato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cubiertos del plato: "));

                                Trastes trastePlato = new Trastes(plato, cubiertosPlato);

                                miPila.pushPublico(trastePlato);

                                JOptionPane.showMessageDialog(null, "Se agregó el plato correctamente.");

                                break;

                            case 2:

                                String vaso = "Vaso";

                                int cubiertosVaso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cubiertos del vaso: "));

                                Trastes trasteVaso = new Trastes(vaso, cubiertosVaso);

                                miPila.pushPublico(trasteVaso);

                                JOptionPane.showMessageDialog(null, "Se agregó el vaso correctamente.");

                                break;

                            default:

                                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");

                                break;
                        }

                        break;

                    case 2:
                        
                        miPila.mostrarPublico();
                        
                        break;

                    case 3:

                        salir = true;

                        JOptionPane.showMessageDialog(null, "¡Gracias por utilizar el servicio de limpieza de trastes!");

                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");

                        break;
                }
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
            }
        }
    }
}

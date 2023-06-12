
import javax.swing.JOptionPane;

public class Pila 
{
    private Node cima;
    private int largo;

    public Pila() 
    {
        this.cima = null;
        this.largo = 0;
    }

    public boolean Vacia() 
    {
        return cima == null;
    }

    public int tamannio() 
    {
        return this.largo;
    }

    public void pushPublico(Trastes valor) 
    {
        push(valor);
    }
    
    private void push(Trastes valor) 
    {
        Node newNode = new Node();
        newNode.setValor(valor);

        if (!Vacia()) 
        {
            Trastes trasteCima = cima.getValor();
            
            int cubiertosCima = trasteCima.getCubiertos();
            
            int cubiertosValor = valor.getCubiertos();

            valor.setCubiertos(cubiertosCima + cubiertosValor);
            
            trasteCima.setCubiertos(0);
        }

        newNode.setSiguiente(cima);
        
        cima = newNode;
        
        largo++;
    }

    public void mostrarPublico()
    {
        mostrar();
    }
    
    private void mostrar() 
    {
        if (Vacia()) 
        {
            JOptionPane.showMessageDialog(null, "No hay trastes para mostrar");
        }
        else 
        {
            String cadena = "Trastes: \n";
            Node aux = cima;

            while (aux != null) 
            {
                Trastes traste = aux.getValor();

                cadena += traste.getTraste() + " - Cubiertos: " + traste.getCubiertos() + "\n";

                aux = aux.getSiguiente();
            }

            JOptionPane.showMessageDialog(null, cadena);
        }
    }
}

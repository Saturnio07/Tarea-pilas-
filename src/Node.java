public class Node 
{
    private Trastes valor;
    private Node siguiente;
    
    public Node() 
    {
        this.valor = null;
        this.siguiente = null;
    }

    public Trastes getValor() {
        return valor;
    }

    public void setValor(Trastes valor) {
        this.valor = valor;
    }
    
    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
}

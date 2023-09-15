package singleton;

public class Constante {

    private static Constante instancia;

    private String nombreConstante;
    private double valorConstante;
    //constructor

    private Constante(){
        nombreConstante = "N/A";
        valorConstante = 0;
    }
    //metodo de acceso unico a crear la instancia
    public static Constante getInstance(){
        if(instancia == null){
            instancia = new Constante();
            System.out.println("Instancia creada por primer y unica vez");

        }
        return instancia;
    }
    @Override
    public String toString() {
        return " Constante [nombreConstante = " + nombreConstante + ", valorConstante=" + valorConstante + "]";
    }

    public void setDatos(String name, double value){
        this.nombreConstante = name;
        this.valorConstante = value;
    }
    
    
}

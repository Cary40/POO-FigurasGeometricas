
package poo;

public class Cuadrado {
    private float lado ;
    public Cuadrado(){
    }
    public Cuadrado(float lado){
        this.lado=lado;
    } 
    public float getLado(){
        return lado;
    }
    public void setLado(float lado){
        this.lado=lado;
    }
    public float CalcularPerimetro(){
        return 4*lado;
    }
    public float CalcularArea(){
        return lado*lado;
    }
    
}

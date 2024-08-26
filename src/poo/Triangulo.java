
package poo;

public class Triangulo {
    private float base;
    private float altura;
    public Triangulo(){   
    }
    public Triangulo(float base, float altura){
        this.base=base; 
        this.altura=altura;
    }
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public void setBase(float Base){
        this.base=Base;
    }
    public void setAltura(float Altura){
        this.altura=Altura;
    }
    public float CalcularPerimetro(){ 
       float lado3 = (float) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));//triangulo rectangulo
        return base+altura+lado3;
    }
    public float CalcularArea(){
        return base*altura/2;
    }
}

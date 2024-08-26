
package poo;

public class Rectangulo {
    private float lado1;
    public float lado2;
  public Rectangulo(){        
  } 
  public Rectangulo(float lado1, float lado2){
      this.lado1=lado1;
      this.lado2=lado2;
  }
  public float getLado1(){
      return lado1;
  }
  public void setLado1(float lado1){
      this.lado1=lado1;
  }
  public float CalcularPerimetro(){
      return (lado1+lado2)*2;
  }
  public float CalcularArea(){
      return lado1*lado2;
  }
}

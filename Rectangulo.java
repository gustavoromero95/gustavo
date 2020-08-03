
package rectangulo;




public class Rectangulo {

  int ancho;
  private double alto;
  public Rectangulo (int alto, int ancho) {
  
  this.alto=alto;
  this.ancho=ancho;
  
  }
    
    public void setAlto (double alto){
     
        this.alto = alto;
    
    
    }
    
    public int getAlto(){
    
    return (int) this.alto;
   
    
    }
    
    public void setAncho (double ancho){
    
    this.ancho=(int) ancho;
   
    }
    
    public int getAncho() {
     
        return this.ancho;
    
    }
    
    public double calcularArea(){
     
   int area;
   
   area = (int) (this.alto * this.ancho);
    
    return area;
    }
    
    
    public int calcularPerimetro(){
    
    int perimetro;
    
    perimetro = (int) ((this.alto *2) + (this.ancho * 2)); 
    
   return perimetro;
    
    }
    
    {
        
    } 
    { 
        
    }}
             
    
            
                
            



  
    
   
   
   
    
   
       
       
   
    
    

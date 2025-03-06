
package mx.itson.carrito.entidades;



public class Carro {

    /**
     * @return the kilometraje
     */
    public Double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

  
    public String getModel() {
        return model;
    }

   
    public void setModel(String model) {
        this.model = model;
    }

   
    public String getColor() {
        return color;
    }

 
    public void setColor(String color) {
        this.color = color;
    }

   
    public Double getSpeed() {
        return speed;
    }

  
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

   
    public Double getMiles() {
        return miles;
    }

    
    public void setMiles(Double miles) {
        this.miles = miles;
    }

  
    public Integer getYear() {
        return year;
    }


    public void setYear(Integer year) {
        this.year = year;
    }
    
    
    
    private Double kilometraje;
    private String model;
    private String color;
    private Double speed;
    private Double miles;
    private Integer year;
    
    
/**
 * Calcula el tiempo que tarda el carro en recorrer una distancia determinada por el usuario.
 * @param distance = Es la distancia a la que se espera que el carro recorra
 * @param speed = Es la velocidad a la que el carro se mueve hacia su objetivo
 * @return time = Tiempo que se tardo en recorrer la distancia
 */    
  public double calculateTime(double distance, double speed){
  
            double time = distance/speed;
            return time;
        } 
    
    
}

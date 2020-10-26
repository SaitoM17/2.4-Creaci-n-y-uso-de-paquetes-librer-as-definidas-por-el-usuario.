package fp.punto;
/**
 *
 * @author Said Mariano
 */
public interface Punto {
    
    public Double getX();

    public Double getY();

    public void setX(double d);

    public void setY(double d);
  
   
 Double getDistanciaAOtroPunto(Punto p);

    

}

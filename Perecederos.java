import java.time.LocalDate;

public class Perecederos extends Productos{
  private LocalDate fechaCaducacion;

  public Perecederos(int codigo, String descripcion, int precio, LocalDate fechaCaducacion) {
    super(codigo, descripcion, precio);
    this.fechaCaducacion = fechaCaducacion;
  }

  @Override
  public int calcularPrecio() {
    if (fechaCaducacion.getDayOfMonth()-LocalDate.now().getDayOfMonth()==1){
      return precio/4;
    }
    if (fechaCaducacion.getDayOfMonth()-LocalDate.now().getDayOfMonth()==2){
      return precio/3;
    }
    else return precio/2;
    
  }

  
  public LocalDate getFechaCaducacion() {
    return fechaCaducacion;
  }

  public void setFechaCaducacion(LocalDate fechaCaducacion) {
    this.fechaCaducacion = fechaCaducacion;
  }

  @Override
  public String toString() {
    return super.toString()+"Perecederos [fechaCaducacion=" + fechaCaducacion + "]";
  }
  
}

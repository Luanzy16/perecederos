public abstract class Productos {
  protected int codigo;
  protected String descripcion;
  protected int precio;
 
  public Productos(int codigo, String descripcion, int precio) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precio = precio;
  }

  public abstract int calcularPrecio();

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Productos [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
  }
  
}

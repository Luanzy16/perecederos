import java.util.Scanner;

public class NoPerecedero extends Productos {
  private String tipo;

  public NoPerecedero(int codigo, String descripcion, int precio, String tipo) {
    super(codigo, descripcion, precio);
    this.tipo = tipo;
  }

  @Override
  public int calcularPrecio() {
    Scanner Leer = new Scanner(System.in);
    System.out.print("Ingresa la cantidad de produtos comprados: ");
    int cantidadProductos = Leer.nextInt();
    Leer.close();
    System.out.println(cantidadProductos);

    int precioFinal = cantidadProductos*precio;
    return precioFinal;
  }


  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return super.toString()+ "NoPerecedero [tipo=" + tipo + "]";
  }
  
}

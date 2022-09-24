import java.time.LocalDate;

public class App {
  public static void main(String[] args) {
    Perecederos producto1 = new Perecederos(1236, "descripcion", 7000, LocalDate.of(2022, 10, 25));
    Perecederos producto2 = new Perecederos(7896, "nada", 8000, LocalDate.of(2023, 1, 21));

    System.out.println(producto1.toString()+"  "+ producto1.calcularPrecio());
    System.out.println(producto2.toString()+"  "+ producto2.calcularPrecio());

    NoPerecedero producto3 = new NoPerecedero(4563, "descripcion", 8500, "tipo");
    NoPerecedero producto4 = new NoPerecedero(1235," descripcion", 4100, "tipo");

    System.out.println(producto3.toString()+"  "+producto3.calcularPrecio());
    System.out.println(producto4.toString()+"  "+producto4.calcularPrecio());

    if(producto3.calcularPrecio() > producto4.calcularPrecio()){
      System.out.println("El prodcuto3 es mas caro");
    }
    else{
      System.out.println("El producto4 es mas caro");
    }
  }
  
}

/*
 * @Author: EV3TH
 */

public class Empleado{

  // Atributos principales
  public int NoEmpleado;
  public String Nombre;
  public String Area;
  public int Telefono;
  public int Sueldo;

  // Constructor (Definimos los atributos principales)
  public Empleado(int NoEmpleado, String Nombre, String Area, int Telefono, int Sueldo){
    this.NoEmpleado = NoEmpleado;
    this.Nombre = Nombre;
    this.Area = Area;
    this.Telefono = Telefono;
    this.Sueldo = Sueldo;
  }

  // Metodo para mostrar datos (VACIO)
  public void MostrarDatos(){
    System.out.println("No. Empleado: "+NoEmpleado);
    System.out.println("Nombre: "+Nombre);
    System.out.println("Area: "+Area);
    System.out.println("Telefono: "+Telefono);
    System.out.println("Sueldo: "+Sueldo+"\n");
  }

  public void CalcularSueldo(int HorasTrabajadas){
    // dia --> $120; = 8 horas ||
    this.Sueldo = HorasTrabajadas*15;
  }

  // Main
  public  static void main(String [] args){
    Empleado Empleado1 = new Empleado(413, "Ebeth", "Produccion", 2241281, 1600);
    Empleado1.MostrarDatos();
    Empleado1.CalcularSueldo(30);
    Empleado1.MostrarDatos();
  }
}

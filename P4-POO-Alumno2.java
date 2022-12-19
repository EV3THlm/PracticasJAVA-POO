import java.util.Scanner;
public class Alumno{

  // Atributos principales (los iniciamos default)
  public String Nombre;
  public String ApellidoP = "";
  public String ApellidoM = "";
  public int Edad = 0;
  public int NoControl;

  // NO REQUERIMOS CONSTRUCTOR

  // Metodo para pedir datos
  public void getDatos(){
    Scanner ems = new Scanner(System.in);
    System.out.print("\nIngresa el nombre: ");
    this.Nombre = ems.nextLine();
    System.out.print("Ingresa el apellido paterno: ");
    ApellidoP = ems.nextLine();
    System.out.print("Ingresa el apellido materno: ");
    ApellidoM = ems.nextLine();
    System.out.print("Ingresa la edad: ");
    Edad = ems.nextInt();
    System.out.print("Ingresa el No. Control: ");
    NoControl = ems.nextInt();
  }

  // Metodo para mostrar los datos
  public void MostrarDatos(){
    System.out.println("\nNombre: " +Nombre+ " " +ApellidoP+ " "+ApellidoM);
    System.out.println("Edad: "+Edad);
    System.out.println("No. Control: "+NoControl);
  }

  public static void main(String[] args) {
    Alumno Alumno1 = new Alumno();
    Alumno1.getDatos();
    Alumno1.MostrarDatos();
    
  }
}

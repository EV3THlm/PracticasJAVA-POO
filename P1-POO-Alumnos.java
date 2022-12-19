public class Alumnos{
  
  // Atributos principales
  public String Nombre;
  public String Apellido;
  public int Edad;
  public int NoControl;

  // Creamos constructor
  public Alumnos(String Nombre, String Apellido, int Edad, int NoControl){
    this.Nombre = Nombre;
    this.Apellido = Apellido;
    this.Edad = Edad;
    this.NoControl = NoControl;
  }

  // Creamos un metodo para mostrar datos (DE TIPO VACIO)
  public void MostrarDatos(){
    System.out.println("Nombre: " +Nombre+ " " +Apellido);
    System.out.println("Edad: "+Edad);
    System.out.println("No. Control: "+NoControl);
  }

  // Metodo principal
  public static void main(String[] args) {
    
    // Creamos nuestro objeto ALumno1
    Alumnos Alumno1 = new Alumnos("Ebeth", "Mejia", 21, 22590434);
    Alumno1.MostrarDatos();
  }
}

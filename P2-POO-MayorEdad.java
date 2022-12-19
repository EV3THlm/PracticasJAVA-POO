public class MayorEdad{

  // Atributos principales
  public String Nombre;
  public String Apellido;
  public int Edad;

  // Creamos un constructor
  public MayorEdad(String Nombre, String Apellido, int Edad){
    this.Nombre = Nombre;
    this.Apellido = Apellido;
    this.Edad = Edad;
  }

  // Creamos un metodo para ver si es mayor de edad o no (VACIO)
  public void getEdad(){
    if (Edad >= 18){
      System.out.println(Nombre+" " +Apellido+ " Es MAYOR DE EDAD");
    }
    if (Edad >= 0 && Edad <= 17){
      System.out.println(Nombre+" " +Apellido+ "Es MENOR DE EDAD");
    }
  }

  public static void main(String [] args){

    // Creamos los objetos Persona1, Persona2
    MayorEdad Persona1 = new MayorEdad("Ebeth", "Mejia", 21);
    MayorEdad Persona2 = new MayorEdad("Valeria", "Chavez", 17);

    Persona1.getEdad();
    Persona2.getEdad();
  }
}

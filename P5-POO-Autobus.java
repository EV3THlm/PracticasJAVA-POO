public class Autobus{
  private String Ruta;
  private int Pasajeros;

  // Utilizamos constructor
  public Autobus(String Ruta, int Pasajeros){
    this.Ruta = Ruta;
    this.Pasajeros = Pasajeros;
  }

  // Mostrar datos
  public void MostrarDatos(){
    System.out.println("\nRuta: "+Ruta);
    System.out.println("No. Pasajeros: " +Pasajeros+ "\n");
  }

  // Subir pasajeros
  public void SubirPasajeros(int CantidadPasajeros){
    Pasajeros += CantidadPasajeros;
    System.out.println("Subieron: " +CantidadPasajeros+ " pasajeros");
  }

  // Bajar pasajeros
  public void BajarPasajeros(int CantidadPasajeros){
    Pasajeros -= CantidadPasajeros;
    System.out.println("Bajaron: " +CantidadPasajeros+ " pasajeros");
  }

  public static void main(String [] args){
    // Creamos instancia
    Autobus Ruta1 = new Autobus("43D", 5);
    Ruta1.MostrarDatos();
    Ruta1.SubirPasajeros(2);
    Ruta1.MostrarDatos();
    Ruta1.BajarPasajeros(100);
    Ruta1.MostrarDatos();
  }
}

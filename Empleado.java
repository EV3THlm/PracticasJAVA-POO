/* REQUERIMIENTOS
 * - Se desea que el salario de un empleado sea calculado segun las horas trabajadas dada la siguiente informacion
 * // Un Obrero gana 120 pesos la hora
 * // Un Operador gana 300 pesos la hora
 * // Un Tecnico gana 500 pesos la hora
 * // Un Ingeniero gana 800 pesos la hora
 */

public class Empleado{
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String area;
    private int noEmpleado;
    private int horasTrabajadas;
    private float salario;

    // Constructor
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String area, int noEmpleado, int horasTrabajadas){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.area = area;
        this.noEmpleado = noEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = 0;
    }

    /* _________________ GETTERS ________________  */

    public String getNombre(){
        return nombre;
    }

    public String getApellidoPaterno(){
        return apellidoPaterno;
    }

    public String getApellidoMaterno(){
        return apellidoMaterno;
    }

    public String getArea(){
        return area;
    }

    public int getNoEmpleado(){
        return noEmpleado;
    }

    public float getSalario(){
        return salario;
    }

    /* __________________ SETTERS __________________ */

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setArea(String area){
        this.area = area;
    }

    public void setNoEmpleado(int noEmpleado){
        this.noEmpleado = noEmpleado;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    // Metodo toString (Para imprimir los datos)
    @Override
    public String toString(){
        return "\nNombre: "+nombre
        +"\nApellido: "+apellidoPaterno+" "+apellidoMaterno
        +"\nArea: "+area
        +"\nNumero de empleado: "+noEmpleado
        +"\nSalario: "+salario;
    }
    
    /* _______________ Metodo para calcular salario _______________ */

    /*  // Los del area de produccion ganan 120 pesos la hora
        // Los del area de administracion ganan 300 pesos la hora
        // Los del area de recursos humanos ganan 500 pesos la hora
        // Los del area de ventas Ingeniero gana 800 pesos la hora */

    public float calcularSalario(){
        float salarioHora = 0;
        if (area.equals("produccion")){
            salarioHora = 120;
        }
        else if (area.equals("administracion")){
            salarioHora = 300;
        }
        else if (area.equals("recursos humanos")){
            salarioHora = 500;
        } 
        else if (area.equals("ventas")){
            salarioHora = 800;
        }
        else{
            throw new IllegalArgumentException("¡ERROR!, area no valida");
        }

        // Calculamos el salario
        salario = salarioHora*horasTrabajadas;
        return salario;
    }
    public static void main(String[] args) {
        
        // Creamos la instancia
        Empleado empleado1 = new Empleado("Ebeth", "Mejia", "Chavez", "areadesconocida", 7863, 8);
        Empleado empleado2 = new Empleado("Jade", "Nuñez", "Segura", "recursos humanos", 22591002, 16);
        System.out.println(empleado1);
        empleado1.calcularSalario();
        // empleado2.calcularSalario();
        System.out.println(empleado1);
    }
}
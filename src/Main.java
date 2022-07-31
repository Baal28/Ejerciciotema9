public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(28);
        cliente.setNombre("Zakk Wylde");
        cliente.setTelefono(4149686368L);
        cliente.setCredito("Credito Disponible: 25000");
        System.out.println("Edad: "+cliente.getEdad()+" Nombre: "+cliente.getNombre()+" Telefono: "+cliente.getTelefono()+" "+cliente.getCredito() );

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(29);
        trabajador.setNombre("Ozzy Osbourne");
        trabajador.setTelefono(5553456410L);
        trabajador.setSalario(250000);
        System.out.println("Edad: "+trabajador.getEdad()+" Nombre: "+trabajador.getNombre()+" Telefono: "+ trabajador.getTelefono()+" Salario: "+ trabajador.getSalario());


    }
}

class Persona{
    int edad;
    String nombre;
    long telefono;

    public Persona(){
        System.out.println("Estoy en el constructor de Persona");
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona{

    String credito;

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{

    int salario;



    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
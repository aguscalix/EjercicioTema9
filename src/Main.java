public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Ricardo");
        cliente1.setEdad(18);
        cliente1.setTelefono("1234-5678");
        cliente1.setCredito(3500);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Jose");
        trabajador1.setEdad(25);
        trabajador1.setTelefono("8765-4321");
        trabajador1.setSalario(10000);

        System.out.println("*****Cliente*****");
        System.out.println("Nombre:" + cliente1.getEdad());
        System.out.println("Edad:" + cliente1.getNombre());
        System.out.println("Telefono:" + cliente1.getTelefono());
        System.out.println("Credito:" + cliente1.getCredito());


        System.out.println("\n*****Trabajador*****");
        System.out.println("Nombre:" + trabajador1.getEdad());
        System.out.println("Edad:" + trabajador1.getNombre());
        System.out.println("Telefono:" + trabajador1.getTelefono());
        System.out.println("Salario:" + trabajador1.getSalario());
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }

}

class Cliente extends Persona {
    float credito;

    public void setCredito( float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    float salario;

    public void setSalario( float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }
}


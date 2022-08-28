public class BoootCamp1 {

    public static void main(String []args){
        Cliente cliente = new Cliente();
        System.out.println("el nombre del cliente es:"+cliente.nombre);
        System.out.println("la edad del cliente es:"+cliente.edad);
        System.out.println("el telefono del cliente es:"+cliente.telefono);
        System.out.println("el estado del credito es:"+cliente.credito);

        Trabajador trabajador = new Trabajador();
        System.out.println("el nombre del trabajador es:"+trabajador.nombre);
        System.out.println("la edad del trabajador es:"+trabajador.edad);
        System.out.println("el telefono del trabajador es:"+trabajador.telefono);
        System.out.println("el salario que percibe es:"+trabajador.salario);
    }

}

class Persona{
    int edad=30;
    String nombre ="Juan";
    int telefono= 2327272;


}

class Cliente extends Persona {
    String credito = "Aprobado";
}

class Trabajador extends Persona{
    int salario= 320000;
}






package evalucionTres;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroDeClientes {
    public static void main(String[] args) {
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        Scanner datos = new Scanner(System.in);
        int id = 1;
        String decision;

        do {

            System.out.println("Ingrese el id del cliente");
            String Id = datos.nextLine();

            System.out.println("Ingrese el codigo del cliente");
            String codigo = datos.nextLine();

            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = datos.nextLine();

            System.out.println("Ingrese el apellido del cliente: ");
            String apellido = datos.nextLine();

            System.out.println("Ingrese el email del cliente: ");
            String email = datos.nextLine();

            System.out.println("Ingrese el número de teléfono del cliente: ");
            String telefono = datos.nextLine();

            // Crear un nuevo cliente y agregarlo a la lista
            Cliente cliente = new Cliente(id, codigo, nombre, apellido, email, telefono);
            listaCliente.add(cliente);
            id++;

            System.out.print("¿Deseas ingresar otro cliente? (S/N): ");
            decision = datos.nextLine();
        } while (decision.equalsIgnoreCase("s"));

        System.out.println("\nClientes registrados:");
        Iterator<Cliente> iterator = listaCliente.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            System.out.println(cliente.toString());
        }
    }
}

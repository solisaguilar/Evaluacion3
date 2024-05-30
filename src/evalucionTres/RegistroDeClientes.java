package evalucionTres;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RegistroDeClientes {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        Random random = new Random();
        String desicion;
        int id= 1;

        do {

            System.out.println("Ingrese el nombre:");
            String nombre = datos.nextLine();
            System.out.println("Ingrese el apellido");
            String apellido = datos.nextLine();
            System.out.println("Ingrese el email");
            String email = datos.nextLine();
            System.out.println("Ingrese el telefono");
            String telefono = datos.nextLine();

            String codigo  = apellido.substring(0, 2).toUpperCase() +
                    nombre.substring(0, 2).toUpperCase() +
                    String.format("%03d", random.nextInt(1000));

            Cliente cliente = new Cliente(id, codigo, nombre, apellido, email, telefono);
            listaCliente.add(cliente);
            id++;

            System.out.println("¿Deseas ingresar otro cliente? (s/n):");
            desicion = datos.nextLine();
        }while (desicion.equalsIgnoreCase("s"));


        System.out.println("Clientes registrados:");
        Iterator<Cliente> iterator = listaCliente.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            System.out.println("ID: " + cliente.getId());
            System.out.println("Código: " + cliente.getCodigo());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellido: " + cliente.getApellido());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println("----------------------");
        }
    }
}
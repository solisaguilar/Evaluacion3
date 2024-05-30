package evalucionTres;

public class Cliente {
    private int Id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id, String codigo, String nombre, String apellido, String email, String telefono) {
        Id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return Id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}
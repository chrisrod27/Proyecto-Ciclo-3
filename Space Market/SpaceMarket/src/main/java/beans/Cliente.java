
package beans;

public class Cliente {
    
    private String username;
    private String contraseña;
    private String nombre;
    private String apellidos;
    private String email;
    private String direccion;
    private boolean premium;
    private int cedula;
    private int celular;

    public Cliente() {
    }

    public Cliente(String username, String contraseña, String nombre, String apellidos, String email, String direccion, boolean premium, int cedula, int celular) {
        this.username = username;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.premium = premium;
        this.cedula = cedula;
        this.celular = celular;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" + "username=" + username + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", direccion=" + direccion + ", premium=" + premium + ", cedula=" + cedula + ", celular=" + celular + '}';
    }
    
    
}

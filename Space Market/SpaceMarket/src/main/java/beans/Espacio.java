package beans;

public class Espacio {
    
    private int id;
    private String zona;
    private double tamaño;
    private boolean disponibilidad;
    private double precio;
    private String tipo_espacio;
    private int aforo;

    public Espacio() {
    }

    public Espacio(int id, String zona, double tamaño, boolean disponibilidad, double precio, String tipo_espacio, int aforo) {
        this.id = id;
        this.zona = zona;
        this.tamaño = tamaño;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.tipo_espacio = tipo_espacio;
        this.aforo = aforo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo_espacio() {
        return tipo_espacio;
    }

    public void setTipo_espacio(String tipo_espacio) {
        this.tipo_espacio = tipo_espacio;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    @Override
    public String toString() {
        return "Espacio{" + "id=" + id + ", zona=" + zona + ", tama\u00f1o=" + tamaño + ", disponibilidad=" + disponibilidad + ", precio=" + precio + ", tipo_espacio=" + tipo_espacio + ", aforo=" + aforo + '}';
    }
    
    
}

package beans;

import java.sql.Date;

public class Alquiler {
    
    private int id;
    private String username;
    private Date fecha;
    private String detalle;
    private String metodo_pago;

    public Alquiler() {
    }

    public Alquiler(int id, String username, Date fecha, String detalle, String metodo_pago) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.detalle = detalle;
        this.metodo_pago = metodo_pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", detalle=" + detalle + ", metodo_pago=" + metodo_pago + '}';
    }
    
    
}

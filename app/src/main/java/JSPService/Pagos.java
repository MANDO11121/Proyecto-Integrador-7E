package JSPService;

/**
 * Created by ARMANDO on 30/11/2016.
 */

public class Pagos {

    public Pagos(int id, int id_Venta, String fecha, float pago) {
        this.id = id;
        this.id_Venta = id_Venta;
        this.fecha = fecha;
        this.pago = pago;
    }

    public Pagos(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

    int id;
    int id_Venta;
    String fecha;
    float pago;


}

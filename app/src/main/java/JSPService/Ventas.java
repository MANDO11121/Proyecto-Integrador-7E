package JSPService;

/**
 * Created by ARMANDO on 30/11/2016.
 */

public class Ventas {

    public Ventas(int venta, int id_Usuario, int id_Vendedor, int id_Producto, String fecha, int num_Productos, float precio_Productos, int tipo_Pago, int tipo_Cobro, String horario_Cobro, float cantidad_Abono) {
        this.venta = venta;
        this.id_Usuario = id_Usuario;
        this.id_Vendedor = id_Vendedor;
        this.id_Producto = id_Producto;
        this.fecha = fecha;
        this.num_Productos = num_Productos;
        this.precio_Productos = precio_Productos;
        this.tipo_Pago = tipo_Pago;
        this.tipo_Cobro = tipo_Cobro;
        this.horario_Cobro = horario_Cobro;
        this.cantidad_Abono = cantidad_Abono;
    }

    public Ventas(){}


    public int getVenta() {
        return venta;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNum_Productos() {
        return num_Productos;
    }

    public float getPrecio_Productos() {
        return precio_Productos;
    }

    public int getTipo_Pago() {
        return tipo_Pago;
    }

    public int getTipo_Cobro() {
        return tipo_Cobro;
    }

    public String getHorario_Cobro() {
        return horario_Cobro;
    }

    public float getCantidad_Abono() {
        return cantidad_Abono;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public void setId_Vendedor(int id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNum_Productos(int num_Productos) {
        this.num_Productos = num_Productos;
    }

    public void setPrecio_Productos(float precio_Productos) {
        this.precio_Productos = precio_Productos;
    }

    public void setTipo_Pago(int tipo_Pago) {
        this.tipo_Pago = tipo_Pago;
    }

    public void setTipo_Cobro(int tipo_Cobro) {
        this.tipo_Cobro = tipo_Cobro;
    }

    public void setHorario_Cobro(String horario_Cobro) {
        this.horario_Cobro = horario_Cobro;
    }

    public void setCantidad_Abono(float cantidad_Abono) {
        this.cantidad_Abono = cantidad_Abono;
    }

    int venta;
    int id_Usuario;
    int id_Vendedor;
    int id_Producto;
    String fecha;
    int num_Productos;
    float precio_Productos;
    int tipo_Pago;
    int tipo_Cobro;
    String horario_Cobro;
    float cantidad_Abono;

}

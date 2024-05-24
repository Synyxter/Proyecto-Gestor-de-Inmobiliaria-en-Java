package gestioninmuebleudc;

import java.util.Date;

public class MovimientoBancario {
    private String tipoMovimiento;
    private Date fecha;
    private float importe;
    private String deudor;
    private String acreedor;

    public MovimientoBancario(String tipoMovimiento, Date fecha, float importe, String deudor, String acreedor) {
        this.tipoMovimiento = tipoMovimiento;
        this.fecha = fecha;
        this.importe = importe;
        this.deudor = deudor;
        this.acreedor = acreedor;
    }
    
//GETTERS Y SETTERS
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getImporte() {
        return importe;
    }

    public String getDeudor() {
        return deudor;
    }

    public String getAcreedor() {
        return acreedor;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public void setDeudor(String deudor) {
        this.deudor = deudor;
    }

    public void setAcreedor(String acreedor) {
        this.acreedor = acreedor;
    }
    
}



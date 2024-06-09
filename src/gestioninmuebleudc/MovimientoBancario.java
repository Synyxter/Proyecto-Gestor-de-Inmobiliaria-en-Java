package gestioninmuebleudc;

import java.time.LocalDate;

public class MovimientoBancario {

    private String tipoMovimiento;
    private LocalDate fechaEmision;
    private float costo;
    private String deudor;
    private String acreedor;

    public MovimientoBancario(String tipoMovimiento, LocalDate fechaEmision, float costo, String deudor, String acreedor) {
        this.tipoMovimiento = tipoMovimiento;
        this.fechaEmision = fechaEmision;
        this.costo = costo;
        this.deudor = deudor;
        this.acreedor = acreedor;
    }
    
//GETTERS Y SETTERS
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public float getCosto() {
        return costo;
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

    public void setFecha(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setImporte(float costo) {
        this.costo = costo;
    }

    public void setDeudor(String deudor) {
        this.deudor = deudor;
    }

    public void setAcreedor(String acreedor) {
        this.acreedor = acreedor;
    }
    
}



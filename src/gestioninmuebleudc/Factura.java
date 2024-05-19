
package gestioninmuebleudc;

import java.util.Date;

public class Factura {
    private Date fechaEmision;
    private String concepto;
    private float costo;
    private Provedor provedor;

    public Factura(Date fechaEmision, String concepto, float costo, Provedor provedor) {
        this.fechaEmision = fechaEmision;
        this.concepto = concepto;
        this.costo = costo;
        this.provedor = provedor;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public String getConcepto() {
        return concepto;
    }

    public float getCosto() {
        return costo;
    }

    public Provedor getProvedor() {
        return provedor;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }

   
}


package gestioninmuebleudc;

public class Cheque {
    private String numeroCheque;
    private float monto;
//CONSTRUCTOR
    public Cheque(String numeroCheque, float monto) {
        this.numeroCheque = numeroCheque;
        this.monto = monto;
    }
//GETTERS Y SETTERS
    public String getNumeroCheque() {
        return numeroCheque;
    }

    public float getMonto() {
        return monto;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
}

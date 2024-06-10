 
package gestioninmuebleudc;
    
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Recibo {
    
    //atributos de la clase recibo
    private static float luz;
    private static float gas;
    private static float agua;
    private int vinculacionInmueble; //cada recibo tiene un id que lo vincula con un inmueble
    private LocalDate mes; //cada recibo tiene un mes en el cual se debe pagar
    //constructor por defecto
    /*public Recibo() {
        
    }
    */

    public Recibo(float luz, float gas, float agua, int vinculacionInmueble, LocalDate mes) {
        this.luz = luz;
        this.gas = gas;
        this.agua = agua;
        
        this.vinculacionInmueble = vinculacionInmueble;
        this.mes = mes;
    }
    
    //metodo static
    public static float generarReciboLuz(int sesionActivaUbic){
        
        //instanciamos nuestras variables random
        Random randomLuz = new Random();
        
        //un switch para que dependiendo el estrato tenga que pagar un x precio por cada servicio
        switch(GestionInmuebleUdc.listaUsuarios.get(sesionActivaUbic).getEstrato()){
            //si el estrato es 1 entonces...
            case 1:
                luz = 70000 + randomLuz.nextFloat(20000);
                break;
            //si el estrato es 2 entonces...    
            case 2:
                luz = 90000 + randomLuz.nextFloat(20000);
                break;
            case 3:
                luz = 200000 + randomLuz.nextFloat(20000);
                break;
            case 4:
                luz = 250000 + randomLuz.nextFloat(20000);
                break;
            case 5:
                luz = 300000 + randomLuz.nextFloat(20000);
                break;  
            case 6:
                luz = 600000 + randomLuz.nextFloat(20000);
                break;    
        }
        return luz;
    }
    
    public static float generarReciboAgua(int sesionActivaUbic){
        
        //instanciamos nuestras variables random
        Random randomAgua = new Random();
        
        //un switch para que dependiendo el estrato tenga que pagar un x precio por cada servicio
        switch(GestionInmuebleUdc.listaUsuarios.get(sesionActivaUbic).getEstrato()){
            //si el estrato es 1 entonces...
            case 1:
                agua = 20000 + randomAgua.nextFloat(20000);
                break;
                //si el estrato es 2 entonces...    
            case 2:
                agua = 30000 + randomAgua.nextFloat(20000);
                break;
            case 3:
                agua = 60000 + randomAgua.nextFloat(20000);
                break;
            case 4:
                agua = 70000 + randomAgua.nextFloat(20000);
                break;
            case 5:
                agua = 100000 + randomAgua.nextFloat(20000);
                break;  
            case 6:
                agua = 150000 + randomAgua.nextFloat(20000);
                break;    
        }
        return agua;
    }
        
    public static float generarReciboGas(int sesionActivaUbic){
        
        //instanciamos nuestras variables random
        Random randomGas = new Random();
        
        //un switch para que dependiendo el estrato tenga que pagar un x precio por cada servicio
        switch(GestionInmuebleUdc.listaUsuarios.get(sesionActivaUbic).getEstrato()){
            //si el estrato es 1 entonces...
            case 1:
                gas = 50000 + randomGas.nextFloat(20000);
                break;
                
            //si el estrato es 2 entonces...    
            case 2:
                gas = 70000 + randomGas.nextFloat(20000);
                break;
            case 3:
                gas = 90000 + randomGas.nextFloat(20000);
                break;
            case 4:
                gas = 130000 + randomGas.nextFloat(20000);
                break;
            case 5:
                gas = 300000 + randomGas.nextFloat(20000);
                break;  
            case 6:
                gas = 400000 + randomGas.nextFloat(20000);
                break;    
        }
        return gas;
    }
    
    public static void pagarLuz(){
        
    }

    public void setLuz(float luz) {
        this.luz = luz;
    }

    public void setGas(float gas) {
        this.gas = gas;
    }

    public void setAgua(float agua) {
        this.agua = agua;
    }

    public float getLuz() {
        return luz;
    }

    public float getGas() {
        return gas;
    }

    public float getAgua() {
        return agua;
    }

    public int getvinculacionInmueble() {
        return vinculacionInmueble;
    }
    
    
    
}

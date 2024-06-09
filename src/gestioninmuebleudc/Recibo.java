 
package gestioninmuebleudc;
    
import java.util.Random;

public class Recibo {
    
    //atributos de la clase recibo
    private static float luz;
    private static float gas;
    private static float agua;
    
    //constructor por defecto
    public Recibo() {
        
    }
    

    public Recibo(float luz, float gas, float agua) {
        this.luz = luz;
        this.gas = gas;
        this.agua = agua;
    }
    
    //metodo static
    public static void generarRecibo(int sesionActivaUbic){
        
        //instanciamos nuestras variables random
        Random randomLuz = new Random();
        Random randomGas = new Random();
        Random randomAgua = new Random();
        
        //un switch para que dependiendo el estrato tenga que pagar un x precio por cada servicio
        switch(GestionInmuebleUdc.listaUsuarios.get(sesionActivaUbic).getEstrato()){
            //si el estrato es 1 entonces...
            case 1:
                luz = 70000 + randomLuz.nextFloat(20000);
                gas = 50000 + randomGas.nextFloat(20000);
                agua = 20000 + randomAgua.nextFloat(20000);
                break;
                
            //si el estrato es 2 entonces...    
            case 2:
                luz = 90000 + randomLuz.nextFloat(20000);
                gas = 70000 + randomGas.nextFloat(20000);
                agua = 30000 + randomAgua.nextFloat(20000);
                break;
            case 3:
                luz = 200000 + randomLuz.nextFloat(20000);
                gas = 90000 + randomGas.nextFloat(20000);
                agua = 60000 + randomAgua.nextFloat(20000);
                break;
            case 4:
                luz = 250000 + randomLuz.nextFloat(20000);
                gas = 130000 + randomGas.nextFloat(20000);
                agua = 70000 + randomAgua.nextFloat(20000);
                break;
            case 5:
                luz = 300000 + randomLuz.nextFloat(20000);
                gas = 300000 + randomGas.nextFloat(20000);
                agua = 100000 + randomAgua.nextFloat(20000);
                break;  
            case 6:
                luz = 600000 + randomLuz.nextFloat(20000);
                gas = 400000 + randomGas.nextFloat(20000);
                agua = 150000 + randomAgua.nextFloat(20000);
                break;    
        }
        
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
    
    
    
}

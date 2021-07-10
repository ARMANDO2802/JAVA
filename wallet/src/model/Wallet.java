package model;

public class Wallet{

    public static final int CAPACIDAD_MAXIMA = 1000000;

    private int saldo;
    private boolean tieneLimite;
    private int meta;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
    }

    public int getsaldo(){
        return saldo;
    }

    public boolean getTieneLimite(){
        return tieneLimite;
    }

    public boolean establecerMeta(int value){
        if (value == 0){
            meta = value;
            return true; 
        } 
        if (value < 0 || value <= saldo || (value > CAPACIDAD_MAXIMA && tieneLimite)){
            return false;
        }
        meta = value;
        return true;        
    }

    public boolean verificarMeta(){
        if(meta == 0 || meta > saldo){
            return false;
        }
        return true;
    }

    public void setTieneLimite(boolean newTieneLimite){
        this.tieneLimite = newTieneLimite;
    }

    public String saveMoney(int value){
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite){
            return "No se puede superar el límite: " + CAPACIDAD_MAXIMA;
        }
        saldo += value; //saldo = saldo + valor
        if(verificarMeta()){System.out.println("Has cumplido la meta");}
        return "Transacción exitósa, nuevo saldo: " + saldo;
    }
    public String takeMoney(int value){
        if(saldo < value){
            return "No se puede retirar ese valor";
        }
        saldo -= value;
        return "Transacción exitósa, nuevo saldo" + saldo;
    }

    public String breakLimit(){
        //puedo escribir lo siguiente: if (!tieneLimiete)
        //return "Tu cuenta no tiene límites!"; Ó de esta forma(como quiera)
        if(saldo >= 10000){
            saldo -= 10000;
            setTieneLimite(false);
            return "Has roto los límites!";

        }
        return "No tienes saldo suficiente: (";
    }

    public String compararCuenta(Wallet otraWallet){
        if(saldo == otraWallet.getsaldo()){
            return "Las cuentas tienen el mismo saldo";
        }
        if (saldo > otraWallet.getsaldo()){
            return "La segunda cuenta es mayor.";
        }
        return null;
    }

}
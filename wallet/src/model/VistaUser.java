package model;

public class VistaUser {
    public static void main(String[] args) {
        Client customer1 = new Client("Marco");
        Client customer2 = new Client("Raúl");
        String response = customer1.getNombre();
        String response1 = customer2.getNombre();
        System.out.println(response);
        System.out.println(response1);
        System.out.println(customer1.gWallet().saveMoney(10000));
        String response2 = customer1.gWallet().compararCuenta(customer2.gWallet());
        System.out.println(response2);
    }
}

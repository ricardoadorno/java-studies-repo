package Serialização;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ClienteRead {

    public static void main(String[] args) {
        Cliente cliente;
        FileInputStream fluxo;

        try {
            fluxo = new FileInputStream("cliente.ser");
            ObjectInputStream serial = new ObjectInputStream(fluxo);
            cliente = (Cliente) serial.readObject();
            serial.close();
            System.out.println(cliente);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e);
        }

        catch (Exception e) {
            System.out.println("Erro: " + e);
        }

    }
}

package Serialização;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClienteWrite {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("5656165", "João");
        FileOutputStream fluxo;

        try {
            fluxo = new FileOutputStream("cliente.ser");
            ObjectOutputStream serial = new ObjectOutputStream(fluxo);
            serial.writeObject(cliente);
            serial.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e);
        }

        catch (IOException e) {
            System.out.println("Erro: " + e);
        }

    }

}

import java.io.*;

public class Activitat_15 {
    public static void main(String[] args) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("numeros.dat"));
             ObjectOutputStream salidaPar = new ObjectOutputStream(new FileOutputStream("pares.dat"));
             ObjectOutputStream salidaImpar = new ObjectOutputStream(new FileOutputStream("impares.dat"))){

             while(true){
                int numero=entrada.readInt();
                if (numero%2==0){
                    salidaPar.writeInt(numero);
                } else salidaImpar.writeInt(numero);
            }
        }catch (EOFException ex){
            System.out.println("Fin de fichero");
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}

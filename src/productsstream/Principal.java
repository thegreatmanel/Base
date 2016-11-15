/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsstream;
import java.io.*;
/**
 *
 * @author oracle
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product po1 = new Product("cod1", "parafusos", 3);
        Product po2 = new Product("cod2", "arandelas", 4);
        Product po3 = new Product();

    }
    
    try(DataOutputStream out = new DataOutputStream(new FileOutputStream(new File("src"
            + "/productsstream/productos.txt")))){
    out.WriteUTF(po1.getCodigo());
    out.WriteUTF(po1.getDescricion());
    out.writeUTF(po1.getPrezo());
} catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
}
package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient_2 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println(" Ingresa el nombre del producto :   ");
        String name =teclado.nextLine();
        System.out.print("Ingrese el Número : ");
        double num1 = teclado.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese el Número : ");
        double num2 = teclado.nextDouble();
        System.out.println("---------------------------------------------------");
        System.out.print("Ingrese el Número : ");
        double num3 = teclado.nextDouble();
        System.out.println("----------------------------------------------------");

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        XmlRpcClient client = new XmlRpcClient();
        config.setServerURL(new URL("http://localhost:1200"));
        client.setConfig(config);
        Object [] data = {name,num1, num2, num3};
        String response = (String) client.execute("Methods.ejr_2", data);
        System.out.println(response);
    }
}



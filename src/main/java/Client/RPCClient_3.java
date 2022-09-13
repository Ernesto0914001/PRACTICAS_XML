package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient_3 {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("La suma de " +
                "los numeros que esta entre dos numeros, en  cual se van a ingresar:  ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingresa el numero 1");
        int n1 = teclado.nextInt();
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingresa el numero 2");
        int n2 = teclado.nextInt();
        System.out.println("------------------------------------------------------------");

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        XmlRpcClient client = new XmlRpcClient();
        config.setServerURL(new URL("http://localhost:1200"));
        client.setConfig(config);
        Object [] data = {n1, n2};
        Integer response = (Integer) client.execute("Methods.ejr_3", data);
        System.out.println(response);
    }
}

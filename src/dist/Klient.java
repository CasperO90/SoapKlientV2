/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dist;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author j
 */
public class Klient {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9901/feedbacktjeneste?wsdl");
		QName qname = new QName("http://dist/", "ImplService");
		Service service = Service.create(url, qname);
                
                System.out.println("Hello");

    

	}
}



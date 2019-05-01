/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dist;

import static java.lang.System.out;
import javax.xml.ws.Endpoint;
import static javax.xml.ws.Endpoint.publish;

public class Server {
    
    public static void main(String[] args) {
                out.println("publicerer feedbacksystem");
		FeedbackI feedback = new Impl();
		publish("http://[::]:9901/feedbacktjeneste", feedback);
		out.println("Du kan give feedback");
    
}
}

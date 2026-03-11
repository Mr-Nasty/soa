/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3client_;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author devan
 */
public class Prac3Client_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client c = ClientBuilder.newClient();
        WebTarget lower = c.target("http://localhost:8080/Prac3Practice/webresources/lowerupper/lower?lower=KING");
        WebTarget upper = c.target("http://localhost:8080/Prac3Practice/webresources/lowerupper/upper?upper=king");
        String res1 = lower.request(MediaType.TEXT_PLAIN).get(String.class);
        String res2 = upper.request(MediaType.TEXT_PLAIN).get(String.class);
        System.out.println(res1 + " " + res2);
        c.close();
    }
    
}

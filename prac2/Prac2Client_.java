/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac2client_;

/**
 *
 * @author devan
 */
public class Prac2Client_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String CollegeN = collegeName("JaiHind");
        System.out.println(CollegeN);
    }

    private static String collegeName(java.lang.String name) {
        com.college.Prac2WS_Service service = new com.college.Prac2WS_Service();
        com.college.Prac2WS port = service.getPrac2WSPort();
        return port.collegeName(name);
    }
    
}

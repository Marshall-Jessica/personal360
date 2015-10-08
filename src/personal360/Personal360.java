/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personal360;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jessica
 */
public class Personal360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map m1 = new HashMap();

        m1.put("School Password ", "password");
        m1.put("Facebook Password ", "Pa55word");
        m1.put("Bank Password ", "P@55w0rD1234");

        System.out.println("Your Passwords:");
        System.out.println(m1);
        System.out.println(m1.get("Facebook Password"));
        
    }
    
}

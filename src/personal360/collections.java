/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal360;
import java.util.*;

public class collections {

   public static void main(String[] args) {
       
       List PasswordList = new ArrayList();

        PasswordList.add("password");
        PasswordList.add("pa55word");
        PasswordList.add("P@55w0rD1234");

        //access via index
        Object password = PasswordList.get(0);
        Object pa55word = PasswordList.get(1);
        Object Pa55w0rD1234 = PasswordList.get(2);


        //access via Iterator
        Iterator iterator = PasswordList.iterator();
        while(iterator.hasNext()){
          String element = (String) iterator.next();
        }

        //access via new for-loop
        for(Object object : PasswordList) {
            String element = (String) object;
        }
   }
}

package data_structure;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 哈希表
 * Created by admin on 2017/4/13.
 */
public class HashTableDemo {

     public static void main(String args[]){
         //Create a hash map
         Hashtable balance = new Hashtable();
         Enumeration names;
         String str;
         double bal;

         balance.put("Zara",new Double(3322.22));
         balance.put("Mahnaz", new Double(123.22));
         balance.put("Ayan", new Double(1378.00));
         balance.put("Daisy", new Double(99.22));
         balance.put("Qadir", new Double(-19.08));

         //Show all balance in hash table;
         names = balance.keys();
         while (names.hasMoreElements()){
             str = (String) names.nextElement();
             System.out.println(str + ":"+balance.get(str));
         }
         System.out.println();

         //Deposit 2000 into Zara's account
         bal = ((Double)balance.get("Zara")).doubleValue();
         balance.put("Zara",new Double(bal+2000));
         System.out.println("Zara's new balance: "+balance.get("Zara"));

         System.out.println("hash to string  "+balance.toString());
     }

}

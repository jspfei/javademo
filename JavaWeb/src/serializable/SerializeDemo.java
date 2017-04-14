package serializable;

import java.io.*;
public class SerializeDemo{

    public static void main(String arg[]){
      Employee e = new Employee();
      e.name = "ssss";
      e.address = "kkkksss";
      e.SSN = 121321;
      e.number = 101;
      try{

          File file = new File("employee.ser");
          FileOutputStream fileIn =
                  new FileOutputStream(file);
          ObjectOutputStream out = new ObjectOutputStream(fileIn);
          out.writeObject(e);
          out.close();
          fileIn.close();
          System.out.println("Serializabled data is saved in employee.ser");
      }catch(IOException i){
        i.printStackTrace();
      }
    }
}

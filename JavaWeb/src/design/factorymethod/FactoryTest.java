package design.factorymethod;

import design.factorymethod.StaticFM.SenderFactory;
import design.abstract_factory.model.Sender;

/**
 * Created by admin on 2017/5/2.
 */
public class FactoryTest {

    public static void main(String[] args){
       /*
       普遍工厂模式
       SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();*/
    /*
       多个工作模式
      SendFactory factory = new SendFactory();
       Sender sender = factory.produceMail();
       sender.Send();*/

     Sender sender = SenderFactory.produceMail();
     sender.Send();
    }
}

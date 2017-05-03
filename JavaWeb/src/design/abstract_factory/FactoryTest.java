package design.abstract_factory;

import design.abstract_factory.factory.Provider;
import design.abstract_factory.factory.SendMailFactory;
import design.abstract_factory.model.Sender;

/**
 * Created by admin on 2017/5/2.
 */
public class FactoryTest {

    public static void main(String[] args){
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}

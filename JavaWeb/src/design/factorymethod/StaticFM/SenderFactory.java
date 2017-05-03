package design.factorymethod.StaticFM;

import design.abstract_factory.model.MailSender;
import design.abstract_factory.model.Sender;
import design.abstract_factory.model.SmsSender;

/**
 * Created by admin on 2017/5/2.
 */
public class SenderFactory {
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}

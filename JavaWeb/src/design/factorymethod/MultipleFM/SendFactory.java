package design.factorymethod.MultipleFM;

import design.abstract_factory.model.MailSender;
import design.abstract_factory.model.Sender;
import design.abstract_factory.model.SmsSender;

/**
 * Created by admin on 2017/5/2.
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}

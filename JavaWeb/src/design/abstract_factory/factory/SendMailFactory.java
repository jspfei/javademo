package design.abstract_factory.factory;

import design.abstract_factory.model.MailSender;
import design.abstract_factory.model.Sender;

/**
 * Created by admin on 2017/5/2.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}

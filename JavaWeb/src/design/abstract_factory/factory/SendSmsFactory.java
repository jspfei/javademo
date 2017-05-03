package design.abstract_factory.factory;

import design.abstract_factory.model.Sender;
import design.abstract_factory.model.SmsSender;

/**
 * Created by admin on 2017/5/2.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

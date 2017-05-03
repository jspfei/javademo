package design.factorymethod.GeneralFM;

import design.abstract_factory.model.MailSender;
import design.abstract_factory.model.Sender;
import design.abstract_factory.model.SmsSender;

/**
 * Created by admin on 2017/5/2.
 */
public class SendFactory {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型");
            return null;
        }
    }
}

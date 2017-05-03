package design.builder;

import design.builder.model.MailSender;
import design.builder.model.Sender;
import design.builder.model.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/5/2.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMaiSender(int count){
        for(int i = 0;i<count;i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i = 0;i<count;i++){
            list.add(new SmsSender());
        }
    }
}

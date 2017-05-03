package design.abstract_factory.model;

/**
 * Created by admin on 2017/5/2.
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}

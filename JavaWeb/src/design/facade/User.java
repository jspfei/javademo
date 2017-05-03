package design.facade;

import design.facade.source.Computer;

/**
 * Created by admin on 2017/5/2.
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
    }

package design.flyweight;

import java.sql.Connection;

/**
 * Created by admin on 2017/5/3.
 */
public class ConnectionPoolTest {
    public static void main(String[] args){
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection =connectionPool.getConnection();
    }
}

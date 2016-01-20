package ru.savochkindv.patterns.pool_manager;

import org.junit.Before;
import org.junit.Test;
import ru.savochkindv.patterns.pool_manager.exceptions.EmptyPoolException;

import static org.junit.Assert.fail;

/**
 * Created by savochkindv on 20.01.2016.
 */
public class ConnectionPoolTest {

    @Before
    public void setUp() throws Exception {
        ConnectionPool.addConnections(5);
    }

    @Test(expected = EmptyPoolException.class)
    public void testUsedPool() throws Exception {
        ConnectionPool.getConnection();
        ConnectionPool.getConnection();
        ConnectionPool.getConnection();
        ConnectionPool.getConnection();
        ConnectionPool.getConnection();
        ConnectionPool.getConnection();
    }

    @Test
    public void testUseAndRelease() throws Exception {
        ConnectionPool.getConnection();
        ConnectionPool.getConnection();
        ConnectionPool.getConnection();
        ConnectionPool.getConnection();
        IConnection connection = ConnectionPool.getConnection();
        ConnectionPool.releaseConnection(connection);
        try {
            ConnectionPool.getConnection();
        } catch (EmptyPoolException epe) {
            fail();
        }
    }
}
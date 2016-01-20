package ru.savochkindv.patterns.pool_manager;

import ru.savochkindv.patterns.pool_manager.exceptions.EmptyPoolException;

/**
 * Пул соединений
 * Created by savochkindv on 20.01.2016.
 */
public class ConnectionPool {//синглетон

    private static PoolManager pool = new PoolManager();

    /**
     * Добовляет заданное количество соединений в пул
     *
     * @param number количество
     */
    public static void addConnections(int number) {
        for (int i = 0; i < number; i++)
            pool.add(new ConnectionImpl());
    }

    /**
     * Возвращает соединение
     *
     * @return соединение
     * @throws EmptyPoolException пулл объектов пуст или все объекты пула заняты
     */
    public static IConnection getConnection() throws EmptyPoolException {
        return (IConnection) pool.get();
    }

    /**
     * Освобождает соединение
     *
     * @param c соединение
     */
    public static void releaseConnection(IConnection c) {
        pool.release(c);
    }
}

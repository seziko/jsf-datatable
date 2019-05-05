package dao;

import org.hibernate.Session;
import util.HibernateUtil;

public abstract class BaseDao {

    private Session session = HibernateUtil.getSession();

    public Session getSession() {
        return session;
    }
}

package react_db.db.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import react_db.db.entity.Login;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LoginIMPL implements LoginDao{

    private final EntityManager entityManager;

    @Autowired
    public LoginIMPL(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    @Transactional
    public List<Login> findAllLogin() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Login> myQuery = currentSession.createQuery("from Login");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Login findByLoginId(int loginId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Login.class, loginId);
    }

    @Override
    @Transactional
    public  void saveOrUpdateLogin(Login theLogin) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theLogin);
    }

    @Override
    @Transactional
    public void deleteByLoginId(int loginId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Login myLogin = currentSession.get(Login.class, loginId);
        currentSession.delete(myLogin);
    }
}

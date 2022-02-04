package com.contacts.demo.dao;
//be sure to check imports
import com.contacts.demo.entity.Contact;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ContactIMPL implements ContactDao{

    private final EntityManager entityManager;

    @Autowired
    public ContactIMPL(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    @Transactional
    public List<Contact> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Contact> myQuery = currentSession.createQuery("from Contact");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Contact findById(int contactId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Contact.class, contactId);
    }

    @Override
    @Transactional
    public  void saveOrUpdate(Contact theContact) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theContact);
    }

    @Override
    @Transactional
    public void deleteById(int contactId) {
        Session currentSession = entityManager.unwrap(Session.class);
       Contact myContact = currentSession.get(Contact.class, contactId);
        currentSession.delete(myContact);
    }

}

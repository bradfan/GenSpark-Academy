package com.contacts.demo.service;

import com.contacts.demo.dao.ContactDao;
import com.contacts.demo.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceIMPL {
    private final ContactDao contactDao;

    @Autowired
    public ContactServiceIMPL(ContactDao contactDao) {this.contactDao = contactDao; }

    @Override
    public List<Contact> findAll() {return contactDao.findAll();}

    @Override
    public Object findById(int contactId) {return contactDao.findById(contactId);}

    @Override
    public void saveOrUpdate(Contact theContact) {contactDao.saveOrUpdate(theContact);}

    @Override
    public void deleteById(int contactId) {contactDao.deleteById(contactId);}
}

package com.contacts.demo.dao;


import com.contacts.demo.entity.Contact;

import java.util.List;

//DAO = Data Access Object
public interface ContactDao {
    List<Contact> findAll();
    Object findById();
    void saveOrUpdate(Contact theContact);
    void deleteById(int contactId);
}

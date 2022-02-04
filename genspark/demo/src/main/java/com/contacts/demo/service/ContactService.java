package com.contacts.demo.service;

import com.contacts.demo.entity.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Object findById();
    void saveOrUpdate(Contact theContact);
    void deleteById(int contactId);
}

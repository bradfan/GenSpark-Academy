package com.contacts.demo.controller;


import com.contacts.demo.entity.Contact;
import com.contacts.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    public final ContactService contactService;

//    Constructor Injection


    @Autowired
    ContactController(@Qualifier("contactServiceIMPL") ContactService contactService) {this.contactService = contactService;}

    //   localhost:8080/retrieveAll
    @GetMapping("/retrieveAll")
    public List<Contact> findAll() {
        return contactService.findAll();
    }

    //   localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{contactId}")
    public Object findById(@PathVariable int contactId) {
        return contactService.findById(contactId);
    }

    //   localhost:8080/addContact
    @PostMapping("/addContact")
    public Contact addContact(@RequestBody Contact theContact) {
        theContact.setId(0);
        contactService.saveOrUpdate(theContact);
        return theContact;
    }

    //   localhost:8080/updateContact
    @PutMapping("/updateContact")
    public Contact updateContact(@RequestBody Contact updateContact) {
        contactService.saveOrUpdate(updateContact);
        return updateContact;
    }

    //    localhost:8080/deleteById/1
    @DeleteMapping("/deleteById/{contactId}")
    public String deleteById(@PathVariable int contactId) {
        contactService.deleteById(contactId);
        return "Deleted genre ID: " + contactId;
    }
}

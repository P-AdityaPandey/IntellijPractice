package com.dwar.journalApp.controller;


import com.dwar.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMAP<>();//consider as a table


    @GetMapping("/abc")
    public List<JournalEntry> getAll(){

        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public void createEntry(){ // we need to create a resource where? in body of postman.

    }

}

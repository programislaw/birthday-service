package com.sbak.birthdays.controller;

import com.sbak.birthdays.model.Birthday;
import com.sbak.birthdays.service.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Bak
 */

@RestController
@RequestMapping("/birthdays")
public class BirthdayController {

    private final BirthdayService birthdayService;

    @Autowired
    public BirthdayController(BirthdayService birthdayService) {
        this.birthdayService = birthdayService;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET)
    public List<Birthday> getAllBirthdays() {
        return birthdayService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value="/create")
    public void create() {
        birthdayService.create("Bolesław", "Chrobry", new Date());
    }
}


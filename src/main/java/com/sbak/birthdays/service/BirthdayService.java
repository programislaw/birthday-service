package com.sbak.birthdays.service;

import java.util.Date;
import java.util.List;

import com.sbak.birthdays.dao.BirthdayDao;
import com.sbak.birthdays.model.Birthday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bak
 */
@Service
@Transactional
public class BirthdayService {

    private final BirthdayDao birthdayDao;

    @Autowired
    public BirthdayService(BirthdayDao birthdayDao) {
        this.birthdayDao = birthdayDao;
    }

    public void create(String firstname, String secondname, Date date) {
        Birthday birthday = new Birthday(firstname, secondname, date);
        birthdayDao.create(birthday);
    }

    public List<Birthday> getAll() {

        List<Birthday> birthdays = birthdayDao.findAll();
        return birthdays;
    }


}

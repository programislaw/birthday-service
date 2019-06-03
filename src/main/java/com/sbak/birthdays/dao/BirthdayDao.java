package com.sbak.birthdays.dao;

import com.sbak.birthdays.model.Birthday;
import org.springframework.stereotype.Repository;

@Repository
public class BirthdayDao extends BaseDao {

    public BirthdayDao(){
        setClazz(Birthday.class );
    }
}

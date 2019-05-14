package com.king.demo.service.impl;

import com.king.demo.dao.PersonMapperDao;
import com.king.demo.entity.Person;
import com.king.demo.service.PersonService;

/**
 * Title:
 * Author: libinbin
 * Date: 2019/5/14 11:41
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapperDao personMapperDao;

    public Person findPersonById(long id) {
        return personMapperDao.findPersonById(id);
    }
}

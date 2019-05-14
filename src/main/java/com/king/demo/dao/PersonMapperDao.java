package com.king.demo.dao;

import com.king.demo.entity.Person;

/**
 * Title:
 * Author: libinbin
 * Date: 2019/5/14 11:38
 */
@Repository
public interface PersonMapperDao {
    Person findPersonById(long id);
}

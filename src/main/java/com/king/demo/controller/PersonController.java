package com.king.demo.controller;

import com.king.demo.entity.Person;
import com.king.demo.service.PersonService;

import java.io.IOException;

/**
 * Title:
 * Author: libinbin
 * Date: 2019/5/14 11:37
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/selectPerson")
    public void selectPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        long personId = Long.parseLong(request.getParameter("id"));
        Person person =personService.findPersonById(personId);

        ObjectMapper mapper = new ObjectMapper();

        response.getWriter().write(mapper.writeValueAsString(person));
        response.getWriter().close();
    }
}

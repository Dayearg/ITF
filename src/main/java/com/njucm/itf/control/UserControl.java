package com.njucm.itf.control;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.njucm.itf.dao.User;
import com.njucm.itf.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "/User")
public class UserControl {
    @Autowired
    private UserService US;
    private ObjectMapper mapper = new ObjectMapper();
    @GetMapping(path = "/getAll")
    public @ResponseBody
    String  getAllUsers() throws JsonProcessingException {
        return mapper.writeValueAsString(US.getAllUsers());
    }

    @PostMapping(path = "/get")
    public @ResponseBody
    String findByNameAndPassword(String name, String password) throws JsonProcessingException {
        return mapper.writeValueAsString(US.findByNameAndPassword(name, password));
    }

    @PostMapping(path = "/getName")
    public @ResponseBody
    List<User> findByName(String name) {
        return US.findByName(name);
    }

    @PostMapping(path = "/add")
    public @ResponseBody
    boolean add(String name, String password) {
        return US.add(name, password);
    }
}

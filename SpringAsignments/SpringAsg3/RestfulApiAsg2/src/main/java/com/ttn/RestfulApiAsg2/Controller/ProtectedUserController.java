package com.ttn.RestfulApiAsg2.Controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import com.ttn.RestfulApiAsg2.Entity.ProtectedUser;
import com.ttn.RestfulApiAsg2.Service.ProtectedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProtectedUserController {

    @Autowired
    ProtectedUserService protectedUserService;

    @GetMapping("/protectedUsers")
    public List<ProtectedUser> getAllProtectedUsersStaticFiltr(){
        return protectedUserService.getAllProtectedUsers();
    }

    @GetMapping("/protectedUsersFiltered")
    public MappingJacksonValue getAllProtectedUsersDynamicFiltr(){

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(protectedUserService.getAllProtectedUsers());

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("protectedUserId","protectedUserName","staticPassword");
        FilterProvider filterProvider =new SimpleFilterProvider().addFilter("UserPasswordFilter",filter);
        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;

    }

    @PostMapping("/protectedUsers")
    public MappingJacksonValue addProtectedUser(@RequestBody ProtectedUser protectedUser){
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(protectedUserService.addProtectedUser(protectedUser));

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("protectedUserId","protectedUserName","staticPassword");
        FilterProvider filterProvider =new SimpleFilterProvider().addFilter("UserPasswordFilter",filter);
        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;

    }
}

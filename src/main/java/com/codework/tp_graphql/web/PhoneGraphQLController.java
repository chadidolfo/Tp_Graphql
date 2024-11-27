package com.codework.tp_graphql.web;

import com.codework.tp_graphql.dao.entities.Phone;
import com.codework.tp_graphql.service.PhoneManager;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PhoneGraphQLController {

   // Constructor Injection of the PhoneManager service
    private final PhoneManager phoneManager;

    public PhoneGraphQLController(PhoneManager phoneManager) {
        this.phoneManager = phoneManager;
    }

    @QueryMapping
    public List<Phone> getAllPhones() {
        return phoneManager.getAllPhones();
    }

    @QueryMapping
    public List<Phone> getPhonesByModel(@Argument String model) {
        return phoneManager.getAllPhonesByModel(model);
    }

    @QueryMapping
    public List<Phone> getPhoneByModelAndPrice(@Argument String model, @Argument Double price) {
        return phoneManager.getAAllPhonesByModelAndPrice(model, price);
    }

    @MutationMapping
    public Phone savePhone(@Argument Phone phone) {
        return phoneManager.addPhone(phone);
    }

    @MutationMapping
    public Boolean deletePhone(@Argument Long id) {
        phoneManager.deletePhoneById(id);
        return true;
    }
}

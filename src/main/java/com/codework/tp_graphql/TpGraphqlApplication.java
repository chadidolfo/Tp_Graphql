package com.codework.tp_graphql;

import com.codework.tp_graphql.dao.entities.Phone;
import com.codework.tp_graphql.dao.repositories.PhoneRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TpGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpGraphqlApplication.class, args);
    }
    @Bean
    CommandLineRunner start(PhoneRepo phoneRepo) {
        return (args) -> {
            List<Phone> phoneList = new ArrayList<>();
            phoneList.add(new Phone("Moto G", "red", "11122233", 150.00));
            phoneList.add(new Phone("Pixel 6", "blue", "22233344", 650.00));
            phoneList.add(new Phone("iPhone 12", "black", "33344455", 800.00));
            phoneList.add(new Phone("Galaxy A52", "green", "44455566", 400.00));


            phoneRepo.saveAll(phoneList);

        };
    }

}

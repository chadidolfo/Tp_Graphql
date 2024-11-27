package com.codework.tp_graphql.dao.repositories;

import com.codework.tp_graphql.dao.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepo extends JpaRepository<Phone ,Long > {
    public List<Phone> getAllPhonesByModel(String model);
    public List<Phone> getAllPhonesByPrice(double price);
    public List<Phone> getAllPhonesByModelAndPrice(String model, double price);
    public Phone getPhoneByIMEI(String imei);
    public void deletePhonesByIMEI(String IMEI);


}

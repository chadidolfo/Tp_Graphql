package com.codework.tp_graphql.service;

import com.codework.tp_graphql.dao.entities.Phone;

import java.util.List;

public interface PhoneManager {
    Phone addPhone(Phone phone);
    Phone getPhoneById(Long id);
    Phone getPhoneByIMEI(String imei);
    Phone updatePhone(Phone phone);
    void deletePhoneById(Long id);
    void deletePhoneByIMEI(String imei );
    List<Phone> getAllPhones();
    List<Phone> getAllPhonesByModel(String model);
    List<Phone> getAllPhonesByPrice(double price);
    List<Phone> getAAllPhonesByModelAndPrice(String model, double price);
}

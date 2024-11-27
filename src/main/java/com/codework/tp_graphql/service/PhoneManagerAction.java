package com.codework.tp_graphql.service;

import com.codework.tp_graphql.dao.entities.Phone;
import com.codework.tp_graphql.dao.repositories.PhoneRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneManagerAction implements PhoneManager{

    private final PhoneRepo phoneRepo;

    public PhoneManagerAction(PhoneRepo phoneRepo) {
        this.phoneRepo = phoneRepo;
    }

    @Override
    public Phone addPhone(Phone phone)  {
        String imei = phone.getIMEI();
        if(phoneRepo.getPhoneByIMEI(imei) != null) {
            throw new RuntimeException("Phone IMEI Already Exist");
        }

        return phoneRepo.save(phone);
    }

    @Override
    public Phone getPhoneById(Long id) {
        return phoneRepo.findById(id).orElseThrow(
                ()->new RuntimeException("Phone not found")
        );
    }

    @Override
    public Phone getPhoneByIMEI(String imei) {
        return phoneRepo.getPhoneByIMEI(imei);
    }

    @Override
    public Phone updatePhone(Phone phone) {
        return null;
    }

    @Override
    public void deletePhoneById(Long id) {
        phoneRepo.deleteById(id);
    }

    @Override
    public void deletePhoneByIMEI(String imei) {
        phoneRepo.deletePhonesByIMEI(imei);
    }

    @Override
    public List<Phone> getAllPhones() {
        return phoneRepo.findAll();
    }

    @Override
    public List<Phone> getAllPhonesByModel(String model) {
        return phoneRepo.getAllPhonesByModel(model);
    }

    @Override
    public List<Phone> getAllPhonesByPrice(double price) {
        return phoneRepo.getAllPhonesByPrice(price);
    }

    @Override
    public List<Phone> getAAllPhonesByModelAndPrice(String model, double price) {
        return phoneRepo.getAllPhonesByModelAndPrice(model, price);
    }
}

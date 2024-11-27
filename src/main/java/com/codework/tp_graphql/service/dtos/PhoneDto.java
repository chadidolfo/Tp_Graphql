package com.codework.tp_graphql.service.dtos;
//PhoneDTO (model, color, IMEI, price)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhoneDto {

    private String model;
    private String  color;
    private String  IMEI;
    private double price;
}

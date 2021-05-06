package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO(Seller entity){
        id = entity.getId();
        name = entity.getName();
    }
}
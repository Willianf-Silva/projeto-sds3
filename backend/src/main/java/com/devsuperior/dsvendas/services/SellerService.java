package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDTO;

import java.util.List;

public interface SellerService {
    List<SellerDTO> findAll();
}
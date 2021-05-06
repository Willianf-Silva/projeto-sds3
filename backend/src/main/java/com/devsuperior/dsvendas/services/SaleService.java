package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SaleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SaleService {
    Page<SaleDTO> findAll(Pageable pageable);
}
package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SaleService {
    Page<SaleDTO> findAll(Pageable pageable);
    List<SaleSumDTO> amountGroupedBySeller();
    List<SaleSuccessDTO> successGroupedBySeller();
}
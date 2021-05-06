package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> response = saleService.findAll(pageable);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
        List<SaleSumDTO> response = saleService.amountGroupedBySeller();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
        List<SaleSuccessDTO> response = saleService.successGroupedBySeller();
        return ResponseEntity.ok(response);
    }
}
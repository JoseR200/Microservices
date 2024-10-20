package com.socialsynergy.payment.controller;

import com.socialsynergy.payment.entity.Receipt;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "receipts")
@Tag(name = "Receipt", description = "Receipt Management Endpoints")
public class ReceiptsController {

    @GetMapping("/list")
    public Receipt getAllReceipts() {
        return new Receipt(1L, "Hello");
    }
}
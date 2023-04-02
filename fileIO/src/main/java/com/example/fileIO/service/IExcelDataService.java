package com.example.fileIO.service;

import com.example.fileIO.entity.Invoice;

import java.util.List;

public interface IExcelDataService {

    List<Invoice> getExcelDataAsList();

    int saveExcelData(List<Invoice> invoices);
}
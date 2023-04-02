package com.example.Export_Excel.service;

import com.example.Export_Excel.model.Invoice;

import java.util.List;

public interface IInvoiceService {

    public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);

}
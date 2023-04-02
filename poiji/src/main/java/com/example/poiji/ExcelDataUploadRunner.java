package com.example.poiji;

import com.example.poiji.repository.InvoiceRepository;
import com.example.poiji.service.ExcelPoijiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExcelDataUploadRunner implements CommandLineRunner {

    @Autowired
    InvoiceRepository repo;

    @Autowired
    ExcelPoijiService excelPoijiService;

    @Override
    public void run(String... args) {

        repo.saveAll(excelPoijiService.getListfromExcelData());
    }

}
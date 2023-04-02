package com.example.poiji.service;

import com.example.poiji.entity.Invoice;
import com.poiji.bind.Poiji;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class ExcelPoijiServiceImpl implements ExcelPoijiService{
    @Value("${filePath}")
    public String FILE_PATH;

    public List<Invoice> getListfromExcelData() {
        File file = new File(FILE_PATH);
        List<Invoice> invoices = Poiji.fromExcel(file, Invoice.class);
        return invoices;
    }
}

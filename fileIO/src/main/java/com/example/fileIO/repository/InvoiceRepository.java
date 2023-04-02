package com.example.fileIO.repository;

import com.example.fileIO.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author MSI
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}

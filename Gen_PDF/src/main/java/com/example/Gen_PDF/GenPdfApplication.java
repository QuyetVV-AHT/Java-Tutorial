package com.example.Gen_PDF;

import com.example.Gen_PDF.util.pdf.PDFGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Gen_PDF"})
public class GenPdfApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(GenPdfApplication.class, args);
		PDFGenerator pDFGenerator = ac.getBean("pdfGenerator",PDFGenerator.class);

		pDFGenerator.generatePdfReport();
	}

}

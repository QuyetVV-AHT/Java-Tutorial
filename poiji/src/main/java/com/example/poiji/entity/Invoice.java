package com.example.poiji.entity;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellName;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ExcelCellName("Question_ID") // ("Name") is the column name in excel
    private String Question_ID;

    @ExcelCellName("Question")
    private String Question;
    @ExcelCellName("Ans_A")
    private String Ans_A;
    @ExcelCellName("Ans_B")
    private String Ans_B;
    @ExcelCellName("Ans_C")
    private String Ans_C;
    @ExcelCellName("Ans_D")
    private String Ans_D;
    @ExcelCellName("Ans_Correct")
    private String Ans_Correct;
    @ExcelCellName("Note")
    private String note;

}
package com.chilioil.autoimport.read;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;


@Data
public class DemoData {

    private String string;
    private Date date;
    private Double doubleData;
}

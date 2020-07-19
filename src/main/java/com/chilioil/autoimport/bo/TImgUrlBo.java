package com.chilioil.autoimport.bo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class TImgUrlBo {

    @ExcelProperty(value = {"text2"}, index = 0)
    private String k;

    @ExcelProperty(value = {"image"}, index = 1)
    private String v;

}

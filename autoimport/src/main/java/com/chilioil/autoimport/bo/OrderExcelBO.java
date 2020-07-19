package com.chilioil.autoimport.bo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

@Data
public class OrderExcelBO extends BaseRowModel {

    /**
     * 主key
     */
    @ExcelProperty(value = {"Text2"}, index = 0)
    private String id;

    /**
     * 图片URLS
     */
    @ExcelProperty(value = {"urlImages"}, index = 1)
    private String urlImages;

}

package com.chilioil.autoimport.controller;


import com.chilioil.autoimport.bo.TImgUrlBo;
import com.chilioil.autoimport.service.TImgUrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/excel/handler")
@Slf4j
public class ExcelController {

    @Autowired
    private TImgUrlService tImgUrlService;

    @GetMapping("/import")
    public void excelHandler(){
        tImgUrlService.save();
    }

    @GetMapping("/export")
    public List<TImgUrlBo> outData(){
        return tImgUrlService.outData();
    }
}

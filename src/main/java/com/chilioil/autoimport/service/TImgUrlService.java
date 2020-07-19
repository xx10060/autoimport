package com.chilioil.autoimport.service;

import com.chilioil.autoimport.bo.TImgUrlBo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TImgUrlService {
    void save();

    List<TImgUrlBo> outData();
}

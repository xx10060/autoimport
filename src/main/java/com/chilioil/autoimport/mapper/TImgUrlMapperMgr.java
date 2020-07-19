package com.chilioil.autoimport.mapper;

import com.chilioil.autoimport.bo.TImgUrlBo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TImgUrlMapperMgr {

    int insert(List<TImgUrlBo> list);

    List<TImgUrlBo> selectAll();

}

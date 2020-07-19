package com.chilioil.autoimport.service.impl;

import com.alibaba.excel.EasyExcel;
import com.chilioil.autoimport.bo.TImgUrlBo;
import com.chilioil.autoimport.datalistener.ImgUrlDataListener;
import com.chilioil.autoimport.mapper.TImgUrlMapperMgr;
import com.chilioil.autoimport.service.TImgUrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TImgUrlServiceImpl implements TImgUrlService {

    @Autowired
    private TImgUrlMapperMgr tImgUrlMapperMgr;


    @Override
    public void save() {
        String fileName = "D:/data/1.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, TImgUrlBo.class, new ImgUrlDataListener(tImgUrlMapperMgr)).sheet().doRead();
    }

    @Override
    public List<TImgUrlBo> outData() {
        List<TImgUrlBo> list = tImgUrlMapperMgr.selectAll();

        String fileName = "D:/data/2.xlsx";
        // 这里 需要指定写用哪个class去读，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
//        String fileName = TestFileUtil.getPath() + "write" + System.currentTimeMillis() + ".xlsx";
        EasyExcel.write(fileName, TImgUrlBo.class).sheet("sheet1").doWrite(list);
        return list;
    }

}

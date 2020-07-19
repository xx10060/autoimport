package com.chilioil.autoimport;

import com.alibaba.excel.EasyExcel;
import com.chilioil.autoimport.mapper.TImgUrlMapper;
import com.chilioil.autoimport.read.DemoData;
import com.chilioil.autoimport.read.DemoData1;
import com.chilioil.autoimport.read.DemoDataListener;
import com.chilioil.autoimport.read.myListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class test {

    @Autowired
    private TImgUrlMapper tImgUrlMapper;

    @Test
    public void simpleRead() {
        String fileName = "D:/data/1.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).sheet().doRead();
    }

    @Test
    public void simpleWrite() {
        String fileName = "D:/data/2.xlsx";
        // 这里 需要指定写用哪个class去读，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data());
    }

    @Test
    public void simpleRead1() {
        String fileName = "D:/data/1.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, DemoData1.class, new myListener(tImgUrlMapper)).sheet().doRead();
    }

    private List<DemoData> data() {
        List<DemoData> list = new ArrayList<DemoData>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }
        return list;
    }
}

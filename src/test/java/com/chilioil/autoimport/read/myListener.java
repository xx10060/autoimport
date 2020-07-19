package com.chilioil.autoimport.read;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.chilioil.autoimport.bean.TImgUrl;
import com.chilioil.autoimport.mapper.TImgUrlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class myListener extends AnalysisEventListener<DemoData1> {

    private static final Logger LOGGER = LoggerFactory.getLogger(myListener.class);

    private static final int BATCH_COUNT = 5;
    List<DemoData1> list = new ArrayList<>();
    List<TImgUrl> rList =  new ArrayList<>();
    TImgUrl tImgUrl = new TImgUrl();

    private TImgUrlMapper tImgUrlMapper;

    public myListener(TImgUrlMapper tImgUrlMapper) {
        this.tImgUrlMapper = tImgUrlMapper;
    }

    @Override
    public void invoke(DemoData1 demoData1, AnalysisContext analysisContext) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(demoData1));
        list.add(demoData1);
        tImgUrl.setK(demoData1.getText2());
        tImgUrl.setV(demoData1.getImage());
        rList.add(tImgUrl);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
            rList.clear();
        }
        tImgUrl = new TImgUrl();
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        tImgUrlMapper.insertSelective(rList.get(0));
//        demoDAO.save(list);
        LOGGER.info("存储数据库成功！");
    }
}
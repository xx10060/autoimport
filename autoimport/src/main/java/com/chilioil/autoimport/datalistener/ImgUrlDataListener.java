package com.chilioil.autoimport.datalistener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.chilioil.autoimport.bo.TImgUrlBo;
import com.chilioil.autoimport.mapper.TImgUrlMapperMgr;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ImgUrlDataListener extends AnalysisEventListener<TImgUrlBo> {

    private List<TImgUrlBo> list = new ArrayList<>();

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;

    private TImgUrlMapperMgr tImgUrlMapperMgr;

    public ImgUrlDataListener(TImgUrlMapperMgr tImgUrlMapperMgr) {
        this.tImgUrlMapperMgr = tImgUrlMapperMgr;
    }

    @Override
    public void invoke(TImgUrlBo tImgUrlBo, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", JSON.toJSONString(tImgUrlBo));
        list.add(tImgUrlBo);
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        log.info("{}条数据，开始存储数据库！", list.size());
        tImgUrlMapperMgr.insert(list);
        log.info("存储数据库成功！");
    }
}

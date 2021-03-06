package com.hotien.service.thread;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.hotien.facade.vo.ExternalUniqueVo;
import com.hotien.service.CommonService;
import com.util.ServiceManager;

/**
 * 
  * @ClassName: DataSyncThread
  * @Description: TODO
  * Copyright: Copyright (c) 2017 
  * @author hotien
  * @date 2017年4月14日 下午2:31:44
  *
 */
public class DataSyncThread extends Thread
{
    private CommonService commonService = ServiceManager.getService(CommonService.class);
    
    private String source;
    
    private List<ExternalUniqueVo> dataList;
    
    public DataSyncThread(String source, List<ExternalUniqueVo> dataList)
    {
        this.source=source;
        this.dataList=dataList;
    }
    
    @Override
    public void run()
    {
        if (StringUtils.isBlank(source) || CollectionUtils.isEmpty(dataList))
        {
            return;
        }
        String result = commonService.sayHello();
        System.out.println(result);
    }
}

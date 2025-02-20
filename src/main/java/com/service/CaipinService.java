package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinEntity;
import java.util.Map;

/**
 * 菜品 服务类
 * @author 
 * @since 2021-04-15
 */
public interface CaipinService extends IService<CaipinEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}
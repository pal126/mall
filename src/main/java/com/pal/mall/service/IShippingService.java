package com.pal.mall.service;

import com.github.pagehelper.PageInfo;
import com.pal.mall.common.ServerResponse;
import com.pal.mall.pojo.Shipping;

/**
 * Created by pal
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId,Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}

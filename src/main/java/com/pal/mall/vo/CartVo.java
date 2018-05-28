package com.pal.mall.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by pal
 */
@Getter
@Setter
public class CartVo {

    private List<CartProductVo> cartProductVoList;
    private BigDecimal cartTotalPrice;
    //是否已经都勾选
    private Boolean allChecked;
    private String imageHost;

}

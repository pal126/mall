package com.pal.mall.service;

import com.pal.mall.common.ServerResponse;
import com.pal.mall.pojo.Category;

import java.util.List;

/**
 * Created by pal
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}

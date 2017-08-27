package com.sunxu.springmvc.service;

import com.sunxu.springmvc.pojo.Items;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ItemService {
    // 查询商品列表
    public List<Items> selectItemsList();
}

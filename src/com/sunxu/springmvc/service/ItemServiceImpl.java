package com.sunxu.springmvc.service;

import com.sunxu.springmvc.dao.ItemsMapper;
import com.sunxu.springmvc.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 查询商品信息
 * @author sunxu
 *
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemsMapper itemsMapper;

    // 查询商品列表
    public List<Items> selectItemsList() {
        return itemsMapper.selectByExampleWithBLOBs(null);
    }
}

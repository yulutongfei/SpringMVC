package com.sunxu.springmvc.controller;

import com.sunxu.springmvc.pojo.Items;
import com.sunxu.springmvc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 商品管理
 * @author sunxu
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;
    // 入门程序
    @RequestMapping(value = "/item/itemlist.action")
    public ModelAndView itemList() {
        // 从mysql中查询

        List<Items> list = itemService.selectItemsList();
        ModelAndView mav = new ModelAndView();
        mav.addObject("itemList", list);
        mav.setViewName("itemList");
        return mav;
    }
}

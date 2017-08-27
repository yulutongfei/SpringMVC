package com.sunxu.springmvc.controller;

import com.sunxu.springmvc.pojo.Items;
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

    // 入门程序
    @RequestMapping(value = "/item/itemlist.action")
    public ModelAndView itemList() {
        // 创建页面需要显示的商品数据
        List<Items> list = new ArrayList<>();
        list.add(new Items(1, "1华为 荣耀8", 2399f, new Date(), "质量好！1"));
        list.add(new Items(2, "2华为 荣耀8", 2399f, new Date(), "质量好！2"));
        list.add(new Items(3, "3华为 荣耀8", 2399f, new Date(), "质量好！3"));
        list.add(new Items(4, "4华为 荣耀8", 2399f, new Date(), "质量好！4"));
        list.add(new Items(5, "5华为 荣耀8", 2399f, new Date(), "质量好！5"));
        list.add(new Items(6, "6华为 荣耀8", 2399f, new Date(), "质量好！6"));

        ModelAndView mav = new ModelAndView();
        mav.addObject("itemList", list);
        mav.setViewName("/WEB-INF/jsp/itemList.jsp");
        return mav;
    }
}

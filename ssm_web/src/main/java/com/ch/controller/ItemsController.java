package com.ch.controller;

import com.ch.dao.ItemsDao;
import com.ch.domain.Items;
import com.ch.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class ItemsController {
    @Autowired
   private ItemsService itemsService;
    @RequestMapping("/showItem")
    public String showIteml(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "ViewItem";
    }
}

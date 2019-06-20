package com.ch.service.impl;

import com.ch.dao.ItemsDao;
import com.ch.domain.Items;
import com.ch.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService{
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(int id) {
        return itemsDao.findById(id);
    }
}

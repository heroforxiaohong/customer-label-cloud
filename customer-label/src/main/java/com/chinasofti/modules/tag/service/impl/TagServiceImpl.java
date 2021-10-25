package com.chinasofti.modules.tag.service.impl;

import com.chinasofti.modules.tag.dao.TagDao;
import com.chinasofti.modules.tag.pojo.Tag;
import com.chinasofti.modules.tag.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDao tagDao;

    @Override
    public List<Tag> getTagList() {
        return tagDao.getTagList();
    }
}

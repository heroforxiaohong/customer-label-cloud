package com.chinasofti.modules.tag.controller;

import com.chinasofti.modules.tag.pojo.Tag;
import com.chinasofti.modules.tag.service.TagService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping("/getTagList")
    public List<Tag> getTagList(){
        PageHelper.startPage(1,5);
        List<Tag> tagList = tagService.getTagList();
        PageInfo pageInfo = new PageInfo(tagList);
        for (Tag tag : tagList) {
            System.out.println(tag);
        }
        return tagList;
    }

}

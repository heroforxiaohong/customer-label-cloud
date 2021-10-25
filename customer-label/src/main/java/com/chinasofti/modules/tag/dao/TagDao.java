package com.chinasofti.modules.tag.dao;

import com.chinasofti.modules.tag.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagDao {

    List<Tag> getTagList();

}

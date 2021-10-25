package com.chinasofti.modules.tag.pojo;

import java.io.Serializable;

public class Tag implements Serializable {

    private Long tag_id;

    private String tag_name;

    private String tag_code;

    public Tag(Long tag_id, String tag_name, String tag_code) {
        this.tag_id = tag_id;
        this.tag_name = tag_name;
        this.tag_code = tag_code;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tag_id=" + tag_id +
                ", tag_name='" + tag_name + '\'' +
                ", tag_code='" + tag_code + '\'' +
                '}';
    }

    public Long getTag_id() {
        return tag_id;
    }

    public void setTag_id(Long tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public String getTag_code() {
        return tag_code;
    }

    public void setTag_code(String tag_code) {
        this.tag_code = tag_code;
    }
}

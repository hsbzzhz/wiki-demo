package com.grundfos.wiki.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DocMapperCust {
    public void increaseViewCount(@Param("id") Long id);
}

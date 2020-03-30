package com.page.dao;

import com.page.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:44 2020/2/23
 */
@Mapper
public interface MovieMapper {

    @Select("select * from movie")
    List<Movie> pageAll();
}

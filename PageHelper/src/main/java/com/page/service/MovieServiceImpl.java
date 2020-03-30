package com.page.service;

import com.page.dao.MovieMapper;
import com.page.entity.Movie;
import com.page.page.PageRequest;
import com.page.page.PageResult;
import com.page.page.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:53 2020/2/23
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }

    /*调用分页插件完成分页*/
    private PageInfo<Movie> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Movie> sysMenus = movieMapper.pageAll();
        return new PageInfo<Movie>(sysMenus);
    }
}

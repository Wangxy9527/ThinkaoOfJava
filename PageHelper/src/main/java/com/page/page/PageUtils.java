package com.page.page;

import com.github.pagehelper.PageInfo;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:55 2020/2/23
 */
public class PageUtils {

    /*将分页信息封装到统一的接口*/
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}

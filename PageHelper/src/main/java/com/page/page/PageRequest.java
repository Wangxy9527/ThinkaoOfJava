package com.page.page;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:51 2020/2/23
 */
public class PageRequest {

    /*当前页码*/
    private int pageNum;

    /*每页数量*/
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

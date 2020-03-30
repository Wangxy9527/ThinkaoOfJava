package com.page.service;

import com.page.page.PageRequest;
import com.page.page.PageResult;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:47 2020/2/23
 */
public interface MovieService {

    PageResult findPage(PageRequest pageRequest);
}

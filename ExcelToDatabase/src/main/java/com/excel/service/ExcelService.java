package com.excel.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 22:56 2020/2/12
 */
public interface ExcelService {
    /*Excel导入到数据库*/
    boolean getExcel(MultipartFile file) throws Exception;
    /*数据库导出到Excel*/
    void exportExcel(HttpServletResponse response) throws IOException;
}

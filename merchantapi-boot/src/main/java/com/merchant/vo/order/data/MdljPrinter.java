package com.merchant.vo.order.data;

import lombok.Data;
import lombok.ToString;

/**
 * Description: 美达罗技打印机得实体类
 *
 * @author wangyf
 * @date 2019/6/20
 */
@Data
@ToString
public class MdljPrinter {

    /**
     * wifi mac 地址
     */
    private String wifiMac;

    /**
     * gprs mac 地址
     */
    private String gprsMac;

    /**
     * 打印内容
     *
     * 标签格式
     */
    private String content;
}

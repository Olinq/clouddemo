package com.hokli.sentinelservice.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hokli.common.CommonResult;

/**
 * 自定义处理器方法需要静态修饰 static
 */
public class CustomBlockHandler {

    public static CommonResult handleException(BlockException exception){
        return new CommonResult("自定义限流信息",200);
    }
}

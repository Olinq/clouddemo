package com.hokli.hystrixservice.service;

import com.hokli.common.CommonResult;
import com.hokli.model.User;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.concurrent.Future;

public interface UserService {
    public CommonResult getUser(Long id);

    public CommonResult getDefaultUser(@PathVariable Long id);
    CommonResult getUserCommand(@PathVariable Long id);
    CommonResult getUserException(Long id);
    CommonResult getDefaultUser2(@PathVariable Long id, Throwable e);
    CommonResult getUserCache(Long id);
    CommonResult removeCache(Long id);
    Future<User> getUserFuture(Long id);
    List<User> getUserByIds(List<Long> ids);
}
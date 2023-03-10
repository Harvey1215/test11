package com.xhw.pojo.mapper;
import com.xhw.pojo.user;

public interface userMapper {

    public user findById(int id);
    public Integer findTotal();
    public void addUser();


}

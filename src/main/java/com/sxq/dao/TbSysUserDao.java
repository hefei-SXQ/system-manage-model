package com.sxq.dao;

import com.sxq.entity.TbSysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TbSysUserDao {
    @Insert("insert into tb_sys_user(login_name,password,real_name,org_id,phone_no,email,qq,creator,create_time,status) " +
            "values (#{loginName},#{password},#{realName},#{orgId},#{phoneNo},#{email},#{qq},#{creator},#{createTime}," +
            "#{status}) ")
    int add(TbSysUser tbSysUser);

    List<TbSysUser> getUsers();
}

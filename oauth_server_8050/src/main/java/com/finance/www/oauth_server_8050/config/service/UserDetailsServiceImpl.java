package com.finance.www.oauth_server_8050.config.service;

import com.finance.www.oauth_server_8050.pojo.TbPermission;
import com.finance.www.oauth_server_8050.service.MemeberService;
import com.finance.www.oauth_server_8050.service.TbPermissionService;
import com.finance.www.pojo.Memeber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/30 11:45
 * @description ：
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    MemeberService memeberService;

    @Autowired
    TbPermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 通过用户名获取用户信息
        Memeber memeber = memeberService.findAllByUsername(username);

        boolean isUserExist = memeber != null;

        if (isUserExist) {

            // 创建spring security用户和对应的权限（从数据库查找）
            List<TbPermission> tbPermissions = permissionService.selectAllByMemberId((long) memeber.getId());

            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            // 声明用户授权
            tbPermissions.forEach(tbPermission -> {

                // 遍历权限添加
                if (tbPermission != null && tbPermission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
            return new User(memeber.getId().toString(), memeber.getPassword(), grantedAuthorities);
        } else {
            return null;
        }
    }
}
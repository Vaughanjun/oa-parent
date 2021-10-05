package cn.rybob.oa.auth.mapper;

import cn.rybob.oa.auth.model.Authorization;

public interface AuthorizationMapper {
    void authorize(Authorization authorization);

    Authorization findById(Long id);

    void unauthorize(Long id);
}

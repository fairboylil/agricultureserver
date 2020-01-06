package com.hbgc.agricultureserver.service;

import com.hbgc.agricultureserver.domain.Users;
import com.hbgc.agricultureserver.repository.UsersRepository;

public interface UsersService extends BaseService<Users,Integer, UsersRepository> {

    public Users login(String username, String password);

    public Users findMobile(String mobile);

}

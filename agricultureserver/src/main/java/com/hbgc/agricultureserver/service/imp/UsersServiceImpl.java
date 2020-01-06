package com.hbgc.agricultureserver.service.imp;

import com.hbgc.agricultureserver.domain.Users;
import com.hbgc.agricultureserver.repository.UsersRepository;
import com.hbgc.agricultureserver.service.UsersService;
import org.springframework.stereotype.Service;


@Service
public class UsersServiceImpl extends BaseServiceImpl<Users,Integer, UsersRepository> implements UsersService {

    @Override
    public Users login(String username, String password) {
        return super.dao.findByUsernameAndPassword(username,password);
    }

    @Override
    public Users findMobile(String mobile) {
        return super.dao.findUsersByMobile(mobile);
    }
}

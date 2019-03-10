package com.ramostear.application.service.impl;

import com.ramostear.application.model.User;
import com.ramostear.application.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ramostear
 * @create-time 2019/3/11 0011-4:29
 * @modify by :
 * @since:
 */
@Service(value="userService")
public class UserServiceImpl implements UserService {

    private static Map<Long,User> userRepo = new HashMap<>();

    @PostConstruct
    public void initUserRepo(){
        User admin = new User();
        admin.setId(1).setName("admin");
        userRepo.put(admin.getId(),admin);

        User editor = new User();
        editor.setId(2).setName("editor");
        userRepo.put(editor.getId(),editor);
    }
    @Override
    public void create(User user) {
        userRepo.put(user.getId(),user);
    }

    @Override
    public void update(long id, User user) {
        userRepo.remove(id);
        user.setId(id);
        userRepo.put(id,user);
    }

    @Override
    public void delete(long id) {
        userRepo.remove(id);
    }

    @Override
    public Collection<User> findAll() {
        return userRepo.values();
    }
}

package ghf.impl.service;

import ghf.impl.entity.User;
import ghf.impl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ghf.demo.service
 *
 * @Author : Gaohf
 * @Description :
 * @Date : 2017/11/14
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(String id){
        return userRepository.getOne(id);
    }
}

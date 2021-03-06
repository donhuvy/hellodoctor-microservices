package com.hellodoctor.patient.account.mappers;

import com.hellodoctor.patient.account.models.UserDetail;
import com.hellodoctor.patient.account.models.UserRegister;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    UserDetail getUserDetailById(@Param("userId") Long userId);

    boolean insertUser(UserRegister user);

    boolean updateUserInformation(UserDetail user);

}

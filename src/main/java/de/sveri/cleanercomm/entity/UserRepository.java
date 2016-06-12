package de.sveri.cleanercomm.entity;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByUserName(String name);
    User findOneByEmail(String email);
    User findOneByUserNameOrEmail(String username, String email);
    User findOneByToken(String token);
    
    @Modifying
    @Transactional
    @Query("update User u set u.email = :email "
            + "where u.userName = :userName")
    int updateUser(
            @Param("userName") String userName, 
            @Param("email") String email);
    
    @Modifying
    @Transactional
    @Query("update User u set u.lastLogin = CURRENT_TIMESTAMP where u.userName = ?1")
    int updateLastLogin(String userName);
    
}
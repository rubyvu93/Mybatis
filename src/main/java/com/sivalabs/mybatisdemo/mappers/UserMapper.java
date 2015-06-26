package com.sivalabs.mybatisdemo.mappers;

import java.util.List;
import com.sivalabs.mybatisdemo.domain.*;

public interface UserMapper {
	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUser(Integer userId);

	public User getUserById(Integer userId);

	public List<User> getAllUsers();
}

package org.example.backstudy.Service.User;

import org.example.backstudy.DTO.UserDTO;

import java.util.List;

public interface UserService {
  String signUp(UserDTO userDTO);
  List<UserDTO> getUsers();
  UserDTO getMydata(String id);
  UserDTO UpdateUser(UserDTO userDTO);
}

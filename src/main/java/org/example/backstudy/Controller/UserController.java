package org.example.backstudy.Controller;

import org.example.backstudy.DTO.UserDTO;
import org.example.backstudy.Service.User.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/signUp") // 회원 가입
  public String signUp(@RequestBody UserDTO userDTO) {
    return userService.signUp(userDTO);
  }

  @GetMapping("/getUsers")  // 모든 유저 조회
  public List<UserDTO> getUsers() {
    return userService.getUsers();
  }

  @PutMapping("/Update")  // 유저 데이터 수정(토큰으로 검증)
  public String updateUser(@RequestBody UserDTO userDTO) {
    return "";
  }

  @DeleteMapping("/delete") // 유저 데이터 삭제(토큰으로 검증)
  public String deleteUser(@RequestBody UserDTO userDTO) {
    return "";
  }




}

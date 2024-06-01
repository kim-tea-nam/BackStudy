package org.example.backstudy.Service.User;

import lombok.RequiredArgsConstructor;
import org.example.backstudy.DTO.UserDTO;
import org.example.backstudy.Entity.UserEntity;
import org.example.backstudy.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor  // 클래스 내의 final로 선언된 필드들에 대한 생성자가 자동으로 생성
@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override // 회원 가입
  public String signUp(UserDTO userDTO) {

    UserEntity user = userDTO.toEntity();
    if(user == null) {
      return "유저 데이터 없음";
    }
    userRepository.save(user);
    // 토큰 만들어서 발급해주기

    return "회원가입 성공";
  }

  @Override // 모든 유저 조회
  public List<UserDTO> getUsers() {
    if(userRepository.count() == 0) {
      throw new IllegalStateException("조회 가능한 유저가 없습니다.");
    }
    return userRepository.findAll().stream()
        .map(UserDTO::formEntity)
        .collect(Collectors.toList());
  }

    @Override // 토큰으로 자신의 데이터 조회
    public UserDTO getMydata(String id) {
      return null;
    }

  @Override
  public UserDTO UpdateUser(UserDTO userDTO) {
    return null;
  }


}

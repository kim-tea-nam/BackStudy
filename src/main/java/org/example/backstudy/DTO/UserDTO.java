package org.example.backstudy.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.backstudy.Entity.UserEntity;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

  private Long user_id;
  private String user_name;
  private String password;
  private String email;
  private String role;


  // UserEntity를 DTO로 변환
  public static UserDTO formEntity(UserEntity user) {
    return UserDTO.builder()
        .user_id(user.getUser_id())
        .user_name(user.getUser_name())
        .password(user.getPassword())
        .email(user.getEmail())
        .role(user.getRole())
        .build();
  }

  // DTO를 UserEntity로 변환
  public UserEntity toEntity() {
    return UserEntity.builder()
        .user_id(this.user_id)
        .user_name(this.user_name)
        .password(this.password)
        .email(this.email)
        .role(this.role)
        .build();
  }

}

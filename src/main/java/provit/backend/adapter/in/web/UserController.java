package provit.backend.adapter.in.web;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import provit.backend.adapter.out.persistence.entity.UserEntity;
import provit.backend.adapter.out.persistence.repository.UserRepository;
import provit.backend.application.port.in.LoginUseCase;
import provit.backend.application.port.in.dto.*;
import provit.backend.application.port.in.RegistUseCase;
import provit.backend.application.util.TokenProvider;

import java.util.Collections;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final RegistUseCase registUseCase;
    private final LoginUseCase loginUseCase;
    //test
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final TokenProvider tokenProvider;

    @PostMapping("/regist")
    public ResponseEntity<UserDto> regist(@RequestBody SignUpReq request){
        log.info(request.toString());
        UserDto userDto =  UserDto.builder()
                .email(request.email)
                .name(request.name)
                .userId(request.userId)
                .password(request.password)
//                .password(passwordEncoder.encode(req.password)) pwd 암호화
                .birth(request.userId)
                .marketing(request.marketing)
                .build();
        return ResponseEntity.ok(registUseCase.registUser(userDto));

    }
    @PostMapping("/login")
    public String login(@RequestBody LoginReq request){
        log.info(request.toString());
        return loginUseCase.login(request);
    }
    
    //권한 접근 테스트
    @PostMapping("/authTest")
    public String test(HttpServletRequest request){
        return "ok";
    }
}
package provit.backend.application.port.in.dto;

public class SignUpReq {
    public String email;
    public String name;
    public String userId;
    public String password;
    public String birth;
    public String marketing;

    @Override
    public String toString() {
        return "SignUpRequest{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", birth='" + birth + '\'' +
                ", marketing='" + marketing + '\'' +
                '}';
    }
}

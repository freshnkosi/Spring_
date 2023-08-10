package tacos.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.Data;
import tacos.User;

@Data
public class RegistrationForm {

	private String username;
	private String password;
	private String role;

	public User toUser(PasswordEncoder passwordEncoder) {

		return new User(username, passwordEncoder.encode(password), role);
	}

}

package example.cashcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;

@EnableMethodSecurity
@SpringBootApplication
public class CashCardApplication {

	@Bean
	SecurityFilterChain appSecurity(HttpSecurity httpSecurity, AuthenticationEntryPoint entryPoint)
			throws Exception {
		httpSecurity
				.authorizeHttpRequests((authorize) -> authorize
						.requestMatchers(HttpMethod.GET,"/cashcards/**").hasAuthority("SCOPE_cashcard:read")
						.requestMatchers("/cashcards/**").hasAuthority("SCOPE_cashcard:write")
						.anyRequest().authenticated()
				)
				.oauth2ResourceServer((oauth2) -> oauth2
						.authenticationEntryPoint(entryPoint)
						.jwt(Customizer.withDefaults())
				);
		return httpSecurity.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(CashCardApplication.class, args);
	}

}

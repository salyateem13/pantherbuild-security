package gsu.cis4280.security.pantherbuildsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class PantherbuildSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PantherbuildSecurityApplication.class, args);
	}

	public CorsFilter corsFilter() {

		
		final CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("DELETE");
		
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource ();
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}
}

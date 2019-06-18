package com.example.me.jwt;

import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;


@Component("userDetailsService")
public class DomainUserDetailsService implements UserDetailsService {


//    private final UserRepository userRepository;

	public DomainUserDetailsService(/* UserRepository userRepository */) {
//        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String login) {

//        if (new EmailValidator().isValid(login, null)) {
//            return userRepository.findOneWithAuthoritiesByEmail(login)
//                .map(user -> createSpringSecurityUser(login, user))
//                .orElseThrow(() -> new UsernameNotFoundException("User with email " + login + " was not found in the database"));
//        }
//
//        String lowercaseLogin = login.toLowerCase(Locale.ENGLISH);
//        return userRepository.findOneWithAuthoritiesByLogin(lowercaseLogin)
//            .map(user -> createSpringSecurityUser(lowercaseLogin, user))
//            .orElseThrow(() -> new UsernameNotFoundException("User " + lowercaseLogin + " was not found in the database"));

    	return new org.springframework.security.core.userdetails.User("admin", "$2a$10$5wRu9IMNsi0.Ec6KYmTzO.USEDsS3YXr5NkUDnhup1MXKxblXTi.C", Arrays.asList(new SimpleGrantedAuthority("ADMIN")));
    	
    	
    }

//    private org.springframework.security.core.userdetails.User createSpringSecurityUser(String lowercaseLogin, User user) {
//        if (!user.getActivated()) {
//        	//throw exception here
////            throw new UserNotActivatedException("User " + lowercaseLogin + " was not activated");
//        	
//        }
//        List<GrantedAuthority> grantedAuthorities = user.getAuthorities().stream()
//            .map(authority -> new SimpleGrantedAuthority(authority.getName()))
//            .collect(Collectors.toList());
//        return new org.springframework.security.core.userdetails.User(user.getLogin(),
//            user.getPassword(),
//            grantedAuthorities);
//    }
}

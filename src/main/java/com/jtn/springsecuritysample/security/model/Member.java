package com.jtn.springsecuritysample.security.model;

import com.jtn.springsecuritysample.domain.model.MemberNumber;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class Member extends User {
    public Member(
            String username,
            String password,
            Collection<? extends GrantedAuthority> authorities
    ) {
        super(username, password, authorities);
    }

    public MemberNumber id() {
        return new MemberNumber(this.getUsername());
    }
}

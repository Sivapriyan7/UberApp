package com.codingshuttle.project.uber.uberApp.services.impl;

import com.codingshuttle.project.uber.uberApp.entities.SessionToken;
import com.codingshuttle.project.uber.uberApp.entities.User;
import com.codingshuttle.project.uber.uberApp.repositories.SessionTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SessionServiceImpl {

    private final SessionTokenRepository sessionTokenRepository;

    public SessionToken createSession(User user){
        int activeSessions = sessionTokenRepository.countByUser(user);

        if(activeSessions >= user.getSessionLimit()){
            removeOldestSession(user);
        }
        SessionToken sessionToken = SessionToken.builder()
                .user(user)
                .token()


    }

    private void removeOldestSession(User user){
        List<SessionToken> sessions = sessionTokenRepository.findByUserOrderByExpiryDateAsc(user);
        if(!sessions.isEmpty())
        {
            sessionTokenRepository.delete(sessions.get(0));
        }
    }

    public void removeSession(String token){
        sessionTokenRepository.deleteByToken(token);
    }
}

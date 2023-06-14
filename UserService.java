package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificacionService notificacionService;

    public UserService(NotificacionService notificacionService){
        this.notificacionService = notificacionService;
    }
}

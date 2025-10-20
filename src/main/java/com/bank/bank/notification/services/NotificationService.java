package com.bank.bank.notification.services;

import com.bank.bank.auth_users.entity.User;
import com.bank.bank.notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, User user);
}

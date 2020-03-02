package com.dvlnitins.friends.Notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Token {
    private String token;

    public Token(String token) {
        this.token = token;
    }

    public Token() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
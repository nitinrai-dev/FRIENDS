package com.dvlnitins.friends.Notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Sender {
    public Data data;
    public String to;

    public Sender(Data data, String to) {
        this.data = data;
        this.to = to;
    }
}
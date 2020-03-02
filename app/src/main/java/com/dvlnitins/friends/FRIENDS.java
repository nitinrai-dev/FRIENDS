package com.dvlnitins.friends;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class FRIENDS extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

}}

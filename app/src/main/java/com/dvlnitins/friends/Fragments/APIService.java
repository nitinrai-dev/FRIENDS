package com.dvlnitins.friends.Fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dvlnitins.friends.Notifications.MyResponse;
import com.dvlnitins.friends.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAb-4KokE:APA91bGl2i1U5ZMbFC9EMRUPmECIDNsLIF9z5k-SL95RSKInyX2hkS8fMQDTagJSBIKlYpqw6gBO9xPB3s6ldnniLvRG597VCeskR5wj-KLaCNulFQ458nh3_kTeEW24W0cFLiJlZ4e_"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
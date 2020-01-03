package com.example.app_deepanshu.api;

import com.example.app_deepanshu.StudentLoginResponse;
import com.example.app_deepanshu.models.DefaultResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("/account/student/create")
    Call<DefaultResponse> createUser(
            @Field("aadhar") String aadhar,
            @Field("password") String password,
            @Field("email") String email,
            @Field("first_name") String first_name,
            @Field("father_name") String father_name,
            @Field("father_aadhar") String father_aadhar,
            @Field("mobile_number") String mobile_number,
            @Field("address") String address,
            @Field("state") String state
    );
    @FormUrlEncoded
    @POST("/account/rest-auth/login/")
    Call<StudentLoginResponse> userLogin(
            @Field("username") String username,
            @Field("password") String password
    );
    @GET("/account/rest-auth/login/")
    Call<StudentLoginResponse> getUser(@Header("Authorization") String authToken);


}